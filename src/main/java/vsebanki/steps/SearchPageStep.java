package vsebanki.steps;

import io.cucumber.java.ru.И;
import vsebanki.managers.PageManager;
import vsebanki.pages.SearchPage;

public class SearchPageStep {

    PageManager pageManager = PageManager.getInstance();

    @И("^Перейти в калькулятор$")
    public void clickOnFilterButton(){
        pageManager.getPage(SearchPage.class).clickOnFilterButton();
    }

    @И("^Получить список предложений$")
    public void getListOfDeposit(){
        pageManager.getPage(SearchPage.class).getListOfDeposit();
    }

    @И("^Проверить в полученном списке, предложение от банка '(.+)' с процентной ставкой '(.+)' сроком на '(.+)' дня и необходимым доходом '(.+)'$")
    public void checkOffer(String nameOfBank, String bet, String period, String profit){
        pageManager.getPage(SearchPage.class).checkOffer(nameOfBank, bet, period, profit);
    }




}
