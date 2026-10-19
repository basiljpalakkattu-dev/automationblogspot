package test;

import org.testng.annotations.Test;

import base.Basepage;
import pages.NewTabPage;

public class NewTabTest extends Basepage {

    @Test
    public void webTablesTest() {

    	NewTabPage page = new NewTabPage(driver);

        page.webTables();
        page.childAction();
    }
}