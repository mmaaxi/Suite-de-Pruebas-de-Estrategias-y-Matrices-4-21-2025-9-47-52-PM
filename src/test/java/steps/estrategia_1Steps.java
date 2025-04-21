import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertTrue;

public class estrategia_1Steps {
    WebDriver driver;
    estrategia_1Page estrategiaPage;

    @Given("el navegador está abierto en la página de inicio")
    public void el_navegador_esta_abierto_en_la_pagina_de_inicio() {
        driver = new WebDriverInitializer().initializeDriver();
        driver.get("http://url-de-la-aplicacion.com");
        estrategiaPage = new estrategia_1Page(driver);
    }

    @When("ingreso al módulo de estrategia")
    public void ingreso_al_modulo_de_estrategia() {
        estrategiaPage.irAModuloEstrategia();
    }

    @Then("el módulo se carga correctamente")
    public void el_modulo_se_carga_correctamente() {
        assertTrue(estrategiaPage.verificarModuloCargado());
    }

    @When("ejecuto la estrategia X")
    public void ejecuto_la_estrategia_x() {
        estrategiaPage.ejecutarEstrategiaX();
    }

    @Then("los resultados se muestran en pantalla")
    public void los_resultados_se_muestran_en_pantalla() {
        assertTrue(estrategiaPage.verificarResultadosEnPantalla());
    }
}