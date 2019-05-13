package com.company;

import javax.swing.*;
import java.util.Observable;
import java.util.Observer;

public class Mecanico implements Observer {

    private Auto observado;
    private String nombre;

    public Mecanico(Auto a, String nombre){
        observado = a;
        this.nombre = nombre;
        a.addObserver(this);
    }


    @Override
    public void update(Observable o, Object arg) {
        System.out.println(arg);
        Auto auto = (Auto) o;
        System.out.println(auto);
    }
}
