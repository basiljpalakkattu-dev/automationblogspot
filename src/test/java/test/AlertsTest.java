package test;

import java.io.IOException;

import org.testng.annotations.Test;

import base.Basepage;
import pages.AlertsPage;

public class AlertsTest extends Basepage{
	@Test
	public void alerttest() throws IOException {
		
		
		AlertsPage al=new AlertsPage(driver);
		al.simplalert();
		al.confirmationalert();
		al.propmpalert();
	}

}
