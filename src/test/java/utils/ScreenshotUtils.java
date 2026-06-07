package utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import base.DriverFactory;

public class ScreenshotUtils {
	
	  public static String captureScreenshot(
	            String testName) {

	        File srcFile =
	                ((TakesScreenshot)
	                        DriverFactory.getDriver())
	                        .getScreenshotAs(
	                                OutputType.FILE);

	        String destination =
	                "screenshots/"
	                        + testName
	                        + ".png";

	        try {

	            FileUtils.copyFile(
	                    srcFile,
	                    new File(destination));

	        } catch (IOException e) {

	            e.printStackTrace();
	        }

	        return destination;
	    }
	}
