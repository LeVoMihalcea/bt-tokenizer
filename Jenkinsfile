pipeline{
    agent any

    stages {
        stage('Compile Stage'){
            steps{
                withMaven{
                    sh 'mvn clean compile'
                }
            }
        }

        stage('Tests'){
            steps{
                withMaven{
                    sh 'mvn test'
                }
            }
        }

        stage('Deployment'){
            steps{
                withMaven{
                    sh 'mvn spring-boot:run'
                }
            }
        }
    }
}
