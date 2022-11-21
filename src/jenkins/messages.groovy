package jenkins

def test(String stage) {
  [

      [
          "type": "header",
          "text": [
                  "type": "plain_text",
                  "text": "${stage} Stage - ${env.JOB_NAME} - #${env.BUILD_NUMBER}"
          ]
      ],
      [
        "type": "divider"
      ],
      [
          "type": "section",
          "text": [
                  "type": "mrkdwn",
                  "text": "`Build Url` : ${env.BUILD_URL}"
          ]
      ],
      [
          "type": "section",
          "text": [
                  "type": "mrkdwn",
                  "text": "`Git Url` : ${env.GIT_URL}"
          ]
      ],
      [
          "type": "section",
          "text": [
                  "type": "mrkdwn",
                  "text": "`Git Branch` : ${env.GIT_BRANCH}"
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