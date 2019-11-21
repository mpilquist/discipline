val scalaJSVersion =
  Option(System.getenv("SCALAJS_VERSION")).getOrElse("0.6.31")
val scalaNativeVersion =
  Option(System.getenv("SCALANATIVE_VERSION")).getOrElse("0.3.9")

addSbtPlugin("com.github.gseitz" % "sbt-release" % "1.0.12")
addSbtPlugin("io.crashbox"       % "sbt-gpg"     % "0.2.0")
addSbtPlugin("org.scala-js"      % "sbt-scalajs" % scalaJSVersion)
addSbtPlugin("org.scala-native"  % "sbt-scala-native" % scalaNativeVersion)
addSbtPlugin("org.xerial.sbt"    % "sbt-sonatype" % "3.8.1")
addSbtPlugin("org.portable-scala" % "sbt-scalajs-crossproject" % "0.6.1")
addSbtPlugin("org.portable-scala" % "sbt-scala-native-crossproject" % "0.6.1")
