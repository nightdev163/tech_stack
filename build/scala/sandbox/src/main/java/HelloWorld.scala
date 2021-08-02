import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.Row
import org.apache.spark.sql.types._


object Hello extends App {
  val spark = SparkSession
    .builder()
    .appName("Spark SQL basic example")
    .config("spark.master", "local")
    .getOrCreate()
  
  import spark.implicits._

  val df = spark.read.json("src/main/resources/people.json")

  /*println("dataframe show")
  df.show()

  println("printSchema")
  df.printSchema()

  println("select name show")
  df.select("name").show()

  println("select age + 1 show")
  df.select($"name", $"age" + 1).show()

  println("select age > 21 show")
  df.filter($"age" > 21).show()

  println("select age count show")
  df.groupBy("age").count().show()

  println("running sql queries");
  df.createOrReplaceTempView("people")
  val sqlDF = spark.sql("SELECT * from people")
  sqlDF.show()

  println("create global temp view")
  df.createGlobalTempView("people")
  spark.sql("SELECT * FROM global_temp.people").show()
  spark.newSession().sql("SELECT * FROM global_temp.people").show()*/

  case class Person(name: String, age: Long)

  /*
  val caseClassDS = Seq(Person("Andy", 32)).toDS()
  caseClassDS.show()

  val primitiveDS = Seq(1, 2, 3).toDS()
  primitiveDS.map(_ + 1).collect()
  primitiveDS.show();

  val path = "src/main/resources/people.json"
  val peopleDS = spark.read.json(path).as[Person]
  peopleDS.show()
  */



  /* val peopleDF = spark.sparkContext
    .textFile("src/main/resources/people.txt")
    .map(_.split(","))
    .map(attributes => Person(attributes(0), attributes(1).trim.toInt))
    .toDF()
  peopleDF.createOrReplaceTempView("people")
  val teenagersDF = spark.sql("SELECT name, age FROM people WHERE age BETWEEN 13 AND 19")

  println("show sql result[0]")
  teenagersDF.map(teenager => "Name: " + teenager(0)).show()

  println("show name list")
  teenagersDF.map(teenager => "Name: " + teenager.getAs[String]("name")).show()

  println("convert to map array")
  implicit val mapEncoder = org.apache.spark.sql.Encoders.kryo[Map[String, Any]]
  teenagersDF.map(teenager => teenager.getValuesMap[Any](List("name", "age"))).collect() */


  // Create an RDD
  val peopleRDD = spark.sparkContext.textFile("src/main/resources/people.txt")

  // The schema is encoded in a string
  val schemaString = "name age"

  // Generate the schema based on the string of schema
  val fields = schemaString.split(" ")
    .map(fieldName => StructField(fieldName, StringType, nullable = true))
  val schema = StructType(fields)

  // Convert records of the RDD (people) to Rows
  val rowRDD = peopleRDD
    .map(_.split(","))
    .map(attributes => Row(attributes(0), attributes(1).trim))

  // Apply the schema to the RDD
  val peopleDF = spark.createDataFrame(rowRDD, schema)

  // Creates a temporary view using the DataFrame
  peopleDF.createOrReplaceTempView("people")

  // SQL can be run over a temporary view created using DataFrames
  val results = spark.sql("SELECT name FROM people")

  // The results of SQL queries are DataFrames and support all the normal RDD operations
  // The columns of a row in the result can be accessed by field index or by field name
  results.map(attributes => "Name: " + attributes(0)).show()
}
