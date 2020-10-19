package com.automation.hooks;

import cucumber.api.java.After;
import framework.driverfactory.DriverFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class CleanUp {

    @Autowired
    DriverFactory driverFactory;
    @After(order = 500)
    public void cleanUp(){
        driverFactory = null;

    }
}
