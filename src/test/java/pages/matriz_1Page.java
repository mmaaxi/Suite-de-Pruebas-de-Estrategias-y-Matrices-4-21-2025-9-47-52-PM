package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class matriz_1Page {
    WebDriver driver;
    
    By matrizModuleLocator = By.id("matriz-module");
    By matrixOperationButton = By.id("perform-operation");
    By resultLocator = By.id("result-correct");

    public matriz_1Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToMatrizModule() {
        driver.get("http://example.com/matriz");
    }

    public boolean isMatrizModuleLoaded() {
        return driver.findElement(matrizModuleLocator).isDisplayed();
    }

    public void performMatrixOperation() {
        driver.findElement(matrixOperationButton).click();
    }

    public boolean isCorrectResultDisplayed() {
        return driver.findElement(resultLocator).isDisplayed();
    }
}