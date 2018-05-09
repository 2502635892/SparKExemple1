import org.apache.spark.{SparkConf,SparkContext}

object WordCount3 {
  def main(args:Array[String]): Unit ={
    val logFile ="/home/frank/Desktop/makeData"
    val conf = new SparkConf().setAppName("WordCount").setMaster("local")
    val sc = new SparkContext(conf)
    val logData = sc.textFile(logFile, 8).cache()
    val numAs = logData.filter(line => line.contains("p")).count()
    val numBs = logData.filter(line => line.contains("4")).count()
    println("Lines with a: %s, Lines with b: %s".format(numAs, numBs))
  }

}
