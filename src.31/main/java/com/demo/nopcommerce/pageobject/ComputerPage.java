package com.demo.nopcommerce.pageobject;
/*
 * Created By Trupti Patel on 2019-05-20
 */

import com.demo.nopcommerce.utility.Util;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ComputerPage extends Util {

    // Adding logger for log.info
    private static final Logger log = LogManager.getLogger(ComputerPage.class.getName());
    @FindBy (xpath="//ul[@class='top-menu']//a[contains(text(),'Computers')]")
    WebElement _computer;

    @FindBy (xpath="//ul[@class='top-menu']//a[contains(text(),'Desktops')]")
            WebElement _Desktop;

   @FindBy(xpath="//ul[@class='top-menu']//a[contains(text(),'Notebooks')]")
           WebElement _NoteBook;
   @FindBy (xpath="//ul[@class='top-menu']//a[contains(text(),'Software')]")
   WebElement _software;

    @FindBy (xpath="//h1[contains(text(),'Computers')]")
    WebElement _computerText;

    //For debugging comments add description with the help of log.info
    public void clickOnComputerButton(){
        log.info("Click on computer button");
        clickonElement(_computer);
    }
    public void clickOnDesktopDropDownList(){
        log.info("Click on Desktop from dropdown list");
        selectVisibleTextFromDropDownMenu(_Desktop,"Desktops");
        clickonElement(_Desktop);
    }
    public void clickOnnotebooksDropDownList(){
        log.info("Click on notebiik from dropdown list");
        selectByIndexFromDropDownMenu(_NoteBook,1);
        clickonElement(_NoteBook);
    }
    public void clickOnSoftwareDropDownList(){
        log.info("Click on software");
        selectVisibleTextFromDropDownMenu(_software,"Software");
        clickonElement(_software);
    }
    public String getComputerText(){
        log.info("get computer text");
        return getTextFromElement(_computerText);
    }
    public boolean verifycomputerText() {
        if (getComputerText().equals("Computers")) {
            return true;
        } else {
            return false;
        }
    }

}
