package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sign_out  {
	public class NextPage1 {
		WebDriver driver;
		@FindBy(xpath="//*[text()='Logout']")
		private WebElement txtLogout;
		public WebElement getTxtLogout() {
		return txtLogout;
		}
		public void setTxtLogout(WebElement txtLogout) {
		this.txtLogout = txtLogout;
		}
		public NextPage1(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
		}
	}}

