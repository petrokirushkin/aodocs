package base;

import com.codeborne.selenide.Selenide;
import config.SelenideConfig;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import utils.Constants;

public class BaseTest {

    @BeforeEach
    public void setUp() {
        SelenideConfig.createBrowserConfig("chrome");
        Selenide.open(Constants.URL);
    }

    @AfterEach
    public void tearDown() {
        Selenide.closeWebDriver();
    }
}

