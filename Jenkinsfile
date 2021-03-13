pipeline{
    agent any

    stages {
        stage('Build'){
            steps{
                withMaven{
                    sh 'mvn clean install -DskipTests'
                }
            }
        }

        stage('Deployment'){
            steps{
                sh '''
                        docker build -t bt-tokenizer . --platform linux/arm/v7
                        docker run bt-tokenizer --platform linux/arm/v7
                '''
            }
        }
    }
}
