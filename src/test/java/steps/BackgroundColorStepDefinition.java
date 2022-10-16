package steps;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.BackgroundColorPage;
import pages.BrowserFactory;

public class BackgroundColorStepDefinition extends BrowserFactory {

	BackgroundColorPage backgroundColor;

	@Given("^Set SkyBlue Background button exists$")
	public void set_SkyBlue_Background_button_exists() {
		init();
		backgroundColor = PageFactory.initElements(driver, BackgroundColorPage.class);
		backgroundColor.skyBlueBackground();
	}

	@When("^I click on the SkyBlue Background button$")
	public void i_click_on_the_SkyBlue_Background_button() {
		backgroundColor.skyBlue();
	}

	@Then("^The background color will change to skyblue$")
	public void the_background_color_will_change_to_skyblue() {
		String expectedBlueColorCode = "rgba(135, 206, 235, 1)";
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Assert.assertEquals(expectedBlueColorCode, backgroundColor.validateSkyBlueColor());
	}

	@Given("^Set SkyWhite Background button exists$")
	public void set_SkyWhite_Background_button_exists() {
		backgroundColor = PageFactory.initElements(driver, BackgroundColorPage.class);
		backgroundColor.whiteBackground();
	}

	@When("^I click on the SkyWhite Background button$")
	public void i_click_on_the_SkyWhite_Background_button() {
		backgroundColor.white();
	}

	@Then("^the background color will change to white$")
	public void the_background_color_will_change_to_white() {
		String expectedWhiteColorCode = "rgba(255, 255, 255, 1)";
		Assert.assertEquals(expectedWhiteColorCode, backgroundColor.validateWhiteColor());
	}

}
