package com.fivetic.recycler;

public class Usuario {

    private String uid;
    private String nombre;
    private String direccion;
    private String fecha;
    private String ciudad ;

    public Usuario(){

    }

    public Usuario(String uid,String nombre,String direccion,String fecha,String ciudad){
        this.setUid(uid);
        this.setNombre(nombre);
        this.setDireccion(direccion);
        this.setFecha(fecha);
        this.setCiudad(ciudad);
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
}