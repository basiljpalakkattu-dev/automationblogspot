package test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Basepage;
import pages.DoubleClickPage;

public class DoubleClickTest extends Basepage {

    @Test
    public void firsttest() throws IOException {

        DoubleClickPage dd = new DoubleClickPage(driver);

        dd.Doubleclick();

        String actualMessage = dd.getMessage();

        String expectedMessage = dd.getExpectedMessage();

        Assert.assertEquals(actualMessage, expectedMessage);
    }
}