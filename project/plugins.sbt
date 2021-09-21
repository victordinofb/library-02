logLevel := Level.Warn

//resolvers += "Code Commit repository" at "https://maven.pkg.github.com/djspiewak"

//lazy val root = project.in(file(".")).dependsOn(sbtGithubActionsPlugin) 

//lazy val sbtGithubActionsPlugin = uri("https://github.com/djspiewak/sbt-github-actions.git") 

addSbtPlugin("com.codecommit" % "sbt-github-packages" % "0.5.2")
addSbtPlugin("com.codecommit" % "sbt-github-actions" % "0.13.0")
