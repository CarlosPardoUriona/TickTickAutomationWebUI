package page.ticktick;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class LoginSection {

    public TextBox emailOrPhoneTextBox = new TextBox(By.id("emailOrPhone"));
    public TextBox passwordTextBox = new TextBox(By.id("password"));
    public Button signInButton= new Button(By.xpath("//button[text()='Sign In']"));


}
