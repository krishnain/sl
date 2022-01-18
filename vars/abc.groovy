def newGit(repo){
  echo "${repo}"
  git "${repo}"
}

def newMaven()
{
  
  sh label: '', script: 'mvn package'
}

