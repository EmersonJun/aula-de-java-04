public class App {
    public static void main(String[] args) throws Exception {

        Carro Carro1 = new Carro();
        Carro1.marca = "peugeot";
        Carro1.modelo = "208";

        Carro1.ligar();
        Carro1.andar();

        Carro Carro2 = new Carro("fiat", "uno");

        System.out.println("marca: " +Carro1.marca);
        System.out.println("modelo: " +Carro1.modelo);
        System.out.println("ligado: " +Carro1.ligado);
        System.out.println("andando: " +Carro1.andando);

        System.out.println("marca: " +Carro2.marca);
        System.out.println("modelo: " +Carro2.modelo);
        System.out.println("ligado: " +Carro2.ligado);
        System.out.println("andando: " +Carro2.andando);
    }
}
