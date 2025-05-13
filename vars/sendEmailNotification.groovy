// vars/sendEmailNotification.groovy
def call(String buildStatus = 'STARTED') {
    emailext(
        subject: "Jenkins Build - ${buildStatus}: ${env.JOB_NAME} #${env.BUILD_NUMBER}",
        body: """
            <p><b>Status:</b> ${buildStatus}</p>
            <p><b>Job:</b> ${env.JOB_NAME}</p>
            <p><b>Build #:</b> ${env.BUILD_NUMBER}</p>
            <p><b>URL:</b> <a href="${env.BUILD_URL}">${env.BUILD_URL}</a></p>
        """,
        mimeType: 'text/html',
        to: 'haripydi777@gmail.com'
    )
}
