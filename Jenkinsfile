pipeline {
  agent any

  stages {
    stage('Build') {
      steps{
         bat "./mvnw clean compile"
      }
    }
    stage ('Test'){
      steps{
         bat "mvn test"
     }
    }

  }
}