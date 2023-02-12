package vsebanki.steps;

import io.cucumber.java.ru.И;
import vsebanki.managers.PageManager;
import vsebanki.pages.BaseMenu;

public class BaseMenuStep {

    PageManager pageManager = PageManager.getInstance();

    @И("^Выбрать базовоe меню '(.+)'$")
    public void selectBaseMenuByName(String nameBaseMEnu) {
        pageManager.getPage(BaseMenu.class).selectBaseMenuByName(nameBaseMEnu);
    }

    @И("^Выбрать подменю '(.+)'$")
    public void selectSubMenuByName(String nameSubMenu) {
        pageManager.getPage(BaseMenu.class).selectSubMenuByName(nameSubMenu);
    }


}
