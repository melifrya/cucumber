package ira.cuke;

import ira.cuke.managers.PageObjectManager;
import ira.cuke.managers.ScenarioContext;

public class TestContext {

    private PageObjectManager pageObjectManager;
    public ScenarioContext scenarioContext;

    public TestContext() {
        pageObjectManager = new PageObjectManager();
        scenarioContext = new ScenarioContext();
    }

    public PageObjectManager getPageObjectManager() {
        return pageObjectManager;
    }

    public ScenarioContext getScenarioContext() {
        return scenarioContext;
    }
}