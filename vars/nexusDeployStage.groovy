def call() {
    stage('Deploy to Nexus') {
        sh 'mvn deploy'
    }
}
