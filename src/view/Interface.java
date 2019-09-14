package view;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import mocks.MockCarros;
import models.Carro;

public class Interface {

    private MockCarros carros_database_inteface;
    private List<Carro> carros_database;

    public Interface() {
        carros_database_inteface = new MockCarros();
        carros_database = carros_database_inteface.get_carros();
    }

    private void show_carros() {
        // carros_database.stream().forEach(carro ->
        // System.out.println(carro.toString()));
        carros_database.stream().forEach(System.out::println);
    }

    private void filter_por_ano() {
        int ano = 2012;
        carros_database.stream().filter(carro -> carro.get_ano() == ano).forEach(System.out::println);
    }

    private void find_first_modelo() {
        String modelo = "Celta";
        Optional<Carro> carro_achado = carros_database.stream().filter(carro -> carro.get_modelo() == modelo)
                .findFirst();
        if (carro_achado.isPresent()) {
            System.out.println(carro_achado.get());
        } else {
            System.out.println("Carro não encontrado");
        }
    }

    public void run() {
        String opt;
        String options = "1) Mostrar Carros\n" + "2) Mostrar Carros Filtrados por Ano\n"
                + "3) Mostrar Primeiro Carro por Modelo\n" + "0) Sair";
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println(options);
            opt = scanner.nextLine().trim();
            switch (opt) {
            case "1":
                show_carros();
                break;
            case "2":
                filter_por_ano();
                break;
            case "3":
                find_first_modelo();
                break;
            default:
                break;
            }
        } while (opt.equals("0"));
        scanner.close();
    }
}