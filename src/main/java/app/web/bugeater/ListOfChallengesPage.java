package app.web.bugeater;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.*;

public class ListOfChallengesPage extends BasePage{

    //'List of Challenges' cookies popup accept button web element
    @FindBy(xpath = "//div[@class='modal-content']//button")
    private WebElement cookiesAcceptButton;

    //'List of Challenges' page navbar web elements
    //'List of Challenges' page header dropdown menu web element
    @FindBy(xpath = "//button[@class='btn btn-primary']")
    private WebElement listOfChallengesDropdownMenu;
    @FindBy(xpath = "//div[@data-testid='account']/button[@id='dropdown-basic-button']")
    private WebElement listOfChallengesAccountDropdownMenu;
    @FindBy(xpath = "//div[@data-testid='language']/button[@id='dropdown-basic-button']")
    private WebElement listOfChallengesUILanguageDropdownMenu;

    //'List of Challenges' page container web elements
    //'List of Challenges' page title web element
    @FindBy(xpath = "//div[@class='col']/h1")
    private WebElement listOfChallengesTitle;
    @FindBy(xpath = "//ul[@class='_menuList_1pmjj_10']/li[2]")
    private WebElement returnToListOfChallengesLink;
    //'List of Challenges' learn mode section title web element
    @FindBy(xpath = "//div[@class='col']/h2[1]")
    private WebElement listOfChallengesLearnModeTitle;
    //'List of Challenges' learn mode section challenge links list web element
    private List<WebElement> listOfChallengesLearnModeChallengeLinkElements = driver.findElements(By.xpath("//div[@class='col']/ul[1]/li/a"));
    //'List of Challenges' scripted testing section title web element
    @FindBy(xpath = "//div[@class='col']/h2[2]")
    private WebElement listOfChallengesScriptedTestingTitle;
    //'List of Challenges' scripted testing section challenge links list web element
    private List<WebElement> listOfChallengesScriptedTestingChallengeLinkElements = driver.findElements(By.xpath("//div[@class='col']/ul[2]/li/a"));
    //'List of Challenges' test case generator section title web element
    @FindBy(xpath = "//div[@class='col']/h2[3]")
    private WebElement listOfChallengesTestCaseGenTitle;
    //'List of Challenges' test case generator section challenge link web element
    @FindBy(xpath = "//div[@class='col']/ul[3]/li/a")
    private WebElement listOfChallengesTestCaseGenChallengeLink;
    //'List of Challenges' exploratory testing section title web element
    @FindBy(xpath = "//div[@class='col']/h2[4]")
    private WebElement listOfChallengesExploratoryTestingTitle;
    //'List of Challenges' exploratory testing section challenge links list web element
    private List<WebElement> listOfChallengesExploratoryTestingChallengeLinkElements = driver.findElements(By.xpath("//div[@class='col']/ul[4]/li/a"));

    //'List of Challenges' page footer web elements
    @FindBy(xpath = "//div[@class='_footerLinks_8nul2_8']/a[1]")
    private WebElement listOfChallengesTermsConditionsLink;
    @FindBy(xpath = "//div[@class='_footerLinks_8nul2_8']/a[2]")
    private WebElement listOfChallengesPrivacyPolicyLink;
    @FindBy(xpath = "//div[@class='_footerLinks_8nul2_8']/a[3]")
    private WebElement listOfChallengesLeaveFeedbackLink;
    //'List of Challenges' page footer social links web elements
    @FindBy(xpath = "//div[@class='_socialLinks_8nul2_62']/a[1]")
    private WebElement listOfChallengesLinkedInIconButton;
    @FindBy(xpath = "//div[@class='_socialLinks_8nul2_62']/a[2]")
    private WebElement listOfChallengesFacebookIconButton;
    @FindBy(xpath = "//div[@class='_socialLinks_8nul2_62']/a[3]")
    private WebElement listOfChallengesInstagramIconButton;
    //'List of Challenges' page footer copyright web elements
    @FindBy(xpath = "//div[@class='_footerCopy_8nul2_57']")
    private WebElement listOfChallengesCopyrightSign;

    public ListOfChallengesPage(WebDriver driver) {
        super(driver);
    }

    //click accept cookies button method
    public void clickAcceptCookiesButton(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.elementToBeClickable(cookiesAcceptButton));
        cookiesAcceptButton.click();
    }

    //click navbar dropdown menu button method
    public void clickNavbarDropdownMenu(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.elementToBeClickable(listOfChallengesDropdownMenu));
        listOfChallengesDropdownMenu.click();
    }
    //(return to 'List of Challenges' after each challenge completion) link click method
    public void clickReturnToListOfChallengesLink(){returnToListOfChallengesLink.click();}

    //click challenge link list method
    public void clickListOfChallengesChallengeLink(int linkIndex){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(600));
        wait.until(ExpectedConditions.elementToBeClickable(listOfChallengesLearnModeChallengeLinkElements.get(linkIndex)));
        listOfChallengesLearnModeChallengeLinkElements.get(linkIndex).click();
    }
    //click number addition challenge link method
    public void clickLearnModeChallengeLink1(){clickListOfChallengesChallengeLink(0);}

    //list of challenges page title getter
    public String getListOfChallengesPageTitle(){return listOfChallengesTitle.getText();}
    //learn more section title getter
    public String getLearnModeSectionTitle(){return listOfChallengesLearnModeTitle.getText();}

    //'List of Challenges' page web element assert methods
    public boolean isListOfChallengesDropdownMenuDisplayed(){return listOfChallengesDropdownMenu.isDisplayed();}
    public boolean isListOfChallengesAccountDropdownMenuDisplayed(){return listOfChallengesAccountDropdownMenu.isDisplayed();}
    public boolean isListOfChallengesLanguageDropdownMenuDisplayed(){return listOfChallengesUILanguageDropdownMenu.isDisplayed();}
    public boolean isListOfChallengesTitleDisplayed(){return listOfChallengesTitle.isDisplayed();}

    public boolean isListOfChallengesLearnModeTitleDisplayed(){return listOfChallengesLearnModeTitle.isDisplayed();}
    public boolean isListOfChallengesLearnModeChallengeLinkDisplayed(){
        for(WebElement link : listOfChallengesLearnModeChallengeLinkElements){
            if (!link.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isListOfChallengesScriptedTestingChallengeTitleDisplayed(){return listOfChallengesScriptedTestingTitle.isDisplayed();}
    public boolean isListOfChallengesScriptedTestingChallengeLinkDisplayed(){
        for(WebElement link : listOfChallengesScriptedTestingChallengeLinkElements){
            if (!link.isDisplayed()) {
                return false;
            }
        }
        return true;
    }
    public boolean isListOfChallengesExploratoryTestingChallengeTitleDisplayed(){return listOfChallengesExploratoryTestingTitle.isDisplayed();}
    public boolean isListOfChallengesExploratoryTestingChallengeLinkDisplayed(){
        for(WebElement link : listOfChallengesExploratoryTestingChallengeLinkElements){
            if (!link.isDisplayed()) {
                return false;
            }
        }
        return true;
    }

    public boolean isListOfChallengesTestCaseGenChallengeTitleDisplayed(){return listOfChallengesTestCaseGenTitle.isDisplayed();}
    public boolean isListOfChallengesTestCaseGenChallengeLinkDisplayed(){return listOfChallengesTestCaseGenChallengeLink.isDisplayed();}

    public boolean isListOfChallengesTermsConditionsLinkDisplayed(){return listOfChallengesTermsConditionsLink.isDisplayed();}
    public boolean isListOfChallengesPrivacyPolicyLinkDisplayed(){return listOfChallengesPrivacyPolicyLink.isDisplayed();}
    public boolean isListOfChallengesLeaveFeedbackLinkDisplayed(){return listOfChallengesLeaveFeedbackLink.isDisplayed();}
    public boolean isListOfChallengesLinkedInIconButtonDisplayed(){return listOfChallengesLinkedInIconButton.isDisplayed();}
    public boolean isListOfChallengesFacebookIconButtonDisplayed(){return listOfChallengesFacebookIconButton.isDisplayed();}
    public boolean isListOfChallengesInstagramIconButtonDisplayed(){return listOfChallengesInstagramIconButton.isDisplayed();}
    public boolean isListOfChallengesCopyrightElementDisplayed(){return listOfChallengesCopyrightSign.isDisplayed();}
}
