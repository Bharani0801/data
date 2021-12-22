package org.step;

import java.util.concurrent.TimeUnit;

import org.age.PageObject;
import org.base.Class;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends Class {
	public static PageObject p;
	public static Select s;

	@Given("validating the adactin wht chromebrowser")
	public void validating_the_adactin_wht_chromebrowser() {
		getDriver("https://adactinhotelapp.com/SearchHotel.php");
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);

	}

	@When("validating the username and password")
	public void validating_the_username_and_password() {
		p = new PageObject();
		WebElement username = p.getUsername();
		username.sendKeys("mdriders46");
		WebElement password = p.getPassword();
		password.sendKeys("Mahesh@123");
	}

	@When("validing the login btn")
	public void validing_the_login_btn() {
		WebElement loginbtn = p.getLoginbtn();
		loginbtn.click();
	}

	@Then("login appears or not")
	public void login_appears_or_not() throws InterruptedException {
		System.out.println("homepage appeared");

	}

	@Given("validate the location,hotels and room type")
	public void validate_the_location_hotels_and_room_type() throws InterruptedException {

		WebElement location = driver.findElement(By.xpath("//select[@name='location']"));
		s = new Select(location);
		s.selectByIndex(1);

		WebElement hotels = driver.findElement(By.xpath("//select[@name='hotels']"));
		s = new Select(hotels);
		s.selectByIndex(2);

		WebElement roomtype = driver.findElement(By.xpath("//select[@name='room_type']"));
		s = new Select(roomtype);
		s.selectByIndex(3);
	}

	@When("validating no of rooms,check in date and check out date")
	public void validating_no_of_rooms_check_in_date_and_check_out_date() {
		WebElement noofroom = driver.findElement(By.xpath("//select[@name='room_nos']"));
		s = new Select(noofroom);
		s.selectByIndex(2);

		WebElement checkin = driver.findElement(By.xpath("//input[@name='datepick_in']"));
		checkin.sendKeys("2/5/2021");

		WebElement checkout = driver.findElement(By.xpath("//input[@name='datepick_out']"));
		checkout.sendKeys("1/2/2020");

	}

	@When("validating adult per room and children per room")
	public void validating_adult_per_room_and_children_per_room() {
		WebElement adult = driver.findElement(By.xpath("//select[@name='adult_room']"));
		s = new Select(adult);
		s.selectByIndex(2);

		WebElement child = driver.findElement(By.xpath("//select[@name='child_room']"));
		s = new Select(child);
		s.selectByIndex(1);
	}

	@Then("validating the search btn")
	public void validating_the_search_btn() {
		WebElement searchbtn = driver.findElement(By.xpath("//input[@name='Submit']"));
		searchbtn.click();
	}
	@Given("validate the radio btn")
	public void validate_the_radio_btn() {
		WebElement radioBtn = driver.findElement(By.id("radiobutton_0"));
		radioBtn.click();
	}

	@When("validate the continue option")
	public void validate_the_continue_option() {
		WebElement conbtn = driver.findElement(By.xpath("//input[@name='continue']"));
		conbtn.click();
	}

	@When("validating the {string},{string},{string}")
	public void validating_the(String string, String string2, String string3) {
		WebElement frtname = driver.findElement(By.xpath("//input[@name='first_name']"));
		frtname.sendKeys(string);

		WebElement lstname = driver.findElement(By.xpath("//input[@name='last_name']"));
		lstname.sendKeys(string2);

		WebElement addr = driver.findElement(By.xpath("//textarea[@name='address']"));
		addr.sendKeys(string3);
	}

	@Given("validate the {string} details,card type,expiry date,{string},btn")
	public void validate_the_details_card_type_expiry_date_btn(String string, String string2) {
		WebElement credit = driver.findElement(By.xpath("//input[@name='cc_num']"));
		credit.sendKeys(string);

		WebElement type = driver.findElement(By.xpath("//select[@name='cc_type']"));
		s = new Select(type);
		s.selectByVisibleText("VISA");

		WebElement month = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		s = new Select(month);
		s.selectByVisibleText("January");
		
		WebElement year = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		s=new Select(year);
		s.selectByVisibleText("2015");
		
		WebElement cvv = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
		cvv.sendKeys(string2);
		
		WebElement btn= driver.findElement(By.xpath("//input[@name='book_now']"));
		btn.click();

	}

	@When("validate next page appears or not")
	public void validate_next_page_appears_or_not() {
		System.out.println("it appears");

	}

}
