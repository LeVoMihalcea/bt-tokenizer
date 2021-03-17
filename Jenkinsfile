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
                        docker stop bt-tokenizer || true && docker rm bt-tokenizer || true
                        docker image rm bt-tokenizer
                        docker build -t bt-tokenizer .
                        docker run -d --restart unless-stopped --name bt-tokenizer bt-tokenizer
                '''
            }
        }
    }
}
