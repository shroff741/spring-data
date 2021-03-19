pipeline {
	environment { 
        registry = "shroff741/spring161" 
        registryCredential = 'DockerHub' 
        dockerImage = '' 
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
                    echo "Code Checkout from ${params.branch} *******"
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
                    dockerImage = docker.build registry + ":$BUILD_NUMBER" 
                }
            } 
        }
        stage('Deploy our image') { 
            steps { 
                script { 
                    docker.withRegistry( '', registryCredential ) { 
                        dockerImage.push() 
                    } 
                } 
            }
        } 
    }
     
}
