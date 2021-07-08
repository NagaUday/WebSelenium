package Pages.WelcomePage.Footer;

import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import static Utilities.Utilities.isElementPresent;

public class FooterPage extends BasePage {
    public static By footer = By.xpath("//*[@id=\"1463071057475\"]/div/div[1]");

    public static By footer_title=By.xpath("//*[@id=\"1463071057475\"]/div/div[1]//*/div[@class=\"title_txt\"]");

    public  boolean IsAllFooterTitleDispalyed(String footerTitleText){
        List<WebElement> elements = driver.findElements(footer_title);
        for(WebElement element : elements)
        {

            if (element.getText().equalsIgnoreCase(footerTitleText))
            {
                return true;
            }
        }
        return false;
    }

    public  void NavigateToFooter() throws Exception{
        WebElement element = driver.findElement(footer);
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();
    }

    public boolean ValidateTheFooterBulletOptions(String option)
    {
        String element = String.format("//a[normalize-space()='%s']",option);
        return isElementPresent(By.xpath(element));
    }
}
