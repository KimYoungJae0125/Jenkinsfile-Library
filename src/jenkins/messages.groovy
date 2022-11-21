package jenkins

def test(String stage) {
  [

      [
          "type": "header",
          "text": [
                  "type": "plain_text",
                  "text": "${env.JOB_NAME}(#${env.BUILD_NUMBER}) - ${stage} Stage"
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
                  "text": "`Git Commit Message` ```${GIT_COMMIT_MESSAGE}```"
          ]
      ],
      [
              "type": "divider"
      ]
  ]

}