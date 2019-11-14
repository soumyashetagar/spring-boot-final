def call(body)
{
  //jiraAddComment comment: 'STAGE FAILED', idOrKey: 'JAR-6', site: 'jira'
  def testIssue = [fields: [ 
                               project: [id: 'JAR'],
                               summary: 'New JIRA Created from Jenkins.',
                               description: 'New JIRA Created from Jenkins.',
                               customfield_1000: 'customValue',
                               
                               issuetype: [id: '1']]]

    response = jiraNewIssue issue: testIssue

    echo response.successful.toString()
    echo response.data.toString()
}
