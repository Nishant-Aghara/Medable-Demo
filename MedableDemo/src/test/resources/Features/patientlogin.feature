Feature: Welcome Page

  Scenario: Form - Patient Apps Web - Basic


Given Patient navigates to welcome study page
When Patient click on Sign in button in welcome page
And Patient should see the login page
And Patient enter the email {user.provided@medable.com} in login page
And Patient enter the password qpal1010 in login page
And Patient click login button in login page
Then Patient navigates to activity list page
