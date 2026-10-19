package test;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.Basepage;
import pages.LinksLabels;

public class LinksLabelsTest extends Basepage {

    @Test
    public void calling() throws IOException {

        LinksLabels llpp = new LinksLabels(driver);
        int brokenLinks = llpp.brokenLink();

        // assert in testpage
        Assert.assertEquals(brokenLinks, 9, "Broken links found on page!");

    }

}