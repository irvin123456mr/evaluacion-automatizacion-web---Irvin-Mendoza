package com.nttdata.steps;

import com.nttdata.page.CalculadoraPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CalculadoraSteps {

    private WebDriver driver;

    //constructor
    public CalculadoraSteps(WebDriver driver){
        this.driver = driver;
    }

    /**
     * Escribir el usuario
     * @param user el usuario
     */
    public void typeNumero1(int numero1){
        WebElement numero1InputElement = driver.findElement(CalculadoraPage.numero1Input);
        numero1InputElement.sendKeys(numero1);
    }

    /**
     * Escribir el password
     * @param password el password del usuario
     */

    public void typenumero2(int numero2){
        this.driver.findElement(CalculadoraPage.numero2Input).sendKeys(numero2);
    }

    /**
     * Hacer click en el botón login
     */
    public void resultado(){
        this.driver.findElement(CalculadoraPage.resultadoButton).click();
    }

}
