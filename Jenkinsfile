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
                        docker-compose -f /opt/bt-tokenizer/docker-compose.yml down || true
                        docker image rm bt-tokenizer
                        docker build -t bt-tokenizer .
                        docker-compose -f /opt/bt-tokenizer/docker-compose.yml up -d
                '''
            }
        }
    }
}
