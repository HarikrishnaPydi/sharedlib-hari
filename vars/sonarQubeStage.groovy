def call() {
    stage('SonarQube Report') {
        sh 'mvn sonar:sonar'
    }
}
