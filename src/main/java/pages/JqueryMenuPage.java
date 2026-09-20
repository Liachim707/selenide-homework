package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class JqueryMenuPage {

    private final SelenideElement enabledItem =
            $("#ui-id-3");

    private final SelenideElement downloadsItem =
            $("#ui-id-4");

    private final SelenideElement pdfItem =
            $("#ui-id-5");

    private final SelenideElement csvItem =
            $("#ui-id-6");

    private final SelenideElement excelItem =
            $("#ui-id-7");

    public JqueryMenuPage openPage() {
        open("https://the-internet.herokuapp.com/jqueryui/menu");
        return this;
    }

    public JqueryMenuPage checkMenuVisible() {
        $("#menu").shouldBe(Condition.visible);
        return this;
    }

    public JqueryMenuPage hoverEnabled() {
        enabledItem.hover();
        return this;
    }

    public JqueryMenuPage checkDownloadsVisible() {
        downloadsItem.shouldBe(Condition.visible);
        return this;
    }

    public JqueryMenuPage hoverDownloads() {
        downloadsItem.hover();
        return this;
    }

    public JqueryMenuPage checkSubmenuVisible() {
        pdfItem.shouldBe(Condition.visible);
        csvItem.shouldBe(Condition.visible);
        excelItem.shouldBe(Condition.visible);
        return this;
    }

    public JqueryMenuPage clickPdf() {
        pdfItem.click();
        return this;
    }

    public SelenideElement getPdfItem() {
        return pdfItem;
    }
}
