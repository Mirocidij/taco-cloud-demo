pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                git 'https://github.com/Mirocidij/taco-cloud-demo'
                sh './mvnw clean compile'
            }
        }

        stage('Test') {
            steps {
                sh './mvnw test'
            }

            post {
                always {
                    junit '**/target/surefire-reports/TEST-*.xml'
                }
            }
        }
    }
}