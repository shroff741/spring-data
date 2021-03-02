pipeline {
	environment { 
        registry = "shroff741/spring151" 
        registryCredential = 'DockerHub' 
        dockerimage = '' 
    }
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
        stage('Building our image') { 
            steps { 
                script { 
                    dockerimage = docker.build registry + ":$BUILD_NUMBER" 
                }
            } 
        }
        stage ('Image run') {
        	steps {
        		bat 'docker run dockerImage'
        	}
        }
    }
     
}