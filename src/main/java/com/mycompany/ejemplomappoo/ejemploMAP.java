/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.ejemplomappoo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author ximen
 */
public class ejemploMAP {
    public static void main(String[] args){
        HashMap<String, String> listaEmpleados = new HashMap<String, String>();
        //asignando valores de empleados
        listaEmpleados.put("landaverde", "gabriela");
        listaEmpleados.put("lemus", "maria");
        listaEmpleados.put("chen", "anna");
        listaEmpleados.put("avila", "carla");
        listaEmpleados.put("hernandez", "roberto");
        listaEmpleados.put("flores", "carlos");
        
        System.out.println("Lista de Empleados: ");
        
        //imprimir lista con Empleada carla
        Set set1 = listaEmpleados.entrySet();
        Iterator iterador1 = set1.iterator();
        while(iterador1.hasNext()){
            Map.Entry lista = (Map.Entry)iterador1.next();
            System.out.println("Apellido: " + lista.getKey() + " Nombre: " + lista.getValue());
        }
        
        //eliminar valores 
        listaEmpleados.remove("avila");
        
        System.out.println("Lista de Empleados sin Carla: ");
        
        //imprimir lista sin Empleada carla
        Set set2 = listaEmpleados.entrySet();
        Iterator iterador2 = set2.iterator();
        while(iterador2.hasNext()){
            Map.Entry lista = (Map.Entry)iterador2.next();
            System.out.println("Apellido: " + lista.getKey() + " Nombre: " + lista.getValue());
        }
    }
}
