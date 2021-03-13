pipeline{
    agent any

    stages {
        stage('Build'){
            steps{
                withMaven{
                    sh 'mvn clean compile'
                }
            }
        }

        stage('Deployment'){
            steps{
                sh '''
                        docker build -t bt-tokenizer .
                        docker run bt-tokenizer
                '''
            }
        }
    }
}
