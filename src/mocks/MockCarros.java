package mocks;

import java.util.ArrayList;
import java.util.List;

import models.Carro;

public class MockCarros {
    private List<Carro> carros;

    public MockCarros() {
        this.carros = new ArrayList<Carro>() {
            private static final long serialVersionUID = 1297917988402417099L; // Não sei o que é, mas gosto
            {
                add(new Carro("Fiesta", 2016, 4));
                add(new Carro("Civic", 2019, 4));
                add(new Carro("Ram", 2012, 2));
                add(new Carro("Celta", 2013, 2));
                add(new Carro("Focus", 2018, 4));
                add(new Carro("Uno", 2011, 2));
                add(new Carro("Cobalt", 2012, 4));
                add(new Carro("Golf", 2008, 2));
                add(new Carro("Corsa", 2002, 2));
                add(new Carro("City", 2012, 4));
                add(new Carro("HB20", 2015, 4));
                add(new Carro("Fusca", 1987, 2));
                add(new Carro("Celta", 2010, 4));
                add(new Carro("T Type", 1920, 2));
            }
        };
    }

    public List<Carro> get_carros() {
        return this.carros;
    }

    public void add_carros(List<Carro> carros) {
        this.carros.addAll(carros);
    }

    public void add_carro(Carro carro) {
        this.carros.add(carro);
    }
}