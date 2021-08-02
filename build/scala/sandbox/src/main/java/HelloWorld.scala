import org.apache.spark.sql.SparkSession


object Hello extends App {
  val spark = SparkSession
    .builder()
    .appName("Spark SQL basic example")
    .config("spark.master", "local")
    .getOrCreate()
  
  import spark.implicits._

  val df = spark.read.json("src/main/resources/people.json")
  df.show()

  println("Hello, World!")
}
