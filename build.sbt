name := "spark-statestore-rocksdb"

val sparkVersion = "2.4.3"

//scalaVersion := "2.12.8"
scalaVersion := "2.11.12"

val rocksDBVersion = "6.2.2"

version := "2.4.3"

javacOptions ++= Seq("-source", "1.8")

scalacOptions += "-target:jvm-1.8"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sparkVersion,
  "org.rocksdb" % "rocksdbjni" % rocksDBVersion,
  "junit" % "junit" % "4.12" % Test,
  "org.scalatest" %% "scalatest" % "3.0.6" % Test
)

