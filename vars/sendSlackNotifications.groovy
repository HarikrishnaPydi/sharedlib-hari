// Slack Notification Function
def call(String buildStatus = 'STARTED') {
    def colorCode = '#FF0000' // Red by default
    def subject = "${buildStatus}: Job '${env.JOB_NAME} [#${env.BUILD_NUMBER}]'"
    def summary = "${subject} (${env.BUILD_URL})"

    if (buildStatus == 'STARTED') {
        colorCode = '#FFFF00' // Yellow
    } else if (buildStatus == 'SUCCESS') {
        colorCode = '#00FF00' // Green
    }

    slackSend(channel: '#airtel-devteam', color: colorCode, message: summary)
}
