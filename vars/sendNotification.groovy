#!/usr/bin/env groovy

import jenkins.messages

def call(String stage) {
    def messagesFile = new messages()

    def status = currentBuild.result

    def emoji = ":question:"
    switch (status) {
        case "SUCCESS" : emoji = ":smile:"; break
        case "FAILURE" : emoji = ":sob:"; break
    }
    status = status.substring(0, 1) + status.substring(1).toLowerCase()

    slackSend(color: "good", blocks: messagesFile.test(stage, status, emoji))


}


