package helloworld

import org.apache.spark.sql.SparkSession

 // prints helloworld to screen
object HelloWorld {
   def main(args: Array[String]): Unit ={
     val spark = SparkSession
       .builder
       .appName("Hello World")
       .getOrCreate()

     if (args(0) > 0) {
       val personName = args(0)
       println(s"Hello, $personName")
     }
     else {
       println("Hello, world!")
     }
     println("Spark version:      " + sc.version)
     println("Spark master:       " + sc.master)
     println("Running 'locally'?: " + sc.isLocal)
     println(s"Spark version:    $spark.SparkContext.version")
     println(s"Spark master:     $spark.SparkContext.master")
     println(s"Running locally:   $spark.SparkContext.isLocal()")
     spark.stop()
   }
}



