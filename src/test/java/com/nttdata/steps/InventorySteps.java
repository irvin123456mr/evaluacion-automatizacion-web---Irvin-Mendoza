package com.nttdata.steps;

import com.nttdata.page.InventoryCalculadora;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class InventorySteps {

    private WebDriver driver;

    //contrsuctor
    public InventorySteps(WebDriver driver){
        this.driver = driver;
    }

    /**
     * Obtener el título de la pantalla de productos
     * @return el valor del título de la pantalla de productos
     */
    public String getnumero1(){
        return this.driver.findElement(InventoryCalculadora.numero1).getInt();
    }

    public String getnumero2(){
        return this.driver.findElement(InventoryCalculadora.numero2).getInt();
    }

    /**
     * Retorna la cantidad de items
     * @return la cantidad de items
     */
    public int getResultado(){
        List<WebElement> items = this.driver.findElements(InventoryCalculadora.Resultado);
        return resultado();
    }
}
