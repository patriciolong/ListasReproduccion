/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practica.listas.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author patri
 */
@Entity
@Table(name = "canciones")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Canciones.findAll", query = "SELECT c FROM Canciones c"),
    @NamedQuery(name = "Canciones.findByIdSong", query = "SELECT c FROM Canciones c WHERE c.idSong = :idSong"),
    @NamedQuery(name = "Canciones.findByTitulo", query = "SELECT c FROM Canciones c WHERE c.titulo = :titulo"),
    @NamedQuery(name = "Canciones.findByArtista", query = "SELECT c FROM Canciones c WHERE c.artista = :artista"),
    @NamedQuery(name = "Canciones.findByAlbun", query = "SELECT c FROM Canciones c WHERE c.albun = :albun"),
    @NamedQuery(name = "Canciones.findByAnio", query = "SELECT c FROM Canciones c WHERE c.anio = :anio")})
public class Canciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_song")
    private Long idSong;
    @Size(max = 45)
    @Column(name = "titulo")
    private String titulo;
    @Size(max = 45)
    @Column(name = "artista")
    private String artista;
    @Size(max = 45)
    @Column(name = "albun")
    private String albun;
    @Column(name = "anio")
    private Integer anio;
    

    public Canciones() {
    }

    public Canciones(Long idSong) {
        this.idSong = idSong;
    }

    public Long getIdSong() {
        return idSong;
    }

    public void setIdSong(Long idSong) {
        this.idSong = idSong;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbun() {
        return albun;
    }

    public void setAlbun(String albun) {
        this.albun = albun;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

   

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSong != null ? idSong.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Canciones)) {
            return false;
        }
        Canciones other = (Canciones) object;
        if ((this.idSong == null && other.idSong != null) || (this.idSong != null && !this.idSong.equals(other.idSong))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.practica.listas.model.Canciones[ idSong=" + idSong + " ]";
    }
    
}
