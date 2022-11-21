#!/usr/bin/env groovy

import jenkins.messages

def call() {
    def messagesFile = new messages()

    println(messagesFile.test())


    slackSend(color: "good", blocks: messagesFile.test())


}


