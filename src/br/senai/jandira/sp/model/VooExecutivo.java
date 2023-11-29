package br.senai.jandira.sp.model;

import br.senai.jandira.sp.model.Voo;

public class VooExecutivo extends Voo {
    public VooExecutivo(String companhia, String destino, String origem, int pasageiros, int vooNumero) {
        super(companhia, destino, origem, hora, dataVoo, pasageiros, vooNumero, pasageiros);
    }
    @Override
    public String print() {
        return "Voo Primeira Classe" +
                "Companhia: " + super.getCompanhia() +
                "Destino: " + super.getDestino() +
                "Origem: " + super.getOrigem() +
                "Hora da partida: " + super.getHora() +
                "Data da partida: " + super.getData() +
                "Número de passageiros: " + super.getPassageiros() +
                "Número do voo: " + super.getVooNumero();
    }
}
