pipeline {
    agent any
    tools
    {
        maven 'mvn'
    }
    stages {
        stage('git clone') {
            steps {
                git 'https://github.com/JamesLaurino/demo-jenkins.git'
            }
        }
        stage("docker deploy")
        {
            steps
            {
                bat "docker-compose up"
            }
        }
    }
}