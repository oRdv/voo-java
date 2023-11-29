package br.senai.jandira.sp.model;

import java.util.Scanner;

public class Menu {
    public void inciarMenu() {
        Scanner scanner = new Scanner(System.in);

        VooEconomico vooEconomico = new VooEconomico("LATAM", "Brasilia - 10:50 BSB", "Rio de Janeiro - SDU", "12:45", 975, 2319);
        VooPrimeiraClasse vooPrimeiraClasse = new VooPrimeiraClasse("AZUL", "Recife - 08:50 REC", "Montevidéu - MDV", "14:20", 232, 3123);
        VooExecutivo vooExecutivo = new VooExecutivo("AVIANCA", "São Paulo - 07:45 GRU", "Aeroporto Internacional Pearson de Toronto - YYZ",  1442, 4820);

        boolean resposta = true;

        while (resposta){
            System.out.println("-------------------------");
            System.out.println("Olá! Seja bem-vindo(a) ao AeroVista!");
            System.out.println("Voo Economica - 1");
            System.out.println("Voo Primeira Classe - 2");
            System.out.println("Voo Executivo - 3");
            System.out.println("Consultar Voos - 4");
            System.out.println("Sair - 5");
            System.out.println("Aperte o número que deseja ir (1 - 2 - 3 - 4 - 5)");

            int escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha){
                case 1:
                    System.out.println(vooEconomico.print());
                    break;

                case 2:
                    System.out.println(vooPrimeiraClasse.print());
                    break;

                case 3:
                    System.out.println(vooExecutivo.print());
                    break;

                case 4:
                    while (true) {
                        consultaVoos(scanner, vooEconomico, vooPrimeiraClasse, vooExecutivo);

                    }

                case 5:
                    resposta = false;
                    break;
                default:
            }
        }
    }

    public void consultaVoos(Scanner scanner, VooEconomico vooEconomica, VooPrimeiraClasse vooPrimeiraClasse, VooExecutivo vooExecutivo) {
        System.out.println("Opções para Consultar:");
        System.out.println("Consultar número voo - 1");
        System.out.println("Consultar por origem - 2");
        System.out.println("Consultar por Destino - 3");
        System.out.println("Consultar por Data de partida - 4");
        System.out.println("Voltar ao menu principal - 5");
        System.out.println("Aperte o número que deseja ir (1 - 2 - 3 - 4 - 5)");

        int opcaoConsulta = scanner.nextInt();
        scanner.nextLine();

        switch (opcaoConsulta) {
            case 1:
                System.out.println("Digite o número do voo desejado: ");
                int vooNumero = scanner.nextInt();
                consultaVoos(vooNumero, vooEconomica, vooPrimeiraClasse, vooExecutivo);
                break;

            case 2:
                System.out.println("Digite a origem desejada: ");
                String origem = scanner.nextLine();
                consultaVoos(origem, vooEconomica, vooPrimeiraClasse, vooExecutivo);
                break;

            case 3:
                System.out.println("Digite o destino: ");
                String destino = scanner.nextLine();
                consultaVoos(destino, vooEconomica, vooPrimeiraClasse, vooExecutivo);
                break;

            case 4:
                System.out.println("Digite a data da partida: ");
                String data = scanner.nextLine();
                consultaVoos(data, vooEconomica, vooPrimeiraClasse, vooExecutivo);
                break;

            case 5:
                break;
            default:
        }
    }

    public void consultarNumero (int numeroVoo, VooEconomica vooEconomica, VooPrimeiraClasse vooPrimeiraClasse, VooExecutivo vooExecutivo) {
        if (numeroVoo == vooEconomica.getNumeroVoo()) {
            System.out.println(vooEconomica.print());
        } else if (numeroVoo == vooPrimeiraClasse.getNumeroVoo()) {
            System.out.println(vooPrimeiraClasse.print());
        } else if (numeroVoo == vooExecutivo.getNumeroVoo()) {
            System.out.println(vooExecutivo.print());
        } else {
            System.out.println("Voo não encontrado");
        }
    }

}
