pipeline {
    agent any 
    tools {
        maven 'Maven_Home'
        jdk 'jdk8'
    }
    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }
        stage ('Code Checkout') {
            steps {
                
                git branch: 'test', url: 'https://github.com/shroff741/spring-data.git'
            }
        }
        stage ('Maven Build') {
            steps {
                bat "mvn -Dmaven.test.failure.ignore=true clean package"
            }
        }
        stage ('Build Docker Image') {
            agent {
                dockerfile true
            }
            steps {
                echo "Docker Image"
            }
        }
    }
     
}