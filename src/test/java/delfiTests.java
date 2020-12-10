import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.ClassLoaderUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class delfiTests {
    private final By ACCEPT_COOKIES_BTN =  By.xpath(".//button[@mode = 'primary']");
    private final By ARTICLE_TITLE =  By.xpath(".//span[@itemprop = 'headline name']");
    @Test
    public void firstTest () {
        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get ("https://www.delfi.lv/");
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(ACCEPT_COOKIES_BTN));

       WebElement acceptBtn =  driver.findElement(ACCEPT_COOKIES_BTN);
       acceptBtn.click();

    }
    @Test
    public void tvnetTest() {
        String articleToOpen = "Aparjods notikumiem bagātā posmā Altenbergā izcīna bronzu";


        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get ("https://www.tvnet.lv/");
        driver.manage().window().maximize();

        List<WebElement> articles = driver.findElements(ARTICLE_TITLE);

//        System.out.println(articles.size());
//        System.out.println(articles.isEmpty());
//        System.out.print(articles.get(5).getText());

        //-----------------for--------------------
       //-counter start--till---------step-- (i++ -> i = i +1)
//        for (int i = 0; i < articles.size(); i++) {
//         //   System.out.println(articles.get(i).getText());
//            if (articles.get(i).getText().startsWith(articleToOpen)) {
//                articles.get(i).click();
//                break;
//            }
//        }
        //-------------foreach-----------------
        for(WebElement article : articles) {
            if (article.getText().startsWith(articleToOpen)) {
                article.click();
                break;
            }
        }
    }
}
