package vsebanki.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.ru.И;
import vsebanki.managers.PageManager;
import vsebanki.pages.FilterForm;

import java.util.List;

public class FilterFormStep {

    PageManager pageManager = PageManager.getInstance();

    @И("^Ввести сумму вклада '(.+)'$")
    public void inputAmountSum(String count){
        pageManager.getPage(FilterForm.class).inputAmountSum(count);
    }
    @И("^Проверить введенную сумму вклада '(.+)'$")
    public void checkInputSum(String count) {
        pageManager.getPage(FilterForm.class).checkInputSum(count);
    }

    @И("^Выбрать срок вклада '(.+)'$")
    public void selectTimeOfContribution(String time){
        pageManager.getPage(FilterForm.class).selectTimeOfContribution(time);
    }

    @И("^Проверить срок вклада '(.+)'$")
    public void checkTimeOfContribution(String time) {
        pageManager.getPage(FilterForm.class).checkTimeOfContribution(time);
    }

    @И("^Выбрать тип вклада '(.+)'$")
    public void selectTypeOfContribution(String name){
        pageManager.getPage(FilterForm.class).selectTypeOfContribution(name);
    }

    @И("^Проверить тип вклада '(.+)'$")
    public void checkTypeOfContribution(String name){
        pageManager.getPage(FilterForm.class).checkTypeOfContribution(name);
    }

    @И("^Выбрать банки:$")
    public void selectBanks(DataTable dataTable){
        List<String> banks = dataTable.asList(String.class);
        pageManager.getPage(FilterForm.class).selectBanks(banks);
    }

    @И("^Проверить выбранные банки:$")
    public void checkBanks(DataTable dataTable){
        List<String> banks = dataTable.asList(String.class);
        pageManager.getPage(FilterForm.class).checkBanks(banks);
    }

    @И("^Выбрать дополнительные параметры вклада:$")
    public void selectCheckBoxes(DataTable dataTable){
        List<String> parameters = dataTable.asList(String.class);
        pageManager.getPage(FilterForm.class).selectCheckBoxes(parameters);
    }

    @И("^Проверить дополнительные параметры вклада:$")
    public void checkedSelectCheckBoxes(DataTable dataTable){
        List<String> parameters = dataTable.asList(String.class);
        pageManager.getPage(FilterForm.class).checkedSelectCheckBoxes(parameters);
    }

    @И("^Проверка количества предложений указанных в кнопке \"Показать\" '(.+)'$")
    public void checkCountDepositsInButton(String countDeposits){
        pageManager.getPage(FilterForm.class).checkCountDepositsInButton(countDeposits);
    }

    @И("^Показать результаты отбора$")
    public void showFilterResult(){
        pageManager.getPage(FilterForm.class).showFilterResult();
    }



}
