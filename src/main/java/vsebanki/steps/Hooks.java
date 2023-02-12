package vsebanki.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import vsebanki.managers.DriverManager;
import vsebanki.managers.InitManager;
import vsebanki.managers.PageManager;
import vsebanki.managers.TestPropManager;
import vsebanki.product.DataManager;
import vsebanki.utils.PropsConst;

public class Hooks {
    private DriverManager driverManager = DriverManager.getInstance();
    private TestPropManager propManager = TestPropManager.getInstance();
    protected PageManager pageManager = PageManager.getInstance();
    private DataManager dataManager = DataManager.getDataManager();


    @Before
    public void before(){
        InitManager.initFramework();
        driverManager.getDriver().get(propManager.getProperty(PropsConst.BASE_URL));
    }

    @After
    public void after(){
        InitManager.quitFramework();
        pageManager.clearPages();
        dataManager.removeListOfDeposit();
    }
}
