def call(body)
{
  jiraAddComment comment: 'STAGE FAILED', idOrKey: 'JAR-6', site: 'jira'
}
