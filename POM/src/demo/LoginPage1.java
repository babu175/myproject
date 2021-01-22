package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1  {

	static WebDriver driver;
	@FindBy(xpath="//*[@id='username']")
	private WebElement txtUserName;
	@FindBy(id="password")
	private WebElement txtUserPassword;
	@FindBy(id="login")
	private WebElement btnLoginButton;
	@FindBy(xpath="//*[@alt='AdactIn Group']")
	private WebElement imgAdactinLogo;
	@FindBy(xpath="//*[@class='header_title']")
	private WebElement imgHeader;
	@FindBy(xpath="//*[text()='Welcome to AdactIn Group of Hotels']")
	private WebElement imgWelcome;
	@FindBy(xpath="//*[@alt='Hotel Image 1']")
	private WebElement imgHotel1;
	@FindBy(xpath="//*[@alt='Hotel Image 2']")
	private WebElement imgHotel2;
	@FindBy(xpath="//*[@alt='Hotel Image 3']")
	private WebElement imgHotel3;
	@FindBy(xpath="//*[@alt='Hotel Image 4']")
	private WebElement imgHotel4;
	@FindBy(xpath="//*[text()='Existing User Login - Build 1']")
	private WebElement txtExUser;
	@FindBy(xpath="//*[text()='Forgot Password?']")
	private WebElement txtForPass;
	@FindBy(xpath="//*[text()='New User Register Here']")
	private WebElement txtNewUser;
	@FindBy(xpath="//*[text()='Important Note:']")
	private WebElement txtImpNote;
	public WebElement getImgAdactinLogo() {
	return imgAdactinLogo;
	}
	public void setImgAdactinLogo(WebElement imgAdactinLogo) {
	this.imgAdactinLogo = imgAdactinLogo;
	}
	public WebElement getImgHeader() {
	return imgHeader;
	}
	public void setImgHeader(WebElement imgHeader) {
	this.imgHeader = imgHeader;
	}
	public WebElement getImgWelcome() {
	return imgWelcome;
	}
	public void setImgWelcome(WebElement imgWelcome) {
	this.imgWelcome = imgWelcome;
	}
	public WebElement getImgHotel1() {
	return imgHotel1;
	}
	public void setImgHotel1(WebElement imgHotel1) {
	this.imgHotel1 = imgHotel1;
	}
	public WebElement getImgHotel2() {
	return imgHotel2;
	}
	public void setImgHotel2(WebElement imgHotel2) {
	this.imgHotel2 = imgHotel2;
	}
	public WebElement getImgHotel3() {
	return imgHotel3;
	}
	public void setImgHotel3(WebElement imgHotel3) {
	this.imgHotel3 = imgHotel3;
	}
	public WebElement getImgHotel4() {
	return imgHotel4;
	}
	public void setImgHotel4(WebElement imgHotel4) {
	this.imgHotel4 = imgHotel4;
	}
	public WebElement getTxtExUser() {
	return txtExUser;
	}
	public void setTxtExUser(WebElement txtExUser) {
	this.txtExUser = txtExUser;
	}
	public WebElement getTxtForPass() {
	return txtForPass;
	}
	public void setTxtForPass(WebElement txtForPass) {
	this.txtForPass = txtForPass;
	}
	public WebElement getTxtNewUser() {
	return txtNewUser;
	}
	public void setTxtNewUser(WebElement txtNewUser) {
	this.txtNewUser = txtNewUser;
	}
	public WebElement getTxtImpNote() {
	return txtImpNote;
	}
	public void setTxtImpNote(WebElement txtImpNote) {
	this.txtImpNote = txtImpNote;
	}
	public LoginPage1 (WebDriver ldriver) {
	LoginPage1.driver=ldriver;
	PageFactory.initElements(driver, this);
	}
	public WebElement getimgAdactinLogo() {
	return imgAdactinLogo;
	}
	public void setimgAdactinLogo(WebElement imgAdactinLogo) {
	this.imgAdactinLogo = imgAdactinLogo;
	}
	public String getTxtUserName() {
	return txtUserName.getAttribute("value");
	}
	public void setTxtUserName(String txtUserName) {
	this.txtUserName.sendKeys(txtUserName);
	}
	public String getTxtUserPassword() {
	return txtUserPassword.getAttribute("value");
	}
	public void setTxtUserPassword(String txtUserPassword) {
	this.txtUserPassword.sendKeys(txtUserPassword);
	}
	public WebElement getBtnLoginButton() {
	return btnLoginButton;
	}
	public void setBtnLoginButton(WebElement btnLoginButton) {
	this.btnLoginButton = btnLoginButton;
	}
	}
		
		
		
		

	


