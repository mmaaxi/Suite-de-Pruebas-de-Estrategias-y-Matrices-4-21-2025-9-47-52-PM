import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class estrategia_1Page {
    WebDriver driver;

    @FindBy(id = "moduloEstrategia")
    WebElement moduloEstrategia;

    @FindBy(id = "ejecutarEstrategiaXButton")
    WebElement ejecutarEstrategiaXButton;

    @FindBy(id = "resultadosEstrategiaX")
    WebElement resultadosEstrategiaX;

    public estrategia_1Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void irAModuloEstrategia() {
        moduloEstrategia.click();
    }

    public boolean verificarModuloCargado() {
        return moduloEstrategia.isDisplayed();
    }

    public void ejecutarEstrategiaX() {
        ejecutarEstrategiaXButton.click();
    }

    public boolean verificarResultadosEnPantalla() {
        return resultadosEstrategiaX.isDisplayed();
    }
}