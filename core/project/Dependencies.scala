import sbt._

// format: OFF
object Version {

  val Akka          = "2.6.6"
  val AkkaHttp      = "10.1.12"
  val AkkaMgmt      = "1.0.8"
  val AlpakkaKafka  = "2.0.3"
  val Scala         = "2.12.11"
  val Spark         = "2.4.5"
  val Flink         = "1.10.0"
  val EmbeddedKafka = "2.5.0" 
  // skuber depends on 2.5.29
  val AkkaOperator  = "2.5.29"

}

object Library {
  // External Libraries
  val AkkaHttp               = "com.typesafe.akka"  %% "akka-http"                 % Version.AkkaHttp
  val AkkaHttpJackson        = "com.typesafe.akka"  %% "akka-http-jackson"         % Version.AkkaHttp
  val AkkaHttpSprayJson      = "com.typesafe.akka"  %% "akka-http-spray-json"      % Version.AkkaHttp
  val AkkaActor              = "com.typesafe.akka"  %% "akka-actor"                % Version.Akka
  val AkkaStream             = "com.typesafe.akka"  %% "akka-stream"               % Version.Akka
  val AkkaSlf4j              = "com.typesafe.akka"  %% "akka-slf4j"                % Version.Akka
  val AkkaStreamContrib      = "com.typesafe.akka"  %% "akka-stream-contrib"       % "0.10"
  val AkkaStreamKafka        = ("com.typesafe.akka" %% "akka-stream-kafka"         % Version.AlpakkaKafka) .exclude("com.fasterxml.jackson.core","jackson-databind") .exclude("com.fasterxml.jackson.module", "jackson-module-scala")
  val AkkaStreamKafkaTestkit = ("com.typesafe.akka" %% "akka-stream-kafka-testkit" % Version.AlpakkaKafka) .exclude("com.typesafe.akka", "akka-stream-testkit")
  val AkkaStreamTestkit      = "com.typesafe.akka"  %% "akka-stream-testkit"       % Version.Akka
  
  val AkkaSlf4jOperator         = "com.typesafe.akka" %% "akka-slf4j"                % Version.AkkaOperator
  val AkkaStreamOperator        = "com.typesafe.akka" %% "akka-stream"               % Version.AkkaOperator
  val AkkaStreamTestkitOperator = "com.typesafe.akka" %% "akka-stream-testkit"       % Version.AkkaOperator

  val AkkaCluster           = "com.typesafe.akka"     %% "akka-cluster"              % Version.Akka
  val AkkaManagement        = "com.lightbend.akka.management" %% "akka-management"   % Version.AkkaMgmt
  val AkkaClusterBootstrap  = "com.lightbend.akka.management" %% "akka-management-cluster-bootstrap" % Version.AkkaMgmt
  val AkkaDiscovery         = "com.typesafe.akka"     %% "akka-discovery"            % Version.Akka
  val AkkaDiscoveryK8       = "com.lightbend.akka.discovery" %% "akka-discovery-kubernetes-api" % Version.AkkaMgmt
  val EmbeddedKafkaOrg      = "io.github.embeddedkafka"
  val EmbeddedKafka         = EmbeddedKafkaOrg        %% "embedded-kafka"           % Version.EmbeddedKafka 
  val Ficus                 = "com.iheart"            %% "ficus"                    % "1.4.7"
  val JodaTime              = "joda-time"              % "joda-time"                % "2.10.6"
  val Config                = "com.typesafe"           % "config"                   % "1.3.4"
  val Logback               = "ch.qos.logback"         % "logback-classic"          % "1.2.3"
  val Slf4jLog4jBridge      = "org.slf4j"              % "slf4j-log4j12"            % "1.7.30"            

  val SprayJson              = "io.spray"              %% "spray-json"               % "1.3.5"
  val Bijection              = "com.twitter"           %% "bijection-avro"           % "0.9.6"

  val JacksonScalaModule     = "com.fasterxml.jackson.module" %% "jackson-module-scala" % "2.10.4"

  val Skuber                 = ("io.skuber"             %% "skuber"                   % "2.4.0") .exclude("com.fasterxml.jackson.core","jackson-databind")

  val Spark                 = "org.apache.spark"           %% "spark-core"           % Version.Spark
  val SparkJacksonDatabind  = "com.fasterxml.jackson.core"  % "jackson-databind"     % "2.6.7.3"
  val SparkMllib            = "org.apache.spark"           %% "spark-mllib"          % Version.Spark
  val SparkSql              = "org.apache.spark"           %% "spark-sql"            % Version.Spark
  val SparkSqlKafka         = "org.apache.spark"           %% "spark-sql-kafka-0-10" % Version.Spark
  val SparkStreaming        = "org.apache.spark"           %% "spark-streaming"      % Version.Spark
  val ScalaTestUnscoped     = "org.scalatest"              %% "scalatest"            % "3.0.8"
  val ScalaPbRuntime        = "com.thesamet.scalapb"       %% "scalapb-runtime"      % scalapb.compiler.Version.scalapbVersion
  val ScalaPbCompilerPlugin = "com.thesamet.scalapb"       %% "compilerplugin"       % scalapb.compiler.Version.scalapbVersion

  val Flink                  = "org.apache.flink"      %% "flink-scala"              % Version.Flink
  val FlinkStreaming         = "org.apache.flink"      %% "flink-streaming-scala"    % Version.Flink
  val FlinkAvro              = "org.apache.flink"       % "flink-avro"               % Version.Flink
  val FlinkKafka             = "org.apache.flink"      %% "flink-connector-kafka"    % Version.Flink

  val FastClasspathScanner  = "io.github.lukehutch"   %  "fast-classpath-scanner"   % "2.21"
  val ScalaCheck            = "org.scalacheck"        %% "scalacheck"               % "1.14.0"
  val Avro4sJson            = "com.sksamuel.avro4s"   %% "avro4s-json"              % "3.0.0"
  val Avro                  = "org.apache.avro"       %  "avro"                     % "1.8.2"
  // Test Dependencies
  val AkkaHttpTestkit        = "com.typesafe.akka"   %% "akka-http-testkit"          % Version.AkkaHttp     % Test
  val AkkaHttpSprayJsonTest  = AkkaHttpSprayJson                                                            % Test
  val Avro4sTest             = "com.sksamuel.avro4s" %% "avro4s-core"                % "3.0.0"              % Test
  val AkkaTestkit            = "com.typesafe.akka"   %% "akka-testkit"               % Version.Akka
  val ScalaTest              = ScalaTestUnscoped                                                            % Test
  val Junit                  = "junit"                % "junit"                      % "4.12"               % Test
  val JUnitInterface         = "com.novocode"         % "junit-interface"            % "0.11"               % Test
  val MockitoScala           = "org.mockito"         %% "mockito-scala-scalatest"    % "1.5.16"             % Test
}

// format: ON
