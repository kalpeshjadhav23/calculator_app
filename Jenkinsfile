pipeline {
    agent any

    tools {
        jdk 'jdk21'
        maven 'maven3'
    }

    environment {
        SCANNER_HOME = tool 'sonar-scanner'
    }

    stages {

        stage('Checkout Code') {
            steps {
                git branch: 'main',
                url: 'https://github.com/kalpeshjadhav23/calculator_app.git'
            }
        }

        stage('Build and Test') {
            steps {
                sh 'mvn clean test'
            }pipeline {
                 agent any

                 tools {
                     jdk 'jdk21'
                     maven 'maven3'
                 }

                 environment {
                     SCANNER_HOME = tool 'sonar-scanner'
                 }

                 stages {

                     stage('Checkout Code') {
                         steps {
                             git branch: 'main',
                             url: 'https://github.com/kalpeshjadhav23/calculator_app.git'
                         }
                     }

                     stage('Build and Test') {
                         steps {
                             sh 'mvn clean test'
                         }
                     }

                     stage('SonarQube Analysis') {
                         steps {
                             withSonarQubeEnv('sonar') {
                                  sh '''
                                            mvn clean verify sonar:sonar \
                                            -Dsonar.projectKey=calculator_app \
                                            -Dsonar.login=squ_3257098109c1b8a7d4d4c9f9d636477d08ce56c2
                                            '''
                             }
                         }
                     }

                     stage('Quality Gate') {
                         steps {
                             timeout(time: 5, unit: 'MINUTES') {
                                 waitForQualityGate abortPipeline: true
                             }
                         }
                     }
                 }
             }
        }

        stage('SonarQube Analysis') {
            steps {
                withSonarQubeEnv('sonar') {
                     sh '''
                               mvn clean verify sonar:sonar \
                               -Dsonar.projectKey=calculator_app \
                               -Dsonar.login=squ_3257098109c1b8a7d4d4c9f9d636477d08ce56c2
                               '''
                }
            }
        }

        stage('Quality Gate') {
            steps {
                timeout(time: 5, unit: 'MINUTES') {
                    waitForQualityGate abortPipeline: true
                }
            }
        }
    }
}