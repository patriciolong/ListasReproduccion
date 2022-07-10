/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practica.listas.controller;

import com.practica.listas.model.Canciones;
import com.practica.listas.model.Listareproduccion;
import com.practica.listas.service.CancionesService;
import com.practica.listas.service.ListaReproduccionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author patri
 */
@RestController
@RequestMapping("/api/listas")
public class ListaReproduccionController {
    @Autowired
     ListaReproduccionService casasService;
    
    
@GetMapping("/lista")
public ResponseEntity<List<Listareproduccion>> listar(){ 
 return new ResponseEntity<>(casasService.finByAll(),HttpStatus.ACCEPTED);
}

 @PostMapping("/crear")
 public ResponseEntity<Listareproduccion>crear(Listareproduccion p){
     return new ResponseEntity<>(casasService.crear(p),HttpStatus.CREATED);
 }
 @DeleteMapping("/eliminar/{id}")
 public ResponseEntity<Listareproduccion>eliminar(@PathVariable Long id){
     casasService.delete(id);
     return new ResponseEntity<>(HttpStatus.OK);
 }
// @GetMapping("/buscar/{id}")
// public ResponseEntity<Casas>buscar(@PathVariable Long id){
////     casasService.listado(id);
//     return new ResponseEntity<>(buscarCasas(id),HttpStatus.OK);
// }
 @PutMapping("/actualizar/{id}")
 public ResponseEntity<Listareproduccion> actualizar(@PathVariable Long id, @RequestBody Listareproduccion p){
     Listareproduccion casa = buscarCasas(id);
     if( casa==null){
         return new ResponseEntity<>(HttpStatus.NOT_FOUND);
         
     }else{
         try{
             casa.setNombre(p.getNombre());
             casa.setDescripcion(p.getDescripcion());
             casa.setIdSong(p.getIdSong());
             
             
         return new ResponseEntity<>(casasService.crear(casa),HttpStatus.CREATED);
         }catch (Exception e){
             return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
         }
     }
 }
 
 
 public Listareproduccion buscarCasas(@PathVariable Long id){
     return casasService.findById(id);
}
}
