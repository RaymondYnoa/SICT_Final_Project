pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Checkout your source code from version control (e.g., Git)
                git 'https://github.com/RaymondYnoa/SICT_Final_Project'
            }
        }

        stage('Build') {
            steps {
                // Build your Spring Boot application with Maven
                sh 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                // Run JUnit tests
                sh 'mvn test'
            }
        }

        stage('Deploy') {
            steps {
                // Deploy your application (e.g., using Docker or Kubernetes)
                sh 'docker build -t your_image_name .'
                sh 'docker push your_image_name'
              echo 'Deploying'
            }
        }
    }
}
