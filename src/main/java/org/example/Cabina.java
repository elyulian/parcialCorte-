package org.example;

import java.sql.SQLOutput;

public class Cabina {
    //atributos de clase
    private String nombreCabina="";
    private double minutosUso =0.0;

    //precios llamadas
    private double costoMinutoLocal = 50.0;
    private double costoMinutoLargaDistancia = 350.0;
    private double costoMinutoCelular = 50.0;

    private int contadorLlamadasLocales=0;
    private int contadorLlamadasLargaDistancia=0;
    private int contadorLlamadasCelular=0;

    private int contadorLlamadas=0;
    private double contadorMinutos=0.0;
    private double contadorCostoTotal=0.0;

    public Cabina() {
    }

    public Cabina(String nombreCabina, double minutosUso) {
        this.nombreCabina = nombreCabina;
        this.minutosUso = minutosUso;
    }

    public void setNombreCabina(String nombreCabina) {
        this.nombreCabina = nombreCabina;
    }

    public void setMinutosUso(double minutosUso) {
        this.minutosUso = minutosUso;
    }

    public void setCostoMinutoLocal(double costoMinutoLocal) {
        this.costoMinutoLocal = costoMinutoLocal;
    }

    public void setCostoMinutoLargaDistancia(double costoMinutoLargaDistancia) {
        this.costoMinutoLargaDistancia = costoMinutoLargaDistancia;
    }

    public void setCostoMinutoCelular(double costoMinutoCelular) {
        this.costoMinutoCelular = costoMinutoCelular;
    }

    public void setContadorLlamadas(int contadorLlamadas) {
        this.contadorLlamadas = contadorLlamadas;
    }

    public void setContadorMinutos(double contadorMinutos) {
        this.contadorMinutos = contadorMinutos;
    }

    public void setContadorCostoTotal(double contadorCostoTotal) {
        this.contadorCostoTotal = contadorCostoTotal;
    }

    public String getNombreCabina() {
        return nombreCabina;
    }

    public double getMinutosUso() {
        return minutosUso;
    }

    public double getCostoMinutoLocal() {
        return costoMinutoLocal;
    }

    public double getCostoMinutoLargaDistancia() {
        return costoMinutoLargaDistancia;
    }

    public double getCostoMinutoCelular() {
        return costoMinutoCelular;
    }

    public int getContadorLlamadas() {
        return contadorLlamadas;
    }

    public double getContadorMinutos() {
        return contadorMinutos;
    }

    public double getContadorCostoTotal() {
        return contadorCostoTotal;
    }

    public void llamadaLocal(){
        contadorLlamadasLocales++;
        contadorLlamadas++;
        contadorMinutos+=minutosUso;
        contadorCostoTotal+=minutosUso*costoMinutoLocal;
        System.out.println("Llamada local Exitosa");

    }

    public void llamadaLargaDistancia(){
        contadorLlamadasLargaDistancia++;
        contadorLlamadas+=1;
        contadorMinutos+= minutosUso;
        contadorCostoTotal += (minutosUso * costoMinutoLargaDistancia);
        System.out.println("Llamada Larga Distancia Exitosa");
    }
    public void llamadaCelular(){
        contadorLlamadasCelular++;
        contadorLlamadas+=1;
        contadorMinutos+= minutosUso;
        contadorCostoTotal += (minutosUso * costoMinutoCelular);
        System.out.println("Llamada Celular Exitosa");
    }
    public void resumenCabina(){
        System.out.println("------------- RESUMEN CABINA-----------");
        System.out.println("Nombre de la cabina: "+nombreCabina);
        System.out.println("Minutos de uso: "+minutosUso);
        System.out.println("Numero de llamadas: "+contadorLlamadas);
        System.out.println("Minutos totales: "+contadorMinutos);
        System.out.println("Costo total: "+contadorCostoTotal);
        System.out.println("Numero de llamadas locales: "+contadorLlamadasLocales);
        System.out.println("Numero de llamadas larga distancia: "+contadorLlamadasLargaDistancia);
        System.out.println("Numero de llamada Celular: "+contadorLlamadasCelular);
    }

    public void reiniciarCabina(){
        contadorLlamadas=0;
        contadorMinutos=0.0;
        contadorCostoTotal=0.0;
        System.out.println("Cabina reiniciada");
    }


}

