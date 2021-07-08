package Pages.WelcomePage;
import Pages.BasePage;
import Pages.WelcomePage.Footer.FooterPage;
import Utilities.Utilities.PopUp;


public class WelcomePage extends BasePage {
    public FooterPage Footer;
    public WelcomePage()
    {
        Footer = new FooterPage();
    }
    public static String PageTitle = "index";

    public void LanuchApplication(){
        NavigateToHomePage();
    }

    public void DismissPopUpWindow() {
        PopUPHandler(PopUp.COOKIES);
    }

}
