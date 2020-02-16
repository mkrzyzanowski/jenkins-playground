pipelineJob('test-job') {
  displayName('Job DSL Test job')
  definition {
    cpsScm {
        scm {
            lightweight()
            git('https://github.com/jenkinsci/job-dsl-plugin.git')
            scriptPath 'pipelines/test-job.jenkinsfile'
        }
    }
  }
}