import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.List;

public class tvNetTest {
    private WebDriver driver;
    private final By ARTICLE = By.xpath(".//article[@class='list-article']/a");
    private final By COMMENTS_BUTTON =  By.xpath(".//a[contains(@class, 'article-share__item--comments')]");


    @BeforeEach
    public void beforeEach () {
        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.tvnet.lv/");
        driver.manage().window().maximize();

    }
    @AfterEach
    public void afterEach() {
        driver.quit();
    }

    // from home page go to any article. from article page go to comments section
    @Test
    public void test1() throws InterruptedException {
        driver.findElement(ARTICLE).click();
        driver.findElement(COMMENTS_BUTTON).click();
    }

    // * perehod s glavnoj stranici sdelatj ne na ljubuju statju a na opredeljonnuju statju (spiski)
    @Test
    public void test2() {
        List<WebElement> elements = driver.findElements(ARTICLE);
        WebElement targetElement = elements.get(4);
        targetElement.click();
    }
    ///

    // ** perehodim na stjatju po nazvaniju statji
    @Test
    public void test3_v1_cycle() {
        String ARTICLE_TEXT = "Pret vairākām";
        List<WebElement> articles = driver.findElements(ARTICLE);
        for(WebElement we: articles) {
            String weText = we.getText();
            boolean isEqualText = weText.startsWith(ARTICLE_TEXT);
            if(isEqualText) {
                we.click();
                break;
            }
        }
    }

    @Test
    public void test4() {
        By ARTICLE_TEXT_SELECTOR = By.xpath("//text()[contains(.,'Pret vairākām')]/ancestor::article/a");
        driver.findElement(ARTICLE_TEXT_SELECTOR).click();
    }


        // *** perehodja po etim trjom stranicam sdelatj proverki, chto zagolovok na kazhdoj stranice praviljnij
        // **** kolichestvo kommentariev odinakovoe na kazhdoj stranice
        // ***** poschitatj realjnie komentarii i proveritj chto ih kolichestvo sovpadaet s tem chto na schetchikah. int

}
