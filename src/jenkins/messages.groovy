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
                      "text": "Build, ${env.JOB_NAME}"
              ]
      ]
  ]

}