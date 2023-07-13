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
        stage('Test'){
            steps{
                sh 'mvn test'
            }
        }
        stage('Build'){
            steps{
                sh 'mvn package'
            }
        }
        stage('Deploy'){
            steps{
                echo "deploy completed"
            }
        }
    }
    
}
