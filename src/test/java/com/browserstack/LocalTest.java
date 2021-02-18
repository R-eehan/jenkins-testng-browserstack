package com.browserstack;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LocalTest extends BrowserStackTestNGTest {

    @Test
    public void test() throws Exception {
		System.out.println();
        driver.get("https://localhost");

        Assert.assertTrue(driver.getTitle().contains("Forty by HTML5 UP"));
    }
}
