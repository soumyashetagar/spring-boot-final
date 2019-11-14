def call(body)
{
  jiraAddComment comment: 'STAGE FAILED', idOrKey: 'JAR-5', site: 'jira'
}
