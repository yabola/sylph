#!/bin/bash

#JAVA11_HOME
echo JAVA11_HOME=$JAVA11_HOME
export JAVA_HOME=$JAVA11_HOME
export PATH=$JAVA11_HOME/bin:$PATH
java -version

./gradlew -v

./gradlew clean checkstyle licenseMain licenseTest assemble test "$@"
