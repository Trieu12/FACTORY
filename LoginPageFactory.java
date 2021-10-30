package Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class LoginPageFactory {
    
    WebDriver driver;
    
    @FindBy(name="uid")
    WebElement user99GuruName;
    
    @FindBy(name="password")
    WebElement password99Guru;
    
    @FindBy(className="barone")
    WebElement titleText;
    
    @FindBy(name="btnLogin")
    WebElement login;

    public LoginPageFactory(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    //UserName
    public void setUserName(String strUserName){
        user99GuruName.sendKeys(strUserName);     
    }
    
    //Password
    public void setPassword(String strPassword){
    	password99Guru.sendKeys(strPassword);
    }
    
    //Click
    public void clickLogin(){
    	login.click();
    }  

    //Title
    public String getLoginTitle(){
     return    titleText.getText();

    }
    
    //GetUserName&Password
    public void loginToGuru99(String strUserName,String strPasword){
    	this.setUserName(strUserName);

        this.setPassword(strPasword);

        this.clickLogin();           

    }

}
