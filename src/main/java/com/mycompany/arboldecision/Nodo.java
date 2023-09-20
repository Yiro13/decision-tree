/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arboldecision;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Yiro
 */
public class Nodo {
    
    private String atributo;
    private Map<String, Nodo> map;
    private String etiqueta;
    
    public Nodo(String atributo){
        this.atributo = atributo;
        this.map = new HashMap<>();
        this.etiqueta = null;
    }
    
    public void agregar(String atributo, Nodo nodo){
        map.put(atributo, nodo);
    }
    
    public void setEtiqueta(String etiqueta){
        this.etiqueta = etiqueta;
    }
    
    public String classify(Map<String, String> instancia){
        if(etiqueta != null){
            return etiqueta;
        }
        String valor = instancia.get(atributo);
        Nodo ob = map.get(valor);
        if(ob == null){
            return null;
        }
        return ob.classify(instancia);
    }
}
