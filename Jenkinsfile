pipeline {
  agent any
  tools{
    maven "3.6.3"
  }
  stages {
    stage('Build') {
      steps{
         sh "mvn clean compile"
      }
    }
    stage ('Test'){
      steps{
         sh "mvn test"
     }
    }

  }
}