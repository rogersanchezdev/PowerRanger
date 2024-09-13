
public class Principal {

    public static void main(String[] args) {
   
        RangerVermelho Jason = new RangerVermelho();
        RangerAmarelo TriniKwan = new RangerAmarelo();
        RangerAzul Billy = new RangerAzul();
        
        Jason.nome     = "Jason";
        Jason.arma     = "Sabre";
        Jason.cor      = "Vermelho";
        
        TriniKwan.nome = "Trini Kwan";
        TriniKwan.arma = "Adagas";
        TriniKwan.cor  = "Amarelo";
        
        Billy.nome     = "Billy";
        Billy.arma     = "Pistola Lazer e Espada";
        Billy.cor      = "Azul";
        
        Zord zordão1   = new Megazord();
        
        zordão1.nome   = "Dragão";
        zordão1.poder  = "Fogo Vulcanico";
        
        Megazord MegaZ = new Megazord();
        MegaZ.nome     = "Megazord Supremo";
        MegaZ.poder    = "Elementos Supersonicos";
        
        //Metodos
        
        System.out.println(Jason);
        System.out.println(TriniKwan);
        System.out.println(Billy);
        
        Jason.liderarEquipe();
        zordão1.Atacar();
        MegaZ.combinarZord();
        
        
        
    }
    
}
