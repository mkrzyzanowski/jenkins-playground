pipeline {
    agent any
    stages {
        stage('seed') {
            steps {
                pipelineDsl(targets: 'jobs/*.groovy', sandbox: false)
            }
        }
    }
}