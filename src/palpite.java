import java.util.Scanner;

public class palpite {
    public static void main(String[] args) throws Exception {
        
        Scanner palpites = new Scanner(System.in);

        while (true){
    
            System.out.println("Quantos soldados você acha que vamos enfrentar?");
            int palpiteDado = palpites.nextInt();
            
            if (palpiteDado < 10000){
    
                System.out.println("Um pouco mais. . . ");
                continue;
    
            } else if (palpiteDado > 10000){
    
                System.out.println("Um pouco menos. . . ");
                continue;

            } else if (palpiteDado == 10000){
    
                System.out.printf("Como raios você sabe? VOCÊ É UM DELES? \n De qualquer forma, avante homens, vamos lá!");
                break;

            } else {

                System.out.println("Pelo amor de Deus, eu não entendi nada!");
                continue;

            }

            /*
             É possivel criar a mesma comparação fazendo uso de comparador TRINARIO, porem eu preferi deixar o codigo mais didatico. De qualquer forma, aqui esta a forma alternativa:
 
                Scanner palpites = new Scanner(System.in);
                String mensagem;

                while (palpiteDado != 10000){
                    
                    mensagem = palpiteDado > 10000?"Um pouco Menos...":"Um pouco Mais..."

                    System.out.println("Pelo amor de Deus, eu não entendi nada!");
                    continue;
                }

             */
        }
    }
}
