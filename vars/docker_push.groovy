def call(String Project, String Imagetag){
  withCredentials([usernamePassword(credentialsId: 'DockerHubCred', passwordVariable: "dockerHubPass", usernameVariable: "dockerHubUser")]){
    sh "docker login -u ${dockerHubUser} -p ${dockerHubPass}"
  }  
  sh "docker push ${dockerHubUser}/${Project}:${Imagetag}"
}
