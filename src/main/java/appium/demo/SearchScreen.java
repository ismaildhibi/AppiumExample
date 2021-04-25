package appium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchScreen {
	private WebDriver driver;

	By inputtext = By.id("io.selendroid.testapp:id/my_text_field");

	public SearchScreen(WebDriver driver) {
		this.driver = driver;

	}
	
	public void settext(String text) {
		WebDriverWait wait = new WebDriverWait(driver, 100);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(inputtext));
		element.sendKeys(text);

	}
}
