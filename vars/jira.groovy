def call(body)
{
  withEnv(['JIRA_SITE=jira']) {
      def testIssue = [fields: [ project: [id: 'JAR'],
                                 summary: 'New JIRA Created from Jenkins.',
                                 description: 'New JIRA Created from Jenkins.',
                                 issuetype: [id: '1']]]

      response = jiraNewIssue issue: testIssue

      echo response.successful.toString()
      echo response.data.toString()
    }
}
