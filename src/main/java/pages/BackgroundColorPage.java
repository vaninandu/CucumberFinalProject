package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class BackgroundColorPage {

	WebDriver driver;

	public BackgroundColorPage(WebDriver driver) {
		this.driver = driver;
	}

	// WebElements

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Set SkyBlue Background')]")
	WebElement SKYBLUE_BUTTON_ELEMENT;
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Set White Background')]")
	WebElement WHITE_BUTTON_ELEMENT;

	// Corresponding methods
	public boolean skyBlueBackground() {

		return SKYBLUE_BUTTON_ELEMENT.isDisplayed();
	}

	public boolean whiteBackground() {

		return WHITE_BUTTON_ELEMENT.isDisplayed();

	}

	public void skyBlue() {
		SKYBLUE_BUTTON_ELEMENT.click();

	}

	public void white() {
		WHITE_BUTTON_ELEMENT.click();

	}

	public String validateSkyBlueColor() {
	String skyblueColorCode = driver.findElement(By.xpath("//body[@style='background-color: skyblue;']")).getCssValue("background-color");
	System.out.println("color code in RGB  " +skyblueColorCode);
	return skyblueColorCode;
	}

	public String validateWhiteColor() {
	String whiteColorCode =driver.findElement(By.xpath("//body[@style='background-color: white;']")).getCssValue("background-color");
	System.out.println("color code in RGB  " + whiteColorCode);
	return whiteColorCode;	 
	}
}
