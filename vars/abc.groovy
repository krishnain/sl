def newGit(repo){
  echo "${repo}"
  git "${repo}"
}

def newMaven(build)
{
  echo "${build}"
  sh label: '', script: 'mvn "${build}"'
}

