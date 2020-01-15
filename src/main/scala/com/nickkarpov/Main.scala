package com.nickkarpov

import org.apache.spark.sql.SparkSession

object Main {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder().getOrCreate()
    spark.range(0,1000).collect()
  }
}