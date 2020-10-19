package com.automation.steps;


import cucumber.api.java8.En;
import framework.driverfactory.DriverFactory;

import static org.testng.Assert.assertEquals;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;

public class TestSteps implements En {

    private static Logger log = Logger.getLogger(TestSteps.class);

    @Autowired
    DriverFactory driverFactory;

    public TestSteps() {
        Given("User opened NHS website", () -> {
            log.info("User opened NHS website");
            driverFactory.getDriver().navigate().to("https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start");

        });
       
        When("User clicks on start button", () -> {

        	driverFactory.getDriver().findElement(By.id("next-button")).click();
        	
        });
        
        Then("User should navigate to next Page to select country", () -> {

        	
        });

        Then("select Country as Wales and click on next button", () -> {

        	driverFactory.getDriver().findElement(By.id("label-wales")).click();
        	driverFactory.getDriver().findElement(By.id("next-button")).click();
        });
        
        Then("user should navigate to next page to select date of birth", () -> {
            // Write code here that turns the phrase above into concrete actions
        });
        
        Then("enter date of birth  and then click on next button", () -> {
            

        	driverFactory.getDriver().findElement(By.id("dob-day")).sendKeys("02");
        	driverFactory.getDriver().findElement(By.id("dob-month")).sendKeys("07");
        	driverFactory.getDriver().findElement(By.id("dob-year")).sendKeys("1985");
            driverFactory.getDriver().findElement(By.id("next-button")).click();


        });
        
        Then("user should navigate to next page to select material status", () -> {

        });
        
        Then("select answer using radio button as Yes and then click on next button", () -> {

        	driverFactory.getDriver().findElement(By.id("label-yes")).click();
        	driverFactory.getDriver().findElement(By.id("next-button")).click();


        });
        
        Then("user should navigate to next page to select benefits or tax credits", () -> {

        });

        Then("select answer using radio button as No and then click on next button", () -> {

        	driverFactory.getDriver().findElement(By.id("label-no")).click();
        	driverFactory.getDriver().findElement(By.id("next-button")).click();

        });
        Then("User should navigate page about pregnancy or birth", () -> {

        });
        
        Then("select answer using radio button as No and then click on the next button", () -> {

        	driverFactory.getDriver().findElement(By.id("label-no")).click();
        	driverFactory.getDriver().findElement(By.id("next-button")).click();

        });
        
        Then("User should navigate page about serving in the armed forces", () -> {

        });

        Then("user select answer using radio button and click on next button", () -> {

        	driverFactory.getDriver().findElement(By.id("label-no")).click();
        	driverFactory.getDriver().findElement(By.id("next-button")).click();
        });

        Then("User should navigate page about diabetes", () -> {
        	
        });

        Then("user select answer using radio button for diabetes and click on next", () -> {

        	driverFactory.getDriver().findElement(By.id("label-no")).click();
        	driverFactory.getDriver().findElement(By.id("next-button")).click();
        });

        Then("User should navigate page about glaucoma", () -> {
        });

        Then("user select answer for glaucoma using radio button and click on next", () -> {
        	driverFactory.getDriver().findElement(By.id("label-no")).click();
        	driverFactory.getDriver().findElement(By.id("next-button")).click();
        });

        Then("User should navigate page about care home", () -> {
        });

        Then("user select answer for care home using radio button and click on next", () -> {

        	driverFactory.getDriver().findElement(By.id("label-no")).click();
        	driverFactory.getDriver().findElement(By.id("next-button")).click();
        });

        Then("User should navigate page about savings investments or property", () -> {
        	
        });

        Then("user select answer for savings investments or property using radio button and click on next", () -> {

        	driverFactory.getDriver().findElement(By.id("label-no")).click();
        	driverFactory.getDriver().findElement(By.id("next-button")).click();
        });

        Then("user get the NHS costs", () -> {

        	String result=driverFactory.getDriver().findElement(By.id("FREE-heading")).getText();
            assertEquals("You get free:", result);
        	
        });
        

    }
}
