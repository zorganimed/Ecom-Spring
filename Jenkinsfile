pipeline{
    agent any
    tools{
        maven 'MyMaven'
        jdk 'MyJDK'
        //zorganimed
       //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
    }
    stages{
        stage('Git clone'){
            steps{
                git 'https://github.com/zorganimed/Ecom-Spring.git'
            }
        }
        stage('Build'){
            steps{
                sh 'mvn package'
            }
        }
        stage('Create Dockerimage'){
            steps{
                sh 'docker build -t ecom-jenkins-image-mi .'
            }
        }
        
    }
    
}
