def call (String ProjectName, String Imagetag, String DockerHubUser) {
  echo "Building the docker images..."
  sh "docker build -t ${DockerHubUser}/${ProjectName}:${Imagetag} ."
}
