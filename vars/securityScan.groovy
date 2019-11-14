def call(body)
{
  appscan application: 'e1f0cff4-84ac-48cd-a454-3b93259a2488', credentials: 'IBMsecurityscan', email: true, failBuild: true, failureConditions: [failure_condition(failureType: 'high', threshold: 200), failure_condition(failureType: 'total', threshold: 200)], name: 'Security Test', scanner: static_analyzer(hasOptions: false, target: '/var/lib/jenkins/workspace/Jarvis5'), type: 'Static Analyzer', wait: true
}
