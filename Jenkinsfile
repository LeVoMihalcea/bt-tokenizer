pipeline{
    agent any

    triggers {
        pollSCM '* * * * *'
    }

    stages {
        stage('Compile Stage'){
            steps{
                withMaven(maven: 'maven_3_6_3') {
                    sh 'mvn clean compile'
                }
            }
        }

        stage('Tests'){
            steps{
                withMaven(maven: 'maven_3_6_3') {
                    sh 'mvn test'
                }
            }
        }
    }
}
