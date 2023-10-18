Feature: To Register in demo web shop


@register
Scenario: To Register

Given User should be in the  home page "https://demowebshop.tricentis.com/"
Then Validate the home page and User should click register button
Then Enter the details "Naresh","V","nareshjaya95@gmail.com","TN64m5100","TN64m5100"
Then Click on save button


@login
Scenario: To Login
Given User should be in the  home page "https://demowebshop.tricentis.com/"
Then user should click login page
Then User should enter username and password "nareshjaya95@gmail.com","TN64m5100"
Then user should click login 

@addtocart
Scenario:  add mobile phone to cart
Given User should be in the  home page "https://demowebshop.tricentis.com/"
Then user should click login button
Then Enter username and password "nareshjaya95@gmail.com","TN64m5100"
Then click login button
Then click electronics link
Then click cellphones link
Then click add to cart button

@giftcard
Scenario: Giftcard
Given User should be in the  home page "https://demowebshop.tricentis.com/"
Then user should click login button
Then Enter username and password "nareshjaya95@gmail.com","TN64m5100"
Then click login button
Then Navigate to gift card
Then click on add to cart
Then Enter Recipient name and mail "ABCD","abc@gmail.com"
Then click send as mail
Then Enter Recipient mail "abc@gmail.com"
Then click send mail


