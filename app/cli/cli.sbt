name := "bitcoin-s-cli"

libraryDependencies ++= Deps.cli

graalVMNativeImageOptions += "-H:EnableURLProtocols=http"

enablePlugins(JavaAppPackaging, GraalVMNativeImagePlugin)

publish / skip := true