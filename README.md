# zscala

#===============================
# Build and Run
$ git clone git@github.com:skuo/zscala.git
$ cd zscala
$ sbt package
$ find . -name "*.jar" -print
./target/scala-2.11/zscala-project_2.11-1.0.jar
$ scala -cp ./target/scala-2.11/zscala-project_2.11-1.0.jar HelloWorld 

#===============================
# SBT
$ sbt
> run-main HelloWorld
