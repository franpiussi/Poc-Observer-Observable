package com.company;

public class Main {

    public static void main(String[] args) {
	    Auto a = new Auto("Ford", "FXZ603", 30,30,10);
	    new Mecanico(a,"Franco");

	    a.updateAceite(20);
	    a.updateNivelAgua(30);
	    a.updatePresionNeumaticos(15);
    }
}
