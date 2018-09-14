import org.apache.spark.{SparkConf, SparkContext}

object WordCount {
  def main(args: Array[String]): Unit = {
    //Create a SparkContext to initialize Spark
    val conf = new SparkConf()
    conf.setMaster("local")
    conf.setAppName("Word Count")
    val sc = new SparkContext(conf)

    /*
    Load the text file into a Spark RDD.
    Note:
    If we are running locally, we must use the full local path of our file.
    If we are running in a spark cluster, we must format the file's path depending on our filesystem (HDFS, S3, etc)
     */
    val textFile = sc.textFile("quijote.txt")

    // Perform the word count
    val counts = textFile.flatMap(line => line.split(" "))
      .map(word => (word, 1))
      .reduceByKey(_ + _)

    // Display the count
    counts.foreach(println)
    println("Total words: " + counts.count())

    // Save the computation result
    counts.saveAsTextFile("quijoteCount")



  }
}
