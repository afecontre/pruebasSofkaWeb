package stepdefinitions;  // Asegúrate de que esta línea coincide con tu paquete actual

import org.openqa.selenium.WebDriver;

public class SharedComponents {
    private WebDriver driver;
    public WebDriver getDriver(){
        return driver;
    }
    public void setDriver(WebDriver driver){
        this.driver=driver;
    }
}
