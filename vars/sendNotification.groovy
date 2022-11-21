#!/usr/bin/env groovy

import jenkins.messages

def call(String stage) {
    def messagesFile = new messages()

    slackSend(color: "good", blocks: messagesFile.test(stage))


}


