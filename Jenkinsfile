pipeline {
    agent any 
    tools {
        maven 'Maven_Home'
        jdk 'jdk8'
    }
    environment {
        JAR_PATH = 'C:/Users/ABC/.jenkins/workspace/FirstPipeline'
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
                bat "dir ${JAR_PATH}"
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