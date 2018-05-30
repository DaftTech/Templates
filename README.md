# Templates

## Recommended Scala Libraries
- `"io.monix" %% "monix" % "3.0.0-RC1"`
- `"org.http4s" %% "http4s-dsl" % "0.18.12"`
- `"org.http4s" %% "http4s-blaze-server" % "0.18.12"`
- `"org.http4s" %% "http4s-blaze-client" % "0.18.12"`
- `"com.lihaoyi" %% "fastparse" % "1.0.0"`
- `"com.lihaoyi" %% "scalatags" % "0.6.7"`

## Recommended Scala Compiler Plugins
- `"com.olegpy" %% "better-monadic-for" % "0.2.0"`

## Links
- [Universal Script](https://gist.github.com/LolHens/ee821a5cd1b2031856b21a0e78e1ecc9)
- [Universal Jar](https://gist.github.com/LolHens/d04e239a499df499df4d4499934764af)
- [Unpack JDK](https://gist.github.com/LolHens/aab6ff2df06f9a24b308aa9b43e0e196)

## Recommended Resolvers
```sbt
resolvers ++= Seq(
  "lolhens-maven" at "http://artifactory.lolhens.de/artifactory/maven-public/",
  Resolver.url("lolhens-ivy", url("http://artifactory.lolhens.de/artifactory/ivy-public/"))(Resolver.ivyStylePatterns)
)
```
