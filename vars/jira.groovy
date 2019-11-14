def call(body)
{
  //jiraAddComment comment: 'STAGE FAILED', idOrKey: 'JAR-6', site: 'jira'
  def testIssue = [fields: [ project: [id: 'JAR'],
                           summary: 'New JIRA Created from Jenkins.',
                           description: 'New JIRA Created from Jenkins.',
                           issuetype: [id: '3']]]

response = jiraNewIssue issue: testIssue, site: 'https://varshi26.atlassian.net'

echo response.successful.toString()
echo response.data.toString()
}
