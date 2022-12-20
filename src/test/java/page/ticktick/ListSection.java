package page.ticktick;

import control.Button;
import control.Label;
import org.openqa.selenium.By;

public class ListSection {
    //String nameList;
    /*public void ListSection(String nameList){
        this.nameList = nameList;
    }*/
    public Button addListButton= new Button(By.xpath("//*[@id='project-list-scroller']/div[2]/section[1]/div[1]/li/a/button[2]"));
   // public Label listLabel = new Label(By.xpath("//p[text()='"+nameList+"' and contains(@class,'text-s')]"));

    public boolean isListDisplayed(String nameList){
        Label listCreated = new Label(By.xpath("//p[text()='"+nameList+"' and contains(@class,'text-s')]"));
        return listCreated.isControlDisplayed();
    }
}
