pipelineJob('test-job') {
  definition {
    cps {
      script(readFileFromWorkspace('pipelines/test.jenkinsfile'))
      sandbox()
    }
  }
}