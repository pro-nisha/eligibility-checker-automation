
@web
Feature: Eligibility Checker

    Scenario: Verify Eligibility for paid NHS Cost
        Given User opened NHS website
        When User clicks on start button
        Then User should navigate to next Page to select country
        And select Country as Wales and click on next button
        Then user should navigate to next page to select date of birth
        Then enter date of birth  and then click on next button
        Then user should navigate to next page to select material status
        And select answer using radio button as Yes and then click on next button
        Then user should navigate to next page to select benefits or tax credits
        And select answer using radio button as No and then click on next button
        Then User should navigate page about pregnancy or birth
        And select answer using radio button as No and then click on the next button
        Then User should navigate page about serving in the armed forces
        And user select answer using radio button and click on next button
        Then User should navigate page about diabetes
        And   user select answer using radio button for diabetes and click on next
        Then User should navigate page about glaucoma
        And   user select answer for glaucoma using radio button and click on next
        Then User should navigate page about care home
        And   user select answer for care home using radio button and click on next
        Then User should navigate page about savings investments or property
        And   user select answer for savings investments or property using radio button and click on next
        Then user get the NHS costs
        
        
        
        
        