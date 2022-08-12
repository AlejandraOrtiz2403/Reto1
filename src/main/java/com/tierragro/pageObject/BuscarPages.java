package com.tierragro.pageObject;

import org.openqa.selenium.By;

public class BuscarPages {
    private By txtBarraBusqueda = By.xpath("//input[ @name='q'] ");


    public By getTxtBarraBusqueda() {
        return txtBarraBusqueda;
    }

    }
