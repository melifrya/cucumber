package ira.cuke.managers;

import ira.cuke.pages.BasePage;
import ira.cuke.pages.TestPage;

public class PageObjectManager {

    private BasePage basePage;

    private TestPage testPage;

    public PageObjectManager() {
    }

    public BasePage getHomePage() {

        return (basePage == null) ? basePage = new BasePage() : basePage;
    }

    public TestPage getTestPage() {

        return (testPage == null) ? testPage = new TestPage() : testPage;
    }
}