
import java.util.Scanner;
    
 public class projeto2{
        
        public static void main(String[] args) throws Exception{

            System.out.println("escape do labirinto");

            Personagem rafa = new Personagem("rafa", 100);
            Personagem leo = new Personagem("leo", 100);
            Personagem nick = new Personagem("nick", 100);
        
            System.out.println("para começar escolha um lado que vc quer entra, para assim dar comerço a sua jornada ");
            String primeiraescolha = "direita";
            String segundaescolha = "esquerda";
            System.out.println(primeiraescolha);
            System.out.println(segundaescolha);

            Scanner escaneadoScanner = new Scanner(System.in);

            String escolha1 = escaneadoScanner.nextLine();
            String cap2opcao1 = "um salgadinho";
            String cap2epcao2 = "salgado";
            if(escolha1.equals(primeiraescolha)){
                System.out.println("você escolheu o lado direito, agora terá que resolva as charadas que leo te desafia, para assim chegar a saida!." 
                                       +" \nleo e seu desafiante, ele tem o mesmo numero de pontos que vc, a cada resposta que vc erra ele ganha 50 pontos, se vc acerta vc ganha 50 pontos,"
                                       + " \n se vc chegar a 100 pontos derota leo, e sairá do labirinto, se leo chegar a 100 pontos e fim de jogo, e vc ficara preso para sempre"
                                       +" \nresponta a charada de leo ");
                System.out.println("leo pergunta: O que acontece se colocarmos sal em um boi bem pequeno?");
                System.out.println(cap2opcao1);
                System.out.println(cap2epcao2);

                String escolha2 = escaneadoScanner.nextLine();

                if(escolha2.equals(cap2opcao1)){
                    System.out.println("Certa resposta! Você esta cada vez mais proximo de sair do labirinto .");
                    rafa.alterarEnergia(+50);
                    leo.alterarEnergia(-50);
                    
                }
                
                else{
                    System.out.println("Você errou, e agora esta mais logo do seu objetivo!");
                    leo.alterarEnergia(+50);
                    rafa.alterarEnergia(-50);
                }
        
            }
            
            else if (escolha1.equals(segundaescolha)){
                System.out.println("você escolheu o lado direito, por isso só terá uma chance de sair do labirinto!." 
                +" \nresponda corretamente a charada de nick para poder escapar!");
                
                System.out.println("O que é que nós não vemos, mas incomoda a vista?");
               String opcao3 = "Um cisco";
                String opcao4 = "o olho";
                System.out.println(opcao3);
                System.out.println(opcao4);
                String escolha2 = escaneadoScanner.nextLine();

                if(escolha2.equals(opcao3)){
                    System.out.println("você acerto, com isso venceu leo e saiu do labirinto");
                    rafa.alterarEnergia(+100);
                    nick.alterarEnergia(-100);
                }
                else{
                    System.out.println("Você errou e com isso vai ficar preso para sempre no labirinto ");
                    nick.alterarEnergia(+100);
                    rafa.alterarEnergia(-100);    
                }
            }
             }
        }
    