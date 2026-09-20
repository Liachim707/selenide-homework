package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class PracticeFormPage {

    private final SelenideElement firstName =
            $("#firstName");

    private final SelenideElement lastName =
            $("#lastName");

    private final SelenideElement email =
            $("#userEmail");

    private final SelenideElement maleGender =
            $("label[for='gender-radio-1']");

    private final SelenideElement femaleGender =
            $("label[for='gender-radio-2']");

    private final SelenideElement mobile =
            $("#userNumber");

    private final SelenideElement subject =
            $("#subjectsInput");

    private final SelenideElement sportsHobby =
            $("label[for='hobbies-checkbox-1']");

    private final SelenideElement address =
            $("#currentAddress");

    private final SelenideElement submitButton =
            $("#submit");

    public PracticeFormPage openPage() {
        open("https://demoqa.com/automation-practice-form");
        return this;
    }

    public PracticeFormPage checkFormVisible() {
        firstName.shouldBe(Condition.visible);
        lastName.shouldBe(Condition.visible);
        email.shouldBe(Condition.visible);
        mobile.shouldBe(Condition.visible);
        address.shouldBe(Condition.visible);
        submitButton.shouldBe(Condition.visible);

        return this;
    }

    public PracticeFormPage setFirstName(String value) {
        firstName.setValue(value);
        return this;
    }

    public PracticeFormPage setLastName(String value) {
        lastName.setValue(value);
        return this;
    }

    public PracticeFormPage setEmail(String value) {
        email.setValue(value);
        return this;
    }

    public PracticeFormPage selectMaleGender() {
        maleGender.click();
        return this;
    }

    public PracticeFormPage selectFemaleGender() {
        femaleGender.click();
        return this;
    }

    public PracticeFormPage setMobile(String value) {
        mobile.setValue(value);
        return this;
    }

    public PracticeFormPage setSubject(String value) {
        subject.setValue(value);
        return this;
    }

    public PracticeFormPage selectSportsHobby() {
        sportsHobby.click();
        return this;
    }

    public PracticeFormPage setAddress(String value) {
        address.setValue(value);
        return this;
    }

    public PracticeFormPage submit() {
        submitButton.click();
        return this;
    }

    public SelenideElement getFirstName() {
        return firstName;
    }

    public SelenideElement getLastName() {
        return lastName;
    }

    public SelenideElement getEmail() {
        return email;
    }

    public SelenideElement getMobile() {
        return mobile;
    }
}
