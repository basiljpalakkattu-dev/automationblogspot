package test;

import java.io.IOException;

import org.testng.annotations.Test;

import base.Basepage;
import pages.GUIElementsPage;

public class GUIElementsTest extends Basepage {

	@Test
	public void firsttest() throws IOException {
		
		GUIElementsPage form =new GUIElementsPage(driver); 
		form.formfiledschecking();
		form.radiobuttons();
		form.dropdown();
		
		
		
		

	}
	
}
