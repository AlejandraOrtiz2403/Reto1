package com.tierragro.steps;

import com.tierragro.pageObject.BuscarPages;
import com.tierragro.utils.EsperaImplicita;
import com.tierragro.utils.Excel;
import net.thucydides.core.annotations.Step;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class BuscarStep extends MetodoSeleniumSteps {
    BuscarPages buscarPages = new BuscarPages();
    private static ArrayList<Map<String, String>> leerExcel = new ArrayList<Map<String, String>>();
    EsperaImplicita esperaImplicita = new EsperaImplicita();

    @Step
    public String abrirUrlConExcel(){
        String urlToOpen = "";
        try {
            leerExcel = Excel.readExcel("reto 1.xlsx","url");

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }


            urlToOpen = leerExcel.get(0).get("link");

        return urlToOpen;

    }
    @Step
    public void busquedaConExcel() {
        esperaImplicita.esperar(60);
        try {
            leerExcel = Excel.readExcel("reto 1.xlsx","Terminos busqueda");

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        for (int i = 0; i < leerExcel.size(); i ++) {
            escribirMasEnter(buscarPages.getTxtBarraBusqueda(),leerExcel.get(i).get("Buscar"));
        }
    }


    }