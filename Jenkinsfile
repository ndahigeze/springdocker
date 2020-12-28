pipeline {
  agent any
  stages {
    stage('build') {
      steps {
       withMaven(maven: 'mvn_3_6_3'){
         bat "./mvnw clean compile"
       }
      }
    }

  }
}