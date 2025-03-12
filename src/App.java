public class App {
    public static void main(String[] args) throws Exception {
 
    //     Carro Carro1 = new Carro();
    //     Carro1.marca = "peugeot";
    //     Carro1.modelo = "208";

    //     Carro1.ligar();
    //     Carro1.andar();

    //     Carro Carro2 = new Carro("fiat", "uno");


    //     System.out.println("marca: " +Carro1.marca);
    //     System.out.println("modelo: " +Carro1.modelo);
    //     System.out.println("ligado: " +Carro1.ligado);
    //     System.out.println("andando: " +Carro1.andando);

    //     System.out.println("marca: " +Carro2.marca);
    //     System.out.println("modelo: " +Carro2.modelo);
    //     System.out.println("ligado: " +Carro2.ligado);
    //     System.out.println("andando: " +Carro2.andando);

    //   ex1  pessoa();
    //   ex2  livro();
    //   ex3  contabancaria();
    triangulo();
     }

        //ex1
    // public static void pessoa(){
    //     Pessoa ex1 = new Pessoa("carlo", 15);
    //     Pessoa ex2 = new Pessoa("carlos", 16);
    //     Pessoa ex3 = new Pessoa("carlinhos", 14);
    //         System.out.println(ex1.Apresentar());


       //ex2
    // public static void livro(){
    //     livro livro1 = new livro("dom quichote", "pedro", 1253);
    //     System.out.println(livro1.Apresentar());
    // }

       //ex3
    //    public static void contabancaria(){
    //     String titular = null;
    //     int numerodaconta, saldo = 0;
    //     boolean sacar, depositar, imprimir;
    //    contabancaria conta1 = new contabancaria(titular, saldo, saldo);
    //     conta1.titular = "pedro";
    //     conta1.numerodaconta = 12345;
    //     conta1.saldo = 99999999;
    //     conta1.imprimir();
    //     conta1.sacar();
    //        System.out.println("titular: "+conta1.titular);
    //        System.out.println("numero da conta: "+conta1.numerodaconta);
    //        System.out.println("saldo: "+conta1.saldo);
    //        System.out.println("imprimir: " +conta1.imprimir);
    //        System.out.println("sacar: "+conta1.sacar);
    //        System.out.println("depositar: "+conta1.depositar);
    // }

       //ex4
    public static void triangulo(){
        float area = 0, base = 0, altura = 0;
        triangulo triangulo1 = new triangulo(area, altura, base);
        triangulo1.altura = 5;
        triangulo1.base = 3;
        
        System.out.println("area: "+triangulo1.area());

    }
}

