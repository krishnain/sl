def newGit(repo){
  echo "${repo}"
  git "${repo}"
}

def newMaven()
{
  
  sh label: '', script: 'mvn package'
}

def newDeploy(ip,appname)
{
  sh "scp /home/ubuntu/.jenkins/workspace/Sample/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${appname}.war"
}

