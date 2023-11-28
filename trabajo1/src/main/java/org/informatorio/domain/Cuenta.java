package org.informatorio.domain;

public class Cuenta {
    // Atributos
    protected Long numCuenta;
    protected String titular;
    protected Double saldo;
    //contructores

    public Cuenta() {
    }

    public Cuenta(Long numCuenta, String titular, Double saldo) {
        this.numCuenta = numCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }
    //getters and setters
    public Long getNumCuenta() {
        return numCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    // otros metodos
    //Metodo que retorne el saldo de la cuenta
    public Double ConsultarSaldo(){
        return this.saldo;
    }

    //Metodo que ingresa saldo a la cuenta
    public void DepositarSaldo(Double ingreso){
        this.saldo=this.saldo+ingreso;
    }
    //Metodo que saca dinero de una cuenta
    public void RetirarSaldo(Double retiro){
        if (this.saldo==null) {
            System.out.println("La clase esta vacia");
        }else{
            if (retiro <= getSaldo()) {
                System.out.println("----> Se reteriro: "+retiro);
                this.saldo-=retiro;
            }else{
                System.out.println("----> No se puede retirar por falta de fondos");
                System.out.println("----> Su saldo es: "+this.ConsultarSaldo()+ "y el retiro es:"+ retiro );
            }
        }
    }

    //Metodos para heredar
    public void CalcularInterese(){}
    public void AgregarIntereses(){}
    public void CalcularLimiteDeSobregiro(){}

}
