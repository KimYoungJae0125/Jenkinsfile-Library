#!/usr/bin/env groovy

import jenkins.messages

def call(String stage) {
    def messagesFile = new messages()

    def status = currentBuild.result.toLowerCase()

    slackSend(color: "good", blocks: messagesFile.test(stage, status))


}


