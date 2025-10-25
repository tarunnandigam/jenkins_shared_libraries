def call(String Project, String Imagetag) {
    withCredentials([usernamePassword(credentialsId: 'DockerHubCred', passwordVariable: "dockerHubPass", usernameVariable: "dockerHubUser")]) {
        sh "echo $dockerHubPass | docker login --username $dockerHubUser --password-stdin"
    }  
    sh "docker push ${dockerHubUser}/${Project}:${Imagetag}"
}
