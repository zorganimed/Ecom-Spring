pipeline{
    agent any
    stages{
        stage('Git clone'){
            steps{
                git 'https://github.com/zorganimed/Ecom-Spring.git'
            }
        }
        stage('Test'){
            steps{
                echo "Testing completed"
            }
        }
        stage('Build'){
            steps{
                echo "Building completed"
            }
        }
    }
    
}
