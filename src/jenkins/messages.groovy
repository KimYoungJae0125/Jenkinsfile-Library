package jenkins

def test() {
  [

      [
          "type": "header",
          "text": [
                  "type": "mrkdwn",
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
                      "text": "Build, ${env.BUILD_JOB_NAME}"
              ]
      ],
  ]

}