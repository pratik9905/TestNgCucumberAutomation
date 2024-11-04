package hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.demowebshop.base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class MyHooks extends BaseClass{
	@Before
	public void setupscreenshot() {
	 System.out.println("Execution Started");
     } 
@After
public void screenshot(io.cucumber.java.Scenario sc) throws Throwable {
System.out.println("After method is running");
if (sc.isFailed()) {
	TakesScreenshot ts = (TakesScreenshot) driver;
	byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
	sc.attach(screenshot, "image/png", "taking screenshot....");
} else {
	//TakesScreenshot ts = (TakesScreenshot) driver;
	//byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
	//sc.attach(screenshot, "image/png", "taking screenshot....");
	 System.out.println("Passed");
}
Thread.sleep(2000);
	driver.quit();  //close browser

}
}
