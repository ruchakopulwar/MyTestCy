Feature: Go to Careers page
     Scenario Outline: Verify Careers Page
     Given Initialize Chrome Broser with Url "https://www.cybage.com/careers/current-openings"
     When Scroll Down To Search Job Profile
     And Enter Job Location <Location> & Job Profile <JobProfile>
     Then Verify Job "1 Jobs found"
     And Verify Job location as <Location>
     And Verify Job profile as <JobProfile>
     
     
Examples:
|Location   |JobProfile  |
|INDIA     |AEM         |
     
     
  
     
