Feature: Validate Amazon search

Scenario Outline: Validate Amazon search

Given users visits Amazon homepage
When user types "<productname>" and click search icon
Then User should be able to see the expected product

Examples:
|productname|
|iphone 12 promax|