pipeline{
    agent any
    stages{
        stage('Verify'){
            steps{
                sh 'java --version'
                sh 'mvn --version'
            }
        }
        stage('Cloning The Repo'){
            steps{
                'git clone'

            }
        }
        stage('Compile'){
            steps{
                sh 'mvn compile'
            }
        }
        stage('Test'){
            steps{
                sh 'mvn test'
            }
        }
        stage('Package'){
            steps{
                sh 'mvn package'
            }
        }
        stage('Verify Artifact'){
            steps{
                sh 'ls -lh target'
            }
        }
        stage('Archive Artifact'){
            steps{
                archiveArtifacts artifacts: 'target/*.jar' , fingerprint : true
            }
        }
        post{
            success{
                emailtext(
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
                    to: vamsitemp69@gmail.com
                )
            }
            failure{
                emailtext(
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
                    to: vamsitemp69@gmail.com
                )

            }
        }
    }
}