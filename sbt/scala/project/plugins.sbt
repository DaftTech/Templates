logLevel := Level.Warn

resolvers := Seq("Artifactory" at "http://lolhens.no-ip.org/artifactory/libs-release/")

addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "5.0.1")

addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.1.4")

addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.3")
