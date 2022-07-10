/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practica.listas.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author patri
 */
@Entity
@Table(name = "listareproduccion")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Listareproduccion.findAll", query = "SELECT l FROM Listareproduccion l"),
    @NamedQuery(name = "Listareproduccion.findByIdlistaReproduccion", query = "SELECT l FROM Listareproduccion l WHERE l.idlistaReproduccion = :idlistaReproduccion"),
    @NamedQuery(name = "Listareproduccion.findByNombre", query = "SELECT l FROM Listareproduccion l WHERE l.nombre = :nombre"),
    @NamedQuery(name = "Listareproduccion.findByDescripcion", query = "SELECT l FROM Listareproduccion l WHERE l.descripcion = :descripcion")})
public class Listareproduccion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_lista_Reproduccion")
    private Long idlistaReproduccion;
    @Size(max = 45)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 45)
    @Column(name = "descripcion")
    private String descripcion;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_song", referencedColumnName = "id_song")
    private Canciones idSong;

    public Listareproduccion() {
    }

    public Listareproduccion(Long idlistaReproduccion) {
        this.idlistaReproduccion = idlistaReproduccion;
    }

    public Long getIdlistaReproduccion() {
        return idlistaReproduccion;
    }

    public void setIdlistaReproduccion(Long idlistaReproduccion) {
        this.idlistaReproduccion = idlistaReproduccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Canciones getIdSong() {
        return idSong;
    }

    public void setIdSong(Canciones idSong) {
        this.idSong = idSong;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idlistaReproduccion != null ? idlistaReproduccion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Listareproduccion)) {
            return false;
        }
        Listareproduccion other = (Listareproduccion) object;
        if ((this.idlistaReproduccion == null && other.idlistaReproduccion != null) || (this.idlistaReproduccion != null && !this.idlistaReproduccion.equals(other.idlistaReproduccion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.practica.listas.model.Listareproduccion[ idlistaReproduccion=" + idlistaReproduccion + " ]";
    }
    
}
