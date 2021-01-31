import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class FirstFullTest {
    private final By ARTICLE = By.tagName("article");
    private final By ARTICLE_TITLE =  By.xpath(".//span[@itemprop = 'headline name']");
    private final By COMMENTS_COUNT = By.xpath(".//span[contains(@class, 'list-article__comment')]");
    private final By ARTICLE_PAGE_TITLE = By.xpath(".//h1[@itemprop = 'headline name']");
    private final By ACCEPT_BTN = By.xpath(".//div[contains(@class, 'button cookie')]");


    private final Logger LOGGER = LogManager.getLogger(FirstFullTest.class);


    @Test
    public void titleCommectsCheck() {

        LOGGER.info("This test is checking titles and comments on TVNET page");
        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");

        LOGGER.info("We are opening browser window");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        LOGGER.info("Going to TVNET home page");
        driver.get ("https://www.tvnet.lv/");

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(ACCEPT_BTN));

        WebElement acceptBtn =  driver.findElement(ACCEPT_BTN);
        acceptBtn.click();

        //Find article
        WebElement currentArticle = driver.findElements(ARTICLE).get(3);

        //Store title
        String titleToCheck = currentArticle.findElement(ARTICLE_TITLE).getText();

        //store comments count
        int commentCount = 0;

        if (!currentArticle.findElements(COMMENTS_COUNT).isEmpty()) {
            String commentsToParse = currentArticle.findElement(COMMENTS_COUNT).getText(); //(36)
            commentsToParse = commentsToParse.substring(1, commentsToParse.length() -1); //(36) -> 36
            commentCount = Integer.parseInt(commentsToParse);
        }

        //Open article
        currentArticle.findElement(ARTICLE_TITLE).click();

        //Check title
        Assertions.assertEquals(titleToCheck, driver.findElement(ARTICLE_PAGE_TITLE).getText(), "Incorrect title");

        //Check comments
        Assertions.assertEquals( commentCount, driver.findElement(COMMENTS_COUNT).getText(), "Comments don't exist");

        //Click on comments
        List<WebElement> elements = driver.findElements(COMMENTS_COUNT);
        WebElement targetElement = elements.get(4);
        targetElement.click();

        //Check title
        Assertions.assertEquals(titleToCheck, driver.findElement(ARTICLE_PAGE_TITLE).getText(), "Incorrect title");

        //Check comments count


    }
}
