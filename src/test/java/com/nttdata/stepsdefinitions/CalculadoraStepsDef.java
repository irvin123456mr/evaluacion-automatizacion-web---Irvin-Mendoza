package com.nttdata.stepsdefinitions;

import com.nttdata.steps.InventorySteps;
import com.nttdata.steps.CalculadoraSteps;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalculadoraStepsDef {

    private WebDriver driver;
    private Scenario scenario;

    private InventorySteps inventorySteps(WebDriver driver){
        return new InventorySteps(driver);
    }

    @Before(order = 0)
    public void setUp(){
        //setUp
        System.setProperty("webdriver.chrome.driver", "E:\\POSTULAR A NDATA\\CLASE 13 JAVA-WEB\\TRABAJO DE CESAR CLONADO\\evaluacion-irvin-selenium\\drivers\\chromedriver.exe");
        //crear el driver
        driver = new ChromeDriver();
        //max
        driver.manage().window().maximize();
    }

    @Before(order = 1)
    public void setScenario(Scenario scenario){
        this.scenario = scenario;
    }

    @After
    public void quitDriver(){
        driver.quit();
    }

    @Dado("que me encuentro en la página de la calculadora")
    public void que_me_encuentro_en_la_página_de_la_calculadora() {
        driver.get("https://testsheepnz.github.io/BasicCalculator.html");
        screenShot();
    }
    @Cuando(ingreso los datos firts number: {int} y second number: {int} ")
    public void ingreso_los_datos_firts_number_y_second_number(int numero1, int numero2) {
        CalculadoraSteps loginSteps = new CalculadoraSteps(driver);
        loginSteps.typenumero1(numero1);
        loginSteps.typenumero2(numero2);
        loginSteps.login();
        screenShot();
    }
    @Entonces("valido que debería aparecer el resultado de la suma numero1+numero2")
    public void valido_que_debería_aparecer_el_resultado_de_la_suma(int expectedResultado) {
        int resultado =  inventorySteps(driver).getRsesultado();
        //prueba: validamos el título del producto
        Assertions.assertEquals(expectedResultado, Resultado);
    }

    public void screenShot(){
        byte[] evidencia = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        this.scenario.attach(evidencia, "image/png", "evidencias");
    }

}
