def call(String msg="STAGE FAILED",String id="JAR-0")
{
  jiraAddComment comment: ${msg}, idOrKey: ${id}, site: 'jira'
  /*def testIssue = [fields: [ project: [id: 'JAR'],
                           summary: 'New JIRA Created from Jenkins.',
                           description: 'New JIRA Created from Jenkins.',
                           issuetype: [id: '3']]]

response = jiraNewIssue issue: testIssue, site: 'https://varshi26.atlassian.net'

echo response.successful.toString()
echo response.data.toString()*/
}
