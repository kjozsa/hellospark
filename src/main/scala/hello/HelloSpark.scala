package hello

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object HelloSpark extends App {
  val master = "local[2]"
  val conf = new SparkConf().setAppName("hello").setMaster(master)
  val sc = new SparkContext(conf)

  try {
    val file = sc.textFile("build.sbt")
    val counts: RDD[Int] = file.map(s => s.split("(\\s\\(\\))").length)

    println(counts.reduce(_ + _))
  } finally {
    sc.stop
  }
}
