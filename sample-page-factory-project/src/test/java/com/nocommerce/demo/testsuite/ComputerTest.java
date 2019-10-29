package com.nocommerce.demo.testsuite;

import com.nocommerce.demo.loadproperty.LoadProperty;
import com.nocommerce.demo.pages.ComputersPage;
import com.nocommerce.demo.pages.HomePage;
import com.nocommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ComputerTest extends TestBase {


    @Test (groups = {"sanity","regression"})
    public void userShouldNevigateToComputersPageSuccessfully() {
        HomePage homepage = new HomePage();
        ComputersPage commPage = new ComputersPage();

        System.out.println("driver = " +driver);
        homepage.computersLink();
        String commExpectedText = "Computers";
        Assert.assertEquals(commPage.verifyCommText(), commExpectedText);

    }
}
