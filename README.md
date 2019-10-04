## RocksDB state storage

This is a repackage of implementation https://issues.apache.org/jira/browse/SPARK-28120, 
RocksDB state storage, in order to use it with current spark 2.4.x release. 

### How to use
1. Use "sbt package" to build jar, copy the jar file and rocksdbjni.jar to spark library
2. Let spark to use the it, by set "spark.sql.streaming.stateStore.providerClass" to "org.apache.spark.sql.execution.streaming.state.rocksdb.RocksDbStateStoreProvider"
 
### License Apache License Version 2.0

### Reference
[Original Pull request] (https://github.com/apache/spark/pull/24922)
