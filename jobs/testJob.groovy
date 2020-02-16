pipelineJob('testJob') {
  displayName('Job DSL Test job')
  definition {
    cpsScm {
        scm {
            lightweight()
            git('https://github.com/mkrzyzanowski/jenkins-playground.git')
            scriptPath 'pipelines/testJob.jenkinsfile'
        }
    }
  }
}