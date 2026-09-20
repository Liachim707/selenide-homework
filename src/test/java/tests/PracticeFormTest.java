package tests;

import com.codeborne.selenide.BaseElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.PracticeFormPage;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.closeWebDriver;

class PracticeFormTest {

    private PracticeFormPage formPage;

    @BeforeEach
    void setUp() {
        formPage = new PracticeFormPage();
        formPage.openPage();
    }

    @Test
    void formFieldsShouldBeVisible() {
        formPage.checkFormVisible();
    }

    @Test
    void userShouldBeAbleToEnterData() {
        formPage
                .setFirstName("Ivan")
                .setLastName("Ivanov")
                .setEmail("ivan.ivanov@example.com")
                .selectMaleGender()
                .setMobile("9876543210")
                .setSubject("Math")
                .selectSportsHobby()
                .setAddress("Moscow, Red Square");

        formPage.getFirstName()
                .shouldHave(value("Ivan"));

        formPage.getLastName()
                .shouldHave(value("Ivanov"));

        formPage.getEmail()
                .shouldHave(value("ivan.ivanov@example.com"));

        formPage.getMobile()
                .shouldHave(value("9876543210"));
    }

    @Test
    void requiredFieldsShouldBeValidated() {
        formPage.submit();

        formPage.getFirstName()
                .shouldHave(attribute("class", "form-control"));
    }

    @Test
    void validFormShouldBeSubmitted() {
        formPage
                .setFirstName("Ivan")
                .setLastName("Ivanov")
                .setEmail("ivan.ivanov@example.com")
                .selectMaleGender()
                .setMobile("9876543210")
                .setSubject("Math")
                .selectSportsHobby()
                .setAddress("Moscow, Red Square")
                .submit();

        $("#example-modal-sizes-title-lg")
                .shouldBe(visible)
                .shouldHave(text("Thanks for submitting the form"));
    }

    @AfterEach
    void tearDown() {Л
        closeWebDriver();
    }
}
