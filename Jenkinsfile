pipeline{
    agent any
    stages{
        stage('Verify Environment'){
            steps{
                echo "Verifying Java And Maven Installation"
                sh 'java --version'
                sh 'mvn --version'
            }
        }
        stage('Clean'){
            steps{
                echo "Cleaning The Workspace"
                sh 'mvn clean'
            }
        }
        stage('Compile'){
            steps{
                echo "Compiling The Java Files"
                sh 'mvn compile'
            }
        }
        stage('Test'){
            steps{
                echo "Unit Testing"
                sh 'mvn test'
            }
        }
        stage('Package'){
            steps{
                echo "Packaging EMS"
                sh 'mvn package'
            }
        }
        stage('Verify Artifact'){
            steps{
                echo "Verifying The Target Folder"
                sh 'ls -lh target'
            }
        }
        stage('Archive Artifact'){
            steps{
                echo "Storing .jar files in target folder"
                archiveArtifacts artifacts: 'target/*.jar' , fingerprint : true
            }
        }
    }
        post{
            success{
                emailext(
                    subject: "SUCCESS: ${env.JOB_NAME} #${env.BUILD_NUMBER}",
                    body:"""
                    Hello,

                    Build Successfull
                    Job Name: ${env.JOB_NAME}
                    Build Number: ${env.BUILD_NUMBER}

                    Build URL:
                    ${env.BUILD_URL}

                    Regards,
                    Jenkins
                    """ ,
                    to: "vamsitemp69@gmail.com"
                )
            }
            failure{
                emailext(
                    subject: "FAILURE: ${env.JOB_NAME} #${env.BUILD_NUMBER}",
                    body:"""
                    Hello,

                    Build Failed
                    Job Name: ${env.JOB_NAME}
                    Build Number: ${env.BUILD_NUMBER}

                    Build URL:
                    ${env.BUILD_URL}

                    Regards,
                    Jenkins
                    """ ,
                    to: "vamsitemp69@gmail.com"
                )

            }
        }
        
    }