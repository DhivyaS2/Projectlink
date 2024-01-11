@c
Feature: Automation of register page
@home
Scenario: home
Given Clicks register to create username and password
@register
Scenario Outline: register
Given clicks Register button
When Enters "<username>" "<password>" and "<confirmpassword>" of below values
Then Shows Message of creating based on given values
Examples:
|username|password|confirmpassword|
|        |         |              |
|phoenixteam|      |        |
|phoenixteam |phonex123|    |
|phoenixteam |123344454|1123234235|
|phoenixteam |phoneni| 679787690 |

@register2
Scenario Outline: valid register

When  Enters possible "<username>" "<password>" and "<confirmpassword>" to create account
Then Accepts user name and password and navigate to home page with username And Shows New Account credited with username
When clicks Sign out 
Then Displays Logged out successfully
Examples:

|username1|password|confirmpassword|
|phoenixteam |phoenix123/|phoenix123/|

