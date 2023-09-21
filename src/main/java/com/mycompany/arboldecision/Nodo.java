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
    
    String sintoma;
    Map<String, String> mapEnfermedad = new HashMap();
    Map<String, Nodo> mapNodo = new HashMap();
    
    public Nodo(String sintoma, String enfermedad){
        this.sintoma = sintoma;
        mapEnfermedad.put("1", enfermedad);
        mapNodo.put("2", null);
    }
    
    public String getSintoma(){
        return sintoma;
    }
    
    public Map getMapaNodo(){
        return mapNodo;
    }
}
