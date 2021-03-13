pipeline{
    agent any

    stages {
        stage('Build'){
            steps{
                withMaven{
                    sh 'mvn clean package'
                }
            }
        }

        stage('Deployment'){
            steps{
                sh '''
                        docker build -t bt-tokenizer .
                        docker run -d bt-tokenizer
                '''
            }
        }
    }
}
