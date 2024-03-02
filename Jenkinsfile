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
        stage("build")
        {
            steps
            {
                bat "mvn clean package"
            }
        }
        stage("docker build")
        {
            steps
            {
                bat "docker build -t demo-v1 ."
            }
        }
        stage("docker deploy")
        {
            steps
            {
                bat "docker kill demo-v1-container"
                bat "docker rm demo-v1-container"
                bat "docker run -d -p 8080:8080 --name demo-v1-container demo-v1"
            }
        }
    }
}