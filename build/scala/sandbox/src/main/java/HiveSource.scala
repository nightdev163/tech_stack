import java.io.File

import org.apache.spark.sql.{Row, SaveMode, SparkSession}


object HiveSource extends App {
  case class Record(key: Int, value: String)

  val warehouseLocation = new File("spark-warehouse").getAbsolutePath

  val spark = SparkSession
    .builder()
    .appName("Spark Hive Example")
    .enableHiveSupport()
    .config("spark.sql.warehouse.dir", warehouseLocation)
    .getOrCreate()

  import spark.implicits._
  import spark.sql

  sql("CREATE TABLE IF NOT EXISTS src (key INT, value STRING) USING hive")
  sql("LOAD DATA LOCAL INPATH 'src/main/resources/kv1.txt' INTO TABLE src")

  sql("SELECT * FROM src").show()

  // Queries are expressed in HiveQL
  //sql("SELECT * FROM src").show()

  println("example end")
}
