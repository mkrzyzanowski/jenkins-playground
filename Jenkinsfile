pipeline {
    agent any
    stages {
        stage('seed') {
            steps {
                jobDsl targets: '''config.groovy
                jobs/*.groovy''', sandbox: false
            }
        }
    }
}