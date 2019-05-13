package com.company;

import java.util.Observable;

public class Auto extends Observable {
    private String marca;
    private String patente;
    private int nivelAceite;
    private int presionNeumaticos;
    private int nivelAgua;

    public Auto(String marca, String patente, int nivelAceite, int presionNeumaticos, int nivelAgua){
        this.marca = marca;
        this.patente = patente;
        this.nivelAceite = nivelAceite;
        this.presionNeumaticos = presionNeumaticos;
        this.nivelAgua = nivelAgua;
    }


    public void setNivelAceite(int nivelAceite) {
        this.nivelAceite = nivelAceite;
    }

    public void setPresionNeumaticos(int presionNeumaticos) {
        this.presionNeumaticos = presionNeumaticos;
    }

    public void setNivelAgua(int nivelAgua) {
        this.nivelAgua = nivelAgua;
    }

    public int getNivelAceite() {
        return nivelAceite;
    }

    public int getPresionNeumaticos() {
        return presionNeumaticos;
    }

    public int getNivelAgua() {
        return nivelAgua;
    }


    public void updateAceite(int nivelAceiteNuevo){
        int aux = this.getNivelAceite();
        this.setNivelAceite(nivelAceiteNuevo);
        setChanged();
        notifyObservers("Nivel de aceite viejo: "+aux);
    }

    public void updatePresionNeumaticos(int presionNeumaticosNuevo){
        int aux = this.getPresionNeumaticos();
        this.setPresionNeumaticos(presionNeumaticosNuevo);
        setChanged();
        notifyObservers("Presion de neumaticos viejo: "+aux);
    }

    public void updateNivelAgua(int nivelAguaNuevo){
        int aux = this.getNivelAgua();
        this.setNivelAgua(nivelAguaNuevo);
        setChanged();
        notifyObservers("Nivel de agua viejo: "+aux);
    }

    @Override
    public String toString() {
        return "Auto{" +
                "marca='" + marca + '\'' +
                ", patente='" + patente + '\'' +
                ", nivelAceite=" + nivelAceite +
                ", presionNeumaticos=" + presionNeumaticos +
                ", nivelAgua=" + nivelAgua +
                '}';
    }
}
