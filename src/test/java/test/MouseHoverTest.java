package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Basepage;
import pages.MouseHoverPage;

public class MouseHoverTest extends Basepage {

    @Test
    public void mousehover() {

        MouseHoverPage m = new MouseHoverPage(driver);

        m.Mousehover();

        Assert.assertTrue(
                m.isMouseHoverButtonDisplayed(),
                "Mouse hover button is not displayed"
        );

        m.dataentryform();

        Assert.assertTrue(
                m.isDataEntryFormDisplayed(),
                "Data Entry Form is not displayed"
        );
    }
}