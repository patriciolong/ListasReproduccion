/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.practica.listas.service;

import com.practica.listas.model.Listareproduccion;
import java.util.List;

/**
 *
 * @author patri
 */
public interface ListaReproduccionService {
    public Listareproduccion crear(Listareproduccion p);

    public Listareproduccion findById(Long id);

    public List<Listareproduccion> finByAll();

    public void delete(Long id); 
    
}
