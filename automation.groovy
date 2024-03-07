node {
  stage("Create File") {
    echo currentBuild.displayName > my_file.txt
  }

  stage("Artifact File") {
    archiveArtifacts artifacts: 'my_file.txt', onlyIfSuccessful: true
  }
}


