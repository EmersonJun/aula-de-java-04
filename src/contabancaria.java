public class contabancaria {
    String titular;
    int numerodaconta, saldo;
    boolean sacar, depositar, imprimir;

    public contabancaria(String titular, int numerodaconta, int saldo){
        this.titular = titular;
        this.numerodaconta = numerodaconta;
        this.saldo = saldo;
        this.sacar = false;
        this.depositar = false;
        this.imprimir = false;
    }
    void sacar(){
        sacar = true;
    }
    void depositar(){
        depositar = true;
    }
    void imprimir(){
        imprimir = true;
    }
}
