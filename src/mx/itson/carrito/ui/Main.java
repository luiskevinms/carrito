/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.carrito.ui;


import java.util.Scanner;

import mx.itson.carrito.entidades.Carro;
import mx.itson.carrito.entidades.Mecanico;
import mx.itson.carrito.entidades.Propietario;
import mx.itson.carrito.enums.TipoMotor;
import mx.itson.carrito.enums.TipoTransmisión;

/**
 *
 * @author alumnog
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa la distancia recorrida: ");
        double distancia = sc.nextDouble();
        
        System.out.println("Ingresa la velocidad a la que viaja el carro ");
        double velocidad = sc.nextDouble();
        
        //Generamos una instancia de la clase Carro
        Carro bmw = new Carro();
        bmw.setMarca("BMW");
        bmw.setColor("Negro");
        bmw.setAnio(2021);
        bmw.setKilometraje(10000);
        bmw.setTipoMotor(TipoMotor.HÍBRIDO);
        bmw.setTipoTransmisión(TipoTransmisión.AUTOMATICO);
        
        
        Propietario prop = new Propietario();
        prop.setNombre("Panfilo Kevin");
        prop.setDomicilio("Calle 23, Colonia Centro");
        prop.setTelefono("6221181205");
        prop.setEmail("panfilomeno@gmail.com");
        
        bmw.setPropietario(prop);
        
        Mecanico mecanico = new Mecanico();
        mecanico.setNombre("Jesús Rosales");
        mecanico.setUbicacion("Taller el Chuy, Calle Juan Escutia, Colonia Las villas");
        mecanico.setEmail("ChuyRosales@tallerelchuy.com");
        mecanico.setTelefono("6228558487");
        
        bmw.setMecanico(mecanico);
        
        


                
        
        //Invocamos al método contenido en la clase Carro
        double tiempo = bmw.calcularTiempo(distancia, velocidad);
        
        System.out.println("El tiempo que le tomara al carro " 
        + bmw.getMarca() +
        " de color " + bmw.getColor() +
        " del anio " + bmw.getAnio() + " sera de " + tiempo + " Horas " +
        "y ahora su kilometraje es de " + bmw.getKilometraje() +
        " El propietario de este carro es " + bmw.getPropietario().getNombre() +
        " La ubicacion de su mecanico personal se encuentra en " + bmw.getMecanico().getUbicacion());
        
    }
}
