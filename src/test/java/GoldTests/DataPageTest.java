package GoldTests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import GoldSteps.StaffPageSteps;
import GoldSteps.LoginPageSteps;
import GoldSteps.HomePageSteps;
import GoldSteps.ClientJourneySteps;
import GoldSteps.TrainingPageSteps;
import GoldSteps.DataPageSteps;

@RunWith(SerenityRunner.class)
public class DataPageTest extends BaseTest {

    @Steps
    LoginPageSteps loginPageSteps;
    @Steps
    HomePageSteps homePageSteps;
    @Steps
    ClientJourneySteps clientJourneySteps;
    @Steps
    StaffPageSteps staffPageSteps;
    @Steps
    TrainingPageSteps trainingPageSteps;
    @Steps
    DataPageSteps dataPageSteps;

    @Before
    public void setup() {
        loginPageSteps.isOnLoginPage();
        loginPageSteps.loginAsUser();
        loginPageSteps.loggedInAs();
        homePageSteps.navigateToHomePanel();
    }
    @Test
    public void DataPageTest(){
        dataPageSteps.navigateToDataPageStep();
    }
}