pipelineJob('testJob') {
  displayName('Job DSL Test job')
  definition {
    cpsScm {
        scm {
            lightweight()
            git('https://github.com/jenkinsci/job-dsl-plugin.git')
            scriptPath 'pipelines/testJob.jenkinsfile'
        }
    }
  }
}