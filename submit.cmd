REM SPARK_LOCAL_IP and SPARK_MASTER_IP should be in the same network segment
set SPARK_LOCAL_IP=%1
set SPARK_MASTER_IP=%2
spark-submit --class SparkPi --master spark://%SPARK_MASTER_IP%:7077 target\spark-maven-template-1.0-SNAPSHOT.jar