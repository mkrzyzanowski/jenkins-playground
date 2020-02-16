pipeline {
    agent any
    stages {
        stage('seed') {
            steps {
                jobDsl(targets: 'jobs/*.groovy', sandbox: false)
            }
        }
    }
}