package page.ticktick;

import control.Button;
import org.openqa.selenium.By;

public class HiddenMenu {
    public Button menuButton= new Button(By.cssSelector("#project-ul .icon-more-for-folder"));
    public Button editButton= new Button(By.linkText("Edit"));
    public Button deleteButton= new Button(By.linkText("Delete"));

}
