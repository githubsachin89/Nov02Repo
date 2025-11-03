package UtilsLayer;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.WebElement;

public class BrokenLink {
	static URL url;
	static URLConnection urlCon;
	static int responseCode;

	public static void findAllBrokenLinks(List<WebElement> allLinks) {

		for (WebElement link : allLinks) {
			String actualLink = link.getAttribute("href");

			try {
				url = new URL(actualLink);
				urlCon = url.openConnection();

				HttpURLConnection httpCon = (HttpURLConnection) urlCon;

				httpCon.connect();

				responseCode = httpCon.getResponseCode();
			} catch (IOException e) {
				e.printStackTrace();
			}

			if (responseCode < 400) {
				System.out.println("Link is Valid " + actualLink);
			} else {
				System.out.println("Link is invalid " + actualLink);
			}
		}

	}

}
