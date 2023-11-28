package org.informatorio.domain;

import java.util.List;

public class Cliente {
    // Atributos
    private String nombreYApellido;
    private String direccion;
    private List<Cuenta> cuentas;

    //contructores

    public Cliente() {
    }

    public Cliente(String nombreYApellido, String direccion, List<Cuenta> cuentas) {
        this.nombreYApellido = nombreYApellido;
        this.direccion = direccion;
        this.cuentas = cuentas;
    }
    //getters and setters

    public String getNombreYApellido() {
        return nombreYApellido;
    }

    public void setNombreYApellido(String nombreYApellido) {
        this.nombreYApellido = nombreYApellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(List<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    // otros metodos


}
