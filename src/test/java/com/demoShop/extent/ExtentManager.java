package com.demoShop.extent;


	import com.aventstack.extentreports.ExtentReports;
	import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

	import java.io.FileInputStream;
	import java.io.IOException;
	import java.util.Properties;

	public class ExtentManager {

	    private static ExtentReports extent;
	    private static Properties config = new Properties();

	    static {
	        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent-report.html");
			extent = new ExtentReports();
			extent.attachReporter(htmlReporter);
			extent.setSystemInfo("User", "Pratik Kumar Sharma");
			extent.setSystemInfo("Application URL", "https://demowebshop.tricentis.com/");
			extent.setSystemInfo("ValidEmail","PratikKumar734@gamil.com");
			extent.setSystemInfo("ValidPassword", "Pk577292@");
			extent.setSystemInfo("OS", System.getProperty("os.name"));
	    }

	    public static ExtentReports getInstance() {
	        return extent;
	    }
	}

	
