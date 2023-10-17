Feature: To Register in demo web shop


@register
Scenario: To Register

Given User should be in the  home page "https://demowebshop.tricentis.com/"

Then Validate the home page and User should click register button
Then Enter the details "Naresh","V","nareshjaya95@gmail.com","TN64m5100","TN64m5100"
Then Click on save button

@addtocart
Scenario:  add mobile phone to cart
Given User should be in the  home page "https://demowebshop.tricentis.com/"
Then user should click login button
Then Enter username and password "nareshjaya95@gmail.com","TN64m5100"
Then click login button
Then click electronics link
Then click cellphones link
Then click add to cart button




