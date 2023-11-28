package org.informatorio.domain;

import java.util.List;

public class Banco {
    // Atributos
    private String nombre;
    private List<Cliente> clientes;

    //contructores
    public Banco(){
    }

    public Banco(String nombre, List<Cliente> clientes) {
        this.nombre = nombre;
        this.clientes = clientes;
    }
    //getters and setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
}
