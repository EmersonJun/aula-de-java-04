public class Carro {
    public String marca;
    public String modelo;
    public Boolean ligado;
    public Boolean andando;

    public Carro(){}

    public Carro(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
        this.ligado = false;
        this.andando = false;
    }

    public void ligar(){
        ligado = true;
    }
    public void desligar(){
        ligado = false;
    }
    public void andar(){
        andando = true;
    }
    public void parado(){
        andando = false;
    }
}
