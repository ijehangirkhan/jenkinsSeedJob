freeStyleJob('SeedJob') {
    scm {
            git {
                // Specify the branches to examine for changes and to build.
                    branch('*/master')

                // Specify the branches to examine for changes and to build.
                // branches(String... branches)

                // Adds a repository browser for browsing the details of changes in an external system.
                // browser {}

                // Allows direct manipulation of the generated XML.
                // configure(Closure configureBlock)

                // Adds additional behaviors.
                // extensions {}

                // Adds a remote.
                    remote {
                            // Sets credentials for authentication with the remote repository.
                            credentials('Jehangir')

                            // Sets a remote URL for a GitHub repository.
                            // github(String ownerAndProject, String protocol = 'https', String host = 'github.com')

                            // Sets a name for the remote.
                            // name(String name)

                            // Sets a refspec for the remote.
                            // refspec(String refspec)

                            // Sets the remote URL.
                            url("https://github.com/ijehangirkhan/jenkinsSeedJob.git")
                    }

        }

    steps {
            dsl {
                external('jobs/*.groovy')
            }
    }
}