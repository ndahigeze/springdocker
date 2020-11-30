pipeline {
  agent any
  stages {
    stage('build') {
      steps {
       withMaven(maven: mvn_3_6_3){
         bat "./mvnw clean compile"
       }
      }
    }
    stage ('Testing Stage'){
     steps{
        withMaven(maven: 'maven_3_6_3'){
         bat "mvn test"
        }
     }
    }



  }
}