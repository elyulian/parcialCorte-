package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Cabina> cabinas = new ArrayList<>();
        Cabina cabina1 = new Cabina("Tigo", 0.0);
        cabinas.add(cabina1);
        Random random = new Random();

        int opcion = 0;
        double numeroAleatorio =0.0;
        do {
            System.out.println("|¡Bienvenido a TelefoniK!");
            System.out.println("1. Crear una cabina");
            System.out.println("2. Realizar una llamada");
            System.out.println("3. Ver reporte de llamadas por cabina");
            System.out.println("4. Ver reporte General de todas las cabinas");
            System.out.println("5. Reiniciar cabina");
            System.out.println("Digite la opción deseada: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1 -> {
                    System.out.println("Ingrese el nombre de la cabina");
                    String nombreCabina = scanner.next();
                    Cabina cabina = new Cabina(nombreCabina, 0.0);
                    cabinas.add(cabina);
                    System.out.println("Cabina Creada correctamente");
                }
                case 2 -> {
                    System.out.println("Cabinas Disponibles: ");
                    for (Cabina cabina : cabinas) {
                        System.out.println(cabina.getNombreCabina());
                    }
                    System.out.println("Ingrese el nombre de la cabina");
                    String nombreCabina = scanner.next();
                    System.out.println("Ingrese el tipo de llamada: \n" +
                            "1. Local \n" +
                            "2. Larga \n" +
                            "3. Celular \n");
                    int tipoLlamada = scanner.nextInt();
                    System.out.println("Presiona ENTER para generar un número los minutos aleatorios ");
                        String input = scanner.nextLine(); // Espera la tecla Enter
                        numeroAleatorio = random.nextInt(100) + 1; // Genera un número entre 1 y 100
                        System.out.println("Minutos Usados: " + numeroAleatorio);

                    for (Cabina cabina : cabinas) {
                        if (cabina.getNombreCabina().equals(nombreCabina)) {
                            cabina.setMinutosUso(numeroAleatorio);
                            switch (tipoLlamada) {
                                case 1 -> cabina.llamadaLocal();
                                case 2 -> cabina.llamadaLargaDistancia();
                                case 3 -> cabina.llamadaCelular();
                                default -> System.out.println("Opción no válida");
                            }
                        }
                    }
                }
                case 3->{
                    System.out.println("Cabinas Disponibles: ");
                    for (Cabina cabina : cabinas) {
                        System.out.println(cabina.getNombreCabina());
                    }
                    System.out.println("Ingrese el nombre de la cabina");
                    String nombreCabina = scanner.next();
                    for (Cabina cabina : cabinas) {
                        if (cabina.getNombreCabina().equals(nombreCabina)) {
                            cabina.resumenCabina();
                        }
                    }
                }
                case 4->{
                    System.out.println("--------- Condolidado Todas las cabinas --------");
                    for (Cabina cabina : cabinas) {
                        System.out.println("-----------------------------------------------------");
                        System.out.println("Nombre de la cabina: " + cabina.getNombreCabina());
                        System.out.println("Numero de llamadas: " + cabina.getContadorLlamadas());
                        System.out.println("Minutos de uso: " + cabina.getMinutosUso());
                        System.out.println("Costo total: " + cabina.getContadorCostoTotal());
                        System.out.println("-----------------------------------------------------");

                    }
                }
                case 5->{
                    System.out.println("Cabinas Disponibles para reseteo: ");
                    for (Cabina cabina : cabinas) {
                        System.out.println(cabina.getNombreCabina());
                    }
                    System.out.println("Ingrese el nombre de la cabina para resetear");
                    String nombreCabina = scanner.next();
                    for (Cabina cabina : cabinas) {
                        if (cabina.getNombreCabina().equals(nombreCabina)) {
                            cabina.reiniciarCabina();
                            System.out.println("Cabina reiniciada correctamente");
                        }
                    }

                }
                default -> {
                    System.out.println("Opción no válida");
                }
            }
        } while (opcion != 6);


    }
}