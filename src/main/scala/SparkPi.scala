import org.apache.spark.{SparkConf, SparkContext}

import scala.math.random

object SparkPi {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("Spark Pi")
    val sc = new SparkContext(conf)

    val n = 10000
    val count = sc.parallelize(1 until n).map { _ =>
      val x = random * 2 - 1
      val y = random * 2 - 1
      if (x * x + y * y <= 1) 1 else 0
    }.reduce(_ + _)
    println("Pi is roughly " + 4.0 * count / (n - 1))
  }
}
