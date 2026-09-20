package tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.JqueryMenuPage;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Selenide.closeWebDriver;

class JqueryMenuTest {

    private JqueryMenuPage menuPage;

    @BeforeEach
    void setUp() {
        menuPage = new JqueryMenuPage();
        menuPage.openPage();
    }

    @Test
    void menuShouldBeVisible() {
        menuPage.checkMenuVisible();
    }

    @Test
    void submenuShouldAppearAfterHover() {
        menuPage
                .checkMenuVisible()
                .hoverEnabled()
                .checkDownloadsVisible()
                .hoverDownloads()
                .checkSubmenuVisible();
    }

    @Test
    void pdfMenuItemShouldBeInteractive() {
        menuPage
                .hoverEnabled()
                .hoverDownloads();

        menuPage.getPdfItem()
                .shouldBe(enabled);
    }

    @Test
    void pdfMenuItemShouldBeClickable() {
        menuPage
                .hoverEnabled()
                .hoverDownloads()
                .clickPdf();
    }

    @BeforeEach
    void afterTest() {
        closeWebDriver();
    }
}
