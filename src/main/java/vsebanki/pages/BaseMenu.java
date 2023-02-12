package vsebanki.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class BaseMenu extends BasePage {

    @FindBy(xpath = "//div[@data-test='subsections-item']")
    private List<WebElement> listBaseMenu;

    @FindBy(xpath = "//div[contains(@class, 'submenu-item')]")
    private List<WebElement> listSubMenu;

    public BaseMenu selectBaseMenuByName(String name) {
        for(WebElement baseMenu : listBaseMenu){
            if(baseMenu.getText().equalsIgnoreCase(name))
                baseMenu.click();
            return this;
        }
        return this;
    }

    public SearchPage selectSubMenuByName (String name) {
        for(WebElement subMenu : listSubMenu){
            if(subMenu.getText().equalsIgnoreCase(name))
                subMenu.click();
            return pageManager.getPage(SearchPage.class);
        }
        return pageManager.getPage(SearchPage.class);
    }


}
