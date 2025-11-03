package IHelper;

import java.time.Duration;

public interface IWebDriver {

	void get(String url);

	void to(String url);

	void back();

	void forward();

	void refresh();

	void maximize();

	void minimize();

	void fullscreen();

	void implicitlyWait(Duration duration);

	void pageLoadTimeout(Duration duration);

	void deleteAllCookies();

	void quit();
	
	void close();

	String getTitle();

	String getCurrentUrl();

}
