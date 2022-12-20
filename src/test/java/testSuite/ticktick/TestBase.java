package testSuite.ticktick;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import page.ticktick.*;
import session.Session;
import util.GetProperties;

import java.time.Duration;

public class TestBase {

    MainPage mainPage = new MainPage();
    LoginSection loginSection = new LoginSection();
    ListSection listSection = new ListSection();

    ModalList modalListSection = new ModalList();

    HiddenMenu hiddenMenuSection = new HiddenMenu();
    ModalDelete modalDeleteSection = new ModalDelete();

    String user= GetProperties.getInstance().getUser();
    String password =GetProperties.getInstance().getPwd();

    @BeforeEach
    public void openBrowser(){
        // todo create property file

        Session.getInstance().getBrowser().get(GetProperties.getInstance().getHost());
    }

    @AfterEach
    public void closeBrowser(){
       // Session.getInstance().closeSession();
    }

}
