#!/usr/bin/env bash
SPARK_MASTER_IP=$1
spark-submit --class SparkPi --master spark://${SPARK_MASTER_IP}:7077 target/spark-maven-template-1.0-SNAPSHOT.jar
