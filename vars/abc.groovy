def newGit(repo){
  echo "${repo}"
  git "${repo}"
}

def newMaven(build)
{
  sh label: '', script: 'mvn ${build}'
}

