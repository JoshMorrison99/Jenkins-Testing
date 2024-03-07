node {
  stage("Create File") {
    sh 'echo currentBuild.displayName > my_file.txt'
  }

  stage("Artifact File") {
    archiveArtifacts artifacts: 'my_file.txt', onlyIfSuccessful: true
  }
}


