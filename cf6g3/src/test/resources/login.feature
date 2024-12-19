#Scenario for launch a NSCorp.com 

Feature: Login to NSCorpcom

Scenario : UnSuccesfully login with invalid credential
Given Launch a NS login portal
When enter the invalid username and password
Then Got a error message
