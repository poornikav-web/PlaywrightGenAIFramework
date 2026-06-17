pipeline {
    agent any
      tools {
            maven 'AutomationMaven'
        }
    stages {
        stage('Build and Test') {
            steps {
                sh 'pwd'
                sh 'ls'
                sh 'mvn clean test'
            }
        }
    }
}