Feature: Verify user can use snapdeal application
Scenario Outline: Verify User can search a product
Given user is opening the application
When user is clicking the search button
And user is entering the product "<product>"
And user is selecting the product from drop down

Examples:
|product|
|iphone|
