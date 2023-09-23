/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arboldecision;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Yiro
 */
public class Arbol {
    
    ArrayList<Nodo> lista = new ArrayList();
    
    public Arbol(){
        
    }
    
    public void agregar(Nodo nodo){
        lista.add(nodo);
    }
    
    public Nodo getNodo(int num){
        if (num >= 0 && num < lista.size()) {
            return lista.get(num);
        } else {
            return null; 
        }
    }
    
    public int getTamanio(){
        return lista.size();
    }
    
    public void crearArbol(){
        for(int i = 0; i <= lista.size() - 1; i++){
            if(i == lista.size() - 1){
                break;
            }
            Nodo nodoSiguiente = lista.get(i + 1);
            lista.get(i).mapNodo.put("2", nodoSiguiente);
        }
    }
    
    public ArrayList getLista(){
        return lista;
    }
    
    public String clasificar(ArrayList<Integer> listaRespuestas){
        String enfermedad = "Nada";
        int i = 0;
        for(int respuesta : listaRespuestas){
            Nodo nodo = getNodo(i);
            if(respuesta == 1){
                enfermedad = nodo.mapEnfermedad.get("1");
            }
            i++;
        }
        return enfermedad;
    }
   
}
