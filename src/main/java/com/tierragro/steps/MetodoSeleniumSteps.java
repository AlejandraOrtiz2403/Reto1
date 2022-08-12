package com.tierragro.steps;

import com.tierragro.driver.SeleniumWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class MetodoSeleniumSteps {
    public void clickear(By localizador) {
        SeleniumWebDriver.driver.findElement(localizador).click();
    }

    public void limpiarCampo(By localizador) {
        SeleniumWebDriver.driver.findElement(localizador).clear();
    }

    public void escribir(By localizador, String texto){

    }

    public void escribirMasEnter(By localizador, String texto) {
        SeleniumWebDriver.driver.findElement(localizador).sendKeys(texto, Keys.ENTER);

    }
}

