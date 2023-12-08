pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/RaymondYnoa/SICT_Final_Project.git'
            }
        }

        stage('Build') {
            steps {
                script {
                    // Use 'call' to execute commands, which works on both Windows and Unix-like systems
                    bat 'mvn clean install'
                }
            }
        }

        stage('Test') {
            steps {
                script {
                    bat 'mvn test'
                }
            }
        }

        stage('Deploy') {
            steps {
                script {
                    // Modify deployment commands as needed
                    bat 'docker build -t employee-management-system .'
                    bat 'docker push employee-management-system'
                }
            }
        }
    }
}
