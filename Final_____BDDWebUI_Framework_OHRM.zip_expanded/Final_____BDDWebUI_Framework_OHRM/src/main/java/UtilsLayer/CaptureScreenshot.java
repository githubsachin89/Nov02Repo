package UtilsLayer;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import IHelper.IScreenshot;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class CaptureScreenshot implements IScreenshot {
	WebDriver driver;

	public CaptureScreenshot() {
		driver = DriverManager.getInstance().getDriver();
	}

	@Override
	public String takeScreenshot(String folderName, String testCasesName) {

		String path = System.getProperty("user.dir") + "//" + folderName + "//" + DateAndTime.getYear() + "//"
				+ DateAndTime.getMonthYear() + "//" + DateAndTime.getDateMonthYear() + "//" + testCasesName
				+ DateAndTime.getDateMonthYearTime() + ".png";

		try {
			FileUtils.copyFile(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE), new File(path));

		} catch (IOException e) {
			e.printStackTrace();
		}

		return path;
	}

	@Override
	public String takeFullScreenshot(String folderName, String testCasesName) {
		String path = System.getProperty("user.dir") + "//" + folderName + "//" + DateAndTime.getYear() + "//"
				+ DateAndTime.getMonthYear() + "//" + DateAndTime.getDateMonthYear() + "//" + testCasesName
				+ DateAndTime.getDateMonthYearTime() + ".png";

		AShot a = new AShot();

		a.shootingStrategy(ShootingStrategies.viewportPasting(2000));
		BufferedImage src = a.takeScreenshot(driver).getImage();
		File destination = new File(path);

		try {
			ImageIO.write(src, "PNG", destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return path;
	}

}
