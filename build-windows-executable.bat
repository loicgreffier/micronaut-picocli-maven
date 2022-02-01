SET JAVA_HOME=%GRAALVM_HOME%
"C:\Program Files (x86)\Microsoft Visual Studio\2017\BuildTools\VC\Auxiliary\Build\vcvars64.bat" && mvn clean package -DskipTests -Dpackaging=native-image