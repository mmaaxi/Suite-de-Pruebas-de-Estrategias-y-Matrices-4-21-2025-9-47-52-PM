package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.matriz_1Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class matriz_1Steps {
    WebDriver driver = new ChromeDriver();
    matriz_1Page matrizPage = new matriz_1Page(driver);

    @Given("el usuario ha ingresado al módulo de matriz")
    public void ingresarModuloMatriz() {
        matrizPage.navigateToMatrizModule();
        Assert.assertTrue(matrizPage.isMatrizModuleLoaded());
    }

    @When("realiza una operación de matriz")
    public void realizarOperacionMatriz() {
        matrizPage.performMatrixOperation();
    }

    @Then("el resultado correcto se muestra en pantalla")
    public void validarResultadoMatriz() {
        Assert.assertTrue(matrizPage.isCorrectResultDisplayed());
    }
}