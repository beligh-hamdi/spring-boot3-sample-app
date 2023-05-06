pipeline {
    agent any
        tools {
            maven "maven"
            jdk "jdk17"
    }
    stages {
        stage('Initialize'){
             steps{
                 echo "PATH = ${M2_HOME}/bin:${PATH}"
                 echo "M2_HOME = /opt/maven"
             }
         }
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }
        stage('SonarQube Analysis') {
            steps {
                script {
                    scannerHome = tool 'sonar'
                }
                withSonarQubeEnv('sonar') {
                    sh "mvn clean verify sonar:sonar -Dsonar.projectKey=spring-boot3-sample-app"
                }
            }
        }
    }
}