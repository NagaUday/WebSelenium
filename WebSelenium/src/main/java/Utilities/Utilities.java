package Utilities;

import Pages.BasePage;
import org.openqa.selenium.By;

public class Utilities extends BasePage {

    public enum PopUp{
        COOKIES
    }

    public static boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        }
        catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

}
