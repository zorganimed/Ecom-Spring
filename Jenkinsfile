pipeline{
    agent any
    tools{
        maven 'MyMaven'
        jdk 'MyJDK'
    }
    stages{
        stage('Git clone'){
            steps{
                git 'https://github.com/zorganimed/Ecom-Spring.git'
            }
        }
        stage('Create Dockerimage'){
            steps{
                sh 'docker build -t ecom-jenkins-image .'
            }
        }
        
    }
    
}
