#!/usr/bin/env groovy

import jenkins.messages

def call() {
    def messagesFile = new messages();


    slackSend(color: "good", messagesFile.test())


}


