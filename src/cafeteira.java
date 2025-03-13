public class cafeteira {
 public boolean ligado;
 public int quantidadedeagua;   
 public int quantidadedecafe;

    public cafeteira(){
        ligado = false;
        quantidadedeagua = 0;
        quantidadedecafe = 0;
    }
    public void ligar(){
        this.ligado = true;
        // if (!ligado) {
        //     ligado = true;
        // }
    }
    public void desligar(){
        ligado = false;
    }
    public void enchercafe(int quantidade){
        if (quantidade > 0)quantidadedecafe += quantidade;
    }
    public void encheragua(int quantidade){
        if (quantidade > 0)quantidadedeagua += quantidade;
    }
    public String status(){
        return "a cafeteira esta ligada: " +((ligado)? "ligada" : "desligada") + "\nquantidade de cafe: " +quantidadedecafe + "\nquantidade de agua: " +quantidadedeagua;
    }
    public boolean fazercafe(){
        if (ligado && quantidadedecafe >= 7 && quantidadedeagua >= 30) {
            quantidadedeagua -= 30;
            quantidadedecafe -= 7;
            return true;
        }
        return false;
    }
}
