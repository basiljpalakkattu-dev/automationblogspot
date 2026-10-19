package test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Basepage;
import pages.DragDropPage;

public class DragDropTest extends Basepage {

    @Test
    public void dragDropTest() throws IOException {

        DragDropPage drag = new DragDropPage(driver);

        drag.draganddrop();

        String actualResult = drag.getDropResult();

        Assert.assertEquals(actualResult, "Dropped!");
    }
}