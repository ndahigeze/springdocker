pipeline {
  agent any

  stages {
    stage('Build') {
      steps{
         sh "./mvnw clean compile"
      }
    }
    stage ('Test'){
      steps{
         sh "mvn test"
     }
    }

  }
}