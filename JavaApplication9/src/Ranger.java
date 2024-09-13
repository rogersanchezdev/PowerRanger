
public class Ranger {
    
    String nome;
    String cor;
    String arma;
    
   
    public String Atacar(){
        return "Brandir Arma";
    }
    public String Defender(){
        return "Armar Guarda";
    }
    public String Transformar(){
        return "Rangers ativaram modo Zord";
    }    

    @Override
    public String toString() {
        return this.nome + " - " + this.cor + " - " + this.arma;
    }
    
    
}
