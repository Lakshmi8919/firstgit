package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class hook {
	public static String lucky(WebDriver driver) {
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String Path = System.getProperty("user.dir")+"./screenshot/shot.png";
	

		try {
			FileHandler.copy(src,new File(Path));
		
		}catch(IOException e) {
			System.out.println("Unable to capture Screenshot" +e.getMessage());
		}
		return Path;

}

}
