package jenkins

def test(String stage) {
  [

      [
          "type": "header",
          "text": [
                  "type": "plain_text",
                  "text": "${stage} Stage"
          ]
      ],
      [
        "type": "divider"
      ],
      [
          "type": "section",
          "text": [
                  "type": "mrkdwn",
                  "text": "*${env.JOB_NAME} - #${env.BUILD_NUMBER}*\n`Build Url` : ${env.BUILD_URL}"
          ]
      ],
      [
          "type": "section",
          "text": [
                  "type": "mrkdwn",
                  "text": "`Git Info` : ${env.GIT_URL} - ${env.GIT_BRANCH}"
          ]
      ],
      [
          "type": "section",
          "text": [
                  "type": "mrkdwn",
                  "text": "`Git Commiter` : ${GIT_COMMIT_AUTHOR}(${GIT_COMMIT_AUTHOR_EMAIL})"
          ]
      ],
      [
          "type": "section",
          "text": [
                  "type": "mrkdwn",
                  "text": "```${GIT_COMMIT_MESSAGE}```"
          ]
      ],
      [
              "type": "divider"
      ]
  ]

}