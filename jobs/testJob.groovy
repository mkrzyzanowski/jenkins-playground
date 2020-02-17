pipelineJob('test-folder/testJob') {
  displayName('Job DSL Test job')
  definition {
    cpsScm {
        scm {
            lightweight()
            git {
              branch('master')
              remote {
                url('https://github.com/mkrzyzanowski/jenkins-playground.git')
              }
              extensions {}
            }
            scriptPath 'pipelines/testJob.jenkinsfile'
        }
    }
  }
}