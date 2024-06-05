package hybrid_frameworks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cyclos {
	WebDriver driver;
	public Cyclos(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}

   //Identify the elements
   @FindBy(xpath="//a[@id='register-link']")
    WebElement register;
    @FindBy(id="id_1")
    WebElement Name;
    @FindBy(id="id_2")
    WebElement Loginname;
    @FindBy(id="id_3")
    WebElement Email;
    @FindBy(id="id_4")
    WebElement Mobile;
    @FindBy(id="id_5")
    WebElement Landline;

   @FindBy(xpath="//button[@class='btn d-flex justify-content-center align-items-center w-100 h-100 btn-primary']")
   WebElement Nextbutton;
   @FindBy(id="id_7")
   WebElement Password;
   @FindBy(id="id_8")
   WebElement Confirmpassword;
   @FindBy(xpath="//span[text()='Submit']")
   WebElement Submitbutton;


    //Perform Actions
   public void clickregister() {
	  register.click();
}
   public void  setname(String fname) {
	  Name.sendKeys(fname);
  }
   public void setloginname(String lname) {
	Loginname.sendKeys(lname);
}
   public void setemail(String mname) {
	Email.sendKeys(mname);
}
  public void setmobile(String m1name) {
	Mobile.sendKeys(m1name);
}
  public void setlandline(String m2name) {
	Landline.sendKeys(m2name);
}
  public void clicknext() {
	Nextbutton.click();
}
   public void setpassword(String pwrd) {
	Password.sendKeys(pwrd);
}
  public void setconfirmpassword(String cnpwrd) {
	Confirmpassword.sendKeys(cnpwrd);
}
   public void clicksubmit() {
	Submitbutton.click();
}	
}
