package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Basepage;
import pages.FileUploadPage;

public class FileUploadTest extends Basepage {

    @Test
    public void filetest() throws InterruptedException {

        FileUploadPage f = new FileUploadPage(driver);

        // Multiple file upload
        f.filesuploading();

        long fileCount = f.getMultipleFileCount();

        Assert.assertEquals(
                fileCount,
                2,
                "Multiple file upload failed"
        );
     

        // Single file upload
        f.singlefile();

        String singleFile = f.getSingleFileValue();

        Assert.assertTrue(
                singleFile.contains("SEMINAR REPORT 2.pdf"),
                "Single file was not uploaded successfully"
        );
    }
}