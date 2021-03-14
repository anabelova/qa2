package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

public class ArticlePage {
    private BaseFunc baseFunc;
    private final By TITLE = By.tagName("h1");
    private final Logger LOGGER = LogManager.getLogger(this.getClass());
    private final By COMMENTS_ICO = By.xpath(".//a[contains(@class, 'item--comments')]");

    public ArticlePage(BaseFunc baseFunc){
        this.baseFunc = baseFunc;
    }

    public String getTitle() {
        LOGGER.info("Getting article title");
        return baseFunc.getText(TITLE);
    }
    public void openCommentsPage(){
        baseFunc.click(COMMENTS_ICO);
    }
}
