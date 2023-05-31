package jogo;

import java.util.Random;
import java.util.Scanner;

public class jogotabalaro {

    public static void main(String[] args) {

        String dadoes;
        int i = 1;
        int posicao1, posicaoant1, posicao2, posicaoant2,renda1,renda2,saldo1,saldo2, escolha, fechamento = 0;


        boolean jogo = true;


        boolean acao1 = false;
        boolean casamento1 = false;

        boolean acao2 = false;
        boolean casamento2 = false;

        //Variáveis posição
        posicao1 = 0;
        posicaoant1 = 0;
        posicao2 = 0;
        posicaoant2 = 0;

        //Variáveis Financeiro
        saldo1 = 5000;
        saldo2 = 5000;
        renda1 = 4000;
        renda2 = 4000;

        String  bonus1 = "Você ganhou uma bolsa de estudos! (Bônus de R$50000)",
                bonus2 = "Seu negócio fez sucesso! (Bônus de R$2000 por rodada)",
                bonus3 = "Seus pais deixaram dinheiro na poupança para você! (Bônus de R$80000)",
                bonus4 = "Encontrou uma obra de arte no seu armazém! (Bônus de R$15000)",
                bonus5 = "Você comprou um terreno que valorizou e te deu lucro! (Bônus de R$13000)",
                bonus6 = "Você ganhou na loteria! (Bônus de R$10000)",
                bonus7 = "Você vendeu sua tv (bônus de R$2500)";

        //Prejuízo
        String  prejuizo1 = "Você foi preso e está devendo o agiota da fiança :( (Prejuízo de R$4000)",
                prejuizo2 = "Você comprou um carro! (Prejuízo de R$10000)",
                prejuizo3 = "Dia do seu casamento! (Prejuízo de R$20000)",
                prejuizo4 = "Sua sogra foi viajar e você foi junto! (Prejuízo de R$8000)",
                prejuizo5 = "Você foi processado por comentários indevidos na internet! (Prejuízo de R$5000)",
                prejuizo6 = "Seu filho botou fogo na casa... (Prejuízo de R$14000)";

        //Casa AÇOES
        String  açoes1  = "Você deseja comprar ações na bolsa por R$5000?",
                subiram = "As ações subiram! (Bônus de R$14000)",
                cairam  = "As ações despencaram! (Prejuízo de R$14000)";

        //Casa NULA
        String  inicio = "INÍCIO!",
                nula1  = "Espere sua vez!",
                nula2  = "Espere sua vez!",
                nula3  = "Espere sua vez!",
                nula4  = "Espere sua vez!",
                nula5  = "Espere sua vez!",
                nula6  = "Espere sua vez!",
                nula7  = "Espere sua vez!",
                nula8  = "Espere sua vez!",
                nula9  = "Espere sua vez!",
                fim    = "Aguarde o fim da partida!";

        //Criar o vetor de Strings
        String[] vetor = new String[30];

        // Adicionar frases ao vetor;
        vetor[0]  = inicio;
        vetor[1]  = nula1;
        vetor[2]  = nula2;
        vetor[3]  = prejuizo1;
        vetor[4]  = bonus1;
        vetor[5]  = nula3;
        vetor[6]  = açoes1;
        vetor[7]  = nula4;
        vetor[8]  = bonus2;
        vetor[9]  = prejuizo2;
        vetor[10] = nula5;
        vetor[11] = prejuizo3;
        vetor[12] = bonus3;
        vetor[13] = prejuizo4;
        vetor[14] = nula6;
        vetor[15] = nula7;
        vetor[16] = bonus4;
        vetor[17] = prejuizo5;
        vetor[18] = bonus5;
        vetor[19] = prejuizo6;
        vetor[20] = nula8;
        vetor[21] = subiram;
        vetor[22] = bonus6;
        vetor[23] = cairam;
        vetor[24] = bonus7;
        vetor[25] = nula9;
        vetor[26] = fim;
        vetor[27] = fim;
        vetor[28] = fim;
        vetor[29] = fim;


	        /*Dado
	        Random rnd = new Random();
	        int dado = rnd.nextInt(4)+1;/*/
        Scanner entrada = new Scanner(System.in);

        //Mapa
        String[] casas = new String[30];
        casas[1] = "[@_@] [2] [3] [4] [5] [6] [7] [8] [9] [10] [11] [12] [13] [14] [15] [16] [17] [18] [19] [20] [21] [22] [23] [24] [25]";
        casas[2] = "[1] [@_@] [3] [4] [5] [6] [7] [8] [9] [10] [11] [12] [13] [14] [15] [16] [17] [18] [19] [20] [21] [22] [23] [24] [25]";
        casas[3] = "[1] [2] [@_@] [4] [5] [6] [7] [8] [9] [10] [11] [12] [13] [14] [15] [16] [17] [18] [19] [20] [21] [22] [23] [24] [25]";
        casas[4] = "[1] [2] [3] [@_@] [5] [6] [7] [8] [9] [10] [11] [12] [13] [14] [15] [16] [17] [18] [19] [20] [21] [22] [23] [24] [25]";
        casas[5] = "[1] [2] [3] [4] [@_@] [6] [7] [8] [9] [10] [11] [12] [13] [14] [15] [16] [17] [18] [19] [20] [21] [22] [23] [24] [25]";
        casas[6] = "[1] [2] [3] [4] [5] [@_@] [7] [8] [9] [10] [11] [12] [13] [14] [15] [16] [17] [18] [19] [20] [21] [22] [23] [24] [25]";
        casas[7] = "[1] [2] [3] [4] [5] [6] [@_@] [8] [9] [10] [11] [12] [13] [14] [15] [16] [17] [18] [19] [20] [21] [22] [23] [24] [25]";
        casas[8] = "[1] [2] [3] [4] [5] [6] [7] [@_@] [9] [10] [11] [12] [13] [14] [15] [16] [17] [18] [19] [20] [21] [22] [23] [24] [25]";
        casas[9] = "[1] [2] [3] [4] [5] [6] [7] [8] [@_@] [10] [11] [12] [13] [14] [15] [16] [17] [18] [19] [20] [21] [22] [23] [24] [25]";
        casas[10] = "[1] [2] [3] [4] [5] [6] [7] [8] [9] [@_@] [11] [12] [13] [14] [15] [16] [17] [18] [19] [20] [21] [22] [23] [24] [25]";
        casas[11] = "[1] [2] [3] [4] [5] [6] [7] [8] [9] [10] [@_@] [12] [13] [14] [15] [16] [17] [18] [19] [20] [21] [22] [23] [24] [25]";
        casas[12] = "[1] [2] [3] [4] [5] [6] [7] [8] [9] [10] [11] [@_@] [13] [14] [15] [16] [17] [18] [19] [20] [21] [22] [23] [24] [25]";
        casas[13] = "[1] [2] [3] [4] [5] [6] [7] [8] [9] [10] [11] [12] [@_@] [14] [15] [16] [17] [18] [19] [20] [21] [22] [23] [24] [25]";
        casas[14] = "[1] [2] [3] [4] [5] [6] [7] [8] [9] [10] [11] [12] [13] [@_@] [15] [16] [17] [18] [19] [20] [21] [22] [23] [24] [25]";
        casas[15] = "[1] [2] [3] [4] [5] [6] [7] [8] [9] [10] [11] [12] [13] [14] [@_@] [16] [17] [18] [19] [20] [21] [22] [23] [24] [25]";
        casas[16] = "[1] [2] [3] [4] [5] [6] [7] [8] [9] [10] [11] [12] [13] [14] [15] [@_@] [17] [18] [19] [20] [21] [22] [23] [24] [25]";
        casas[17] = "[1] [2] [3] [4] [5] [6] [7] [8] [9] [10] [11] [12] [13] [14] [15] [16] [@_@] [18] [19] [20] [21] [22] [23] [24] [25]";
        casas[18] = "[1] [2] [3] [4] [5] [6] [7] [8] [9] [10] [11] [12] [13] [14] [15] [16] [17] [@_@] [19] [20] [21] [22] [23] [24] [25]";
        casas[19] = "[1] [2] [3] [4] [5] [6] [7] [8] [9] [10] [11] [12] [13] [14] [15] [16] [17] [18] [@_@] [20] [21] [22] [23] [24] [25]";
        casas[20] = "[1] [2] [3] [4] [5] [6] [7] [8] [9] [10] [11] [12] [13] [14] [15] [16] [17] [18] [19] [@_@] [21] [22] [23] [24] [25]";
        casas[21] = "[1] [2] [3] [4] [5] [6] [7] [8] [9] [10] [11] [12] [13] [14] [15] [16] [17] [18] [19] [20] [@_@] [22] [23] [24] [25]";
        casas[22] = "[1] [2] [3] [4] [5] [6] [7] [8] [9] [10] [11] [12] [13] [14] [15] [16] [17] [18] [19] [20] [21] [@_@] [23] [24] [25]";
        casas[23] = "[1] [2] [3] [4] [5] [6] [7] [8] [9] [10] [11] [12] [13] [14] [15] [16] [17] [18] [19] [20] [21] [22] [@_@] [24] [25]";
        casas[24] = "[1] [2] [3] [4] [5] [6] [7] [8] [9] [10] [11] [12] [13] [14] [15] [16] [17] [18] [19] [20] [21] [22] [23] [@_@] [25]";
        casas[25] = "[1] [2] [3] [4] [5] [6] [7] [8] [9] [10] [11] [12] [13] [14] [15] [16] [17] [18] [19] [20] [21] [22] [23] [24] [@_@]";
        casas[26] = "";
        casas[27] = "";
        casas[28] = "";
        casas[29] = "";

        //Início
        System.out.println("Bem-vindo ao Money Life!");
        System.out.println("Seu saldo inicial é de R$4000");
        System.out.println("Digite qualquer letra para jogar");
        dadoes = entrada.next();

        //Espaço em branco
        System.out.println("\n\n\n\n\n\n\n\n\n\n");

        while(fechamento < 2) {

            //Player1
            if(posicao1 <=25) {
                System.out.println("Jogador 1:");
                System.out.println("Digite qualquer letra para rolar o dado");
                dadoes = entrada.next();

                //Dado
                Random rnd = new Random();
                int dado = rnd.nextInt(4)+1;

                //Espaço em branco
                System.out.println("\n\n\n\n\n\n\n\n\n\n");


                //Informações e Posicionamentos
                posicao1 = posicaoant1 + dado;
                System.out.println("Você tirou "+ (posicao1 - posicaoant1));


                System.out.println("\n\n");
                System.out.println("***********");
                System.out.println(vetor[posicao1]);
                System.out.println("***********");
                System.out.println("\n\n");

                saldo1 = saldo1 + renda1;




                System.out.println("Mapa:");
                System.out.println(casas[posicao1]);
                posicaoant1 = posicao1;

                switch(posicao1) {
                    case 3:
                        saldo1 = saldo1 - 4000;
                        break;
                    case 4:
                        saldo1 = saldo1 + 50000;
                        break;
                    case 6:
                        System.out.println("Para comprar as ações digite (1), se não quiser digite (2)");
                        escolha = entrada.nextInt();

                        if (escolha == 1) {
                            saldo1 = saldo1 - 5000;
                            acao1 = true;
                        }

                        else {
                            acao1 = false;
                        }

                        break;
                    case 8:
                        renda1 = renda1 + 2000;
                        break;
                    case 9:
                        saldo1 = saldo1 - 10000;
                        break;
                    case 11:
                        saldo1 = saldo1 - 20000;
                        casamento1 = true;
                        break;
                    case 12:
                        saldo1 = saldo1 + 80000;
                    case 13:
                        if(casamento1 == true) {
                            saldo1 = saldo1 - 8000;
                        }

                        else {
                            System.out.println("Graças a Deus era apenas um sonho, você não tem uma sogra!");
                        }

                        break;
                    case 16:
                        saldo1 = saldo1 + 15000;
                        break;
                    case 17:
                        saldo1 = saldo1 - 5000;
                        break;
                    case 18:
                        saldo1 = saldo1 + 13000;
                        break;
                    case 19:

                        if(casamento1 == true) {
                            saldo1 = saldo1 - 14000;
                        }

                        else {
                            System.out.println("Graças a Deus era apenas um sonho, você não possui filhos!");
                        }

                        break;
                    case 21:

                        if(acao1 == true) {
                            saldo1 = saldo1 + 14000;
                        }

                        else {
                            System.out.println("Você não possui ações");
                        }

                        break;
                    case 22:
                        saldo1 = saldo1 + 10000;
                        break;
                    case 23:

                        if(acao1 == true) {
                            saldo1 = saldo1 - 14000;
                        }

                        else {
                            System.out.println("Você não possui ações");
                        }

                        break;
                    case 24:
                        saldo1 = saldo1 + 2500;
                        break;

                    default:
                        System.out.println("");
                        break;
                }



                //Financeira Atual
                System.out.println("Sua receita atual é de: " + renda1);
                System.out.println("Seu saldo atual é de: " + saldo1);


                System.out.println("Digite qualquer letra para prosseguir");
                dadoes = entrada.next();

                //Espaço Branco
                System.out.println("\n\n\n\n\n\n\n\n\n\n");
            }

            else {
                fechamento = fechamento + 1;
            }

            //Player 2
            if(posicao2 <=25) {
                System.out.println("Jogador 2:");
                System.out.println("Digite qualquer letra para rolar o dado");
                dadoes = entrada.next();

                //Dado
                Random rnd = new Random();
                int dado2 = rnd.nextInt(4)+1;

                //Espaço em branco
                System.out.println("\n\n\n\n\n\n\n\n\n\n");

                //Posição para andar e saldo
                posicao2 = posicaoant2 + dado2;
                System.out.println("Você tirou "+ (posicao2 - posicaoant2));

                System.out.println("\n\n");
                System.out.println("***********");
                System.out.println(vetor[posicao2]);
                System.out.println("***********");
                System.out.println("\n\n");
                saldo2 = saldo2 + renda2;

                //Imprimir Mapa
                System.out.println("Mapa:");
                System.out.println(casas[posicao2]);
                posicaoant2 = posicao2;

                switch(posicao2) {
                    case 3:
                        saldo2 = saldo2 - 4000;
                        break;
                    case 4:
                        saldo2 = saldo2 + 50000;
                        break;
                    case 6:
                        System.out.println("\n");
                        System.out.println("**********************************************************");
                        System.out.println("Para comprar as ações digite (1), se não quiser digite (2)");
                        System.out.println("**********************************************************");
                        System.out.println("\n");
                        escolha = entrada.nextInt();
                        if (escolha == 1) {
                            saldo1 = saldo1 - 5000;
                            acao2 = true;
                        }
                        else {
                            acao2 = false;
                        }
                        break;
                    case 8:
                        renda2 = renda2 + 2000;
                        break;
                    case 9:
                        saldo2 = saldo2 - 10000;
                        break;
                    case 11:
                        saldo2 = saldo2 - 20000;
                        casamento2 = true;
                        break;
                    case 12:
                        saldo2 = saldo2 + 80000;
                        break;
                    case 13:
                        if(casamento2 == true) {
                            saldo2 = saldo2 - 8000;
                        } else {
                            System.out.println("**********************************************************");
                            System.out.println("Graças a Deus era apenas um sonho, você não tem uma sogra!");
                            System.out.println("**********************************************************");
                        }
                        break;
                    case 16:
                        saldo2 = saldo2 + 15000;
                        break;
                    case 17:
                        saldo2 = saldo2 - 5000;
                        break;
                    case 18:
                        saldo2 = saldo2 + 13000;
                        break;
                    case 19:
                        if(casamento2 == true) {
                            saldo2 = saldo2 - 14000;
                        } else {
                            System.out.println("**********************************************************");
                            System.out.println("Graças a Deus era apenas um sonho, você não possui filhos!");
                            System.out.println("**********************************************************");
                        }
                        break;
                    case 21:
                        if(acao2 == true) {
                            saldo2 = saldo2 + 14000;
                        } else {
                            System.out.println("**********************************************************");
                            System.out.println("Você não possui ações");
                            System.out.println("**********************************************************");
                        }
                        break;
                    case 22:
                        saldo2 = saldo2 + 10000;
                        break;
                    case 23:
                        if(acao2 == true) {
                            saldo2 = saldo2 - 14000;
                        } else {
                            System.out.println("**********************************************************");
                            System.out.println("Você não possui ações");
                            System.out.println("**********************************************************");
                        }
                        break;
                    case 24:
                        saldo2 = saldo2 + 2500;
                        break;
                    default:
                        System.out.println("");
                        break;
                }
                //Inforamções
                System.out.println("Sua renda atual é de: " + renda2);
                System.out.println("Seu saldo atual é de: " + saldo2);

                //Dado rolando
                System.out.println("Digite qualquer letra para prosseguir");
                dadoes = entrada.next();

                //Espaço em branco
                System.out.println("\n\n\n\n\n\n\n\n\n\n");
            }

            //final jogo
            else {
                fechamento = fechamento + 1;
            }
        }
        System.out.println("\n\n\n\n\n\n");

        if(saldo1 > saldo2) {
            System.out.println("Parabens jogador1 você venceu!!!");
            System.out.println("\n\n");
            System.out.println("Saldo do jogador 1: R$"  + saldo1);
            System.out.println("Saldo do jogador 2: R$" + saldo2);


            System.out.println("\n\n\n");
            System.out.println("*************");
            System.out.println("FIM DE JOGO");
            System.out.println("*************");

        }
        if(saldo2 > saldo1) {
            System.out.println("Parabens jogador2 você venceu!!!");
            System.out.println("\n\n");
            System.out.println("Saldo do jogador 1: R$"  + saldo1);
            System.out.println("Saldo do jogador 2: R$" + saldo2);

            System.out.println("\n\n\n");
            System.out.println("*************");
            System.out.println("FIM DE JOGO");
            System.out.println("*************");
        }
        if(saldo2 == saldo1) {
            System.out.println("Empate!!");
            System.out.println("\n\n");
            System.out.println("Saldo do jogador 1: R$"  + saldo1);
            System.out.println("Saldo do jogador 2: R$" + saldo2);


            System.out.println("\n\n\n");
            System.out.println("*************");
            System.out.println("FIM DE JOGO");
            System.out.println("*************");
        }
        entrada.close();
    }
}