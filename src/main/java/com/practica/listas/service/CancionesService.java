/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.practica.listas.service;

import com.practica.listas.model.Canciones;
import java.util.List;

/**
 *
 * @author patri
 */
public interface CancionesService {
    public Canciones crear(Canciones p);

    public Canciones findById(Long id);

    public List<Canciones> finByAll();

    public void delete(Long id); 
    
  
}
