import org.apache.spark.{SparkConf, SparkContext}

object HelloWorld {
  def main(args: Array[String]): Unit = {
    // Create SparkContext to initialize Spark
    val conf = new SparkConf()
    conf.setMaster("local")
    conf.setAppName("Hello World")
    val sc = new SparkContext(conf)


  }

}
