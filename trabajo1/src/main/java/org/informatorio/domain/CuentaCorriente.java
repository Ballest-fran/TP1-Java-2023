package org.informatorio.domain;

public class CuentaCorriente extends Cuenta{
    Double interes;

    public CuentaCorriente() {
    }
    public CuentaCorriente(Long numCuenta, String titular, Double saldo) {
        super(numCuenta, titular, saldo);
    }

}
