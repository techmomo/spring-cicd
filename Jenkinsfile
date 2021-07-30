pipeline {
   agent any

   triggers{
       pollSCM '* * * * *'
   }
   stages {
      stage('Build') {
         steps {
            git 'https://github.com/techmomo/spring-cicd'
            sh "./mvnw clean install -DskipTests=true"
         }
      }
      stage('Docker'){
          steps{
              sh 'docker build -t spring-ci:v1 .'
          }
      }
      stage('Deploy'){
          steps{
              sh 'docker-compose up &'
          }
      }
   }
}
