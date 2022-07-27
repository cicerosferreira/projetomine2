public class Personagem {
    String nome;
    int energia;

    Personagem(String nome, int energia){
        this.nome = nome;
        this.energia = 100;
    }

    void alterarEnergia(int alteracao){
        this.energia = this.energia + alteracao;
        if(alteracao > 0){
            System.out.println("Após esta ação, " + this.nome + " recuperou " + alteracao + " pontos de energia.");
        }
        else{
            System.out.println("Após esta ação, " + this.nome + " perdeu " + alteracao + " pontos de energia");
        }

         if(this.energia >= 100){
            this.energia = 100;
            System.out.println(this.nome + " venceu!.");
        }
        else if(this.energia <= 0){
            this.energia = 0;
            System.out.println(this.nome + " foi derrotado :(.");
        }
    }
}