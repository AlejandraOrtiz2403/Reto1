package com.tierragro.stepDefinitions;

import com.tierragro.driver.SeleniumWebDriver;
import com.tierragro.steps.BuscarStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

import java.util.ArrayList;
import java.util.Map;

public class BuscarStepDefinitions {
    @Steps
    BuscarStep buscarStep = new BuscarStep();

    private static ArrayList<Map<String, String>> leerExcel = new ArrayList<Map<String, String>>();
    @Given("^que me encuentro en la pagina de tierragro$")
    public void queMeEncuentroEnLaPaginaDeTierragro() {
        SeleniumWebDriver.chromeDriver(buscarStep.abrirUrlConExcel());
    }


    @When("^ingreso la informacion en la caja de busqueda$")
    public void ingresoLaInformacionEnLaCajaDeBusqueda(){
        buscarStep.busquedaConExcel();
    }
/*
    @Then("^valido busqueda en la pagina tierragro$")
    public void validoBusquedaEnLaPaginaTierragro() {

    }*/

    }
