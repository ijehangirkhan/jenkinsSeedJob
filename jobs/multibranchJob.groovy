multibranchPipelineJob('DSL') {
    branchSources {
        git {
            id('123456789') // IMPORTANT: use a constant and unique identifier
            remote('https://github.com/ijehangirkhan/jenkinstestcases.git')
            credentialsId('f0dbf083-93dd-457f-8b44-9bc9c3ec1231')
        }
    }
    orphanedItemStrategy {
        discardOldItems {
        }
    }
}