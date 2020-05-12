package stepDefinitions;

import java.util.Properties;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import pageObjects.AddCustomerPage;
import pageObjects.LoginPage;
import pageObjects.SearchCustomerPage;
import org.apache.log4j.Logger;

public class BaseClass 
{
	public WebDriver driver;
    public LoginPage lp;
    public AddCustomerPage addCust;
    public SearchCustomerPage searchCust; 
    public static Logger logger;
    Properties configProp;


    //Created for generating random string for Unique email
    public static String randomestring() {
        String generatedString1 = RandomStringUtils.randomAlphabetic(5);
        return (generatedString1);
    }
	

}
