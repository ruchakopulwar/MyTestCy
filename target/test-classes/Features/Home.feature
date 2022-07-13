Feature: Go to Home page

Scenario: Verify Home Page
Given Initialize Browser with Chrome "https://www.cybage.com/"
And Verify Home page title "Digital Product Engineering Services & Digital Transformation Consulting"
And Verify carrier Label should be "Careers" 
When Click on carrier page
Then Verify Carrier page title "Careers"
Then Close Chrome Browser


Scenario: Verify all labal & icons
Given Initialize Browser with Chrome "https://www.cybage.com/"
And Verify Search icon
And Verify Menu icon
Then Verify first lable "OVERARCHING COVERAGE ACROSS THE PRODUCT LIFECYCLE"
Then Verify First button "KNOW MORE"
When Verify second label "LEVERAGE DECISIONMINESTM DATA SCIENCE TO YOUR STRATEGIC ADVANTAGE"
Then Verify Second button "KNOW MORE"
When Verify INSIGHTS panel Label "INSIGHTS"
And Close Chrome Browser

Scenario: Verify Next Panel
Given Initialize Browser with Chrome "https://www.cybage.com/"
And Verify Panel INCLUSIVITY DEFINES label "INCLUSIVITY DEFINES" + newLine + "OUR WORKFORCE"
When Verify INCLUSIVITY DEFINES Button "SEARCH"
And Close Chrome Browser
