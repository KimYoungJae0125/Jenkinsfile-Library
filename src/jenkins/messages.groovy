package jenkins

def test() {
  [

      [
          "type": "header",
          "text": [
                  "type": "plain_text",
                  "text": "Stage1"
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