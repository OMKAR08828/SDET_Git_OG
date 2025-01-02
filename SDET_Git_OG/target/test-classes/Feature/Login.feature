Feature: Login to saucedemo.com

Scenario: Verify login test
Given User is on login page
When User enters "<Username>" and "<password>"
And Click on login button
Then User should logged in successfully
And close the browser

Examples:
| Username | password |
| standard_user | secret_sauce|
#|locked_out_user|secret_sauce|
#|performance_glitch_user|secret_sauce|
#|problem_user |secret_sauce|