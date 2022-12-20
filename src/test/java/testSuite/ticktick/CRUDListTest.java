package testSuite.ticktick;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class CRUDListTest extends TestBase {

    @Test
    public void verifyCRUDList() throws InterruptedException {
        String listCreated = "List";
        String listUpdated = "UPDATED";
        //LogIn
        mainPage.signInLabel.click();
        loginSection.emailOrPhoneTextBox.setText(user);
        loginSection.passwordTextBox.setText(password);
        loginSection.signInButton.click();



        //Create New Project
        listSection.addListButton.click();
        modalListSection.nameListTextBox.setText(listCreated);
        modalListSection.saveButton.click();

        Assertions.assertTrue(listSection.isListDisplayed(listCreated),"ERROR! the list was not created");

        //Update Project

        hiddenMenuSection.menuButton.click();
        hiddenMenuSection.editButton.click();
        modalListSection.nameListTextBox.cleanSetText(listUpdated);
        modalListSection.saveButton.click();
        Assertions.assertTrue(listSection.isListDisplayed(listCreated+listUpdated),"ERROR! the list was not updated");


        //Delete Project
        hiddenMenuSection.menuButton.click();
        hiddenMenuSection.deleteButton.click();
        modalDeleteSection.deleteButton.click();
        Assertions.assertFalse(listSection.isListDisplayed(listCreated+listUpdated),"ERROR! the list was not deleted");

    }
}
