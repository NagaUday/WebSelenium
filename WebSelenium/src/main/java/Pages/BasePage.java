package Pages;

import Utilities.Utilities.PopUp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class BasePage {
    public static WebDriver driver;
    private static String HOME_PAGE_URL= "https://easybankingbusiness.bnpparibasfortis.be/en/index?axes1=en&axes2=PC&axes3=fb&axes4=rpb";

    public static void NavigateToHomePage(){
        driver.get(HOME_PAGE_URL);
    }

    public static void PopUPHandler(PopUp popUp){

        try{
            driver.switchTo().frame(driver.findElement(By.id("cc_iframe1")));
            if (popUp == PopUp.COOKIES) {
                driver.findElement(By.id("cookies_accept_btn")).click();
            }
            driver.switchTo().defaultContent();
        }catch(Exception errorMessage){
            //TODO: DO nothing
        }

    }

}
