def repoclone(String url,String branch){
  echo "cloning of the code..."
  git url: "${url}" , branch: "${branch}"
  echo "clonning successful..."
}
