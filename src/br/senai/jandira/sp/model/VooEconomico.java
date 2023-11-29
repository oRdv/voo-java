package br.senai.jandira.sp.model;

import br.senai.jandira.sp.model.Voo;

public class VooEconomico extends Voo {
    public VooEconomico(String companhia, String destino, String origem, String hora, int pasageiros, int vooNumero) {
        super(companhia, destino, origem, hora, dataVoo, pasageiros, vooNumero, pasageiros);
    }
    @Override
    public String print() {
        return "Voo Economico" +
                "Companhia: " + super.getCompanhia() +
                "Destino: " + super.getDestino() +
                "Origem: " + super.getOrigem() +
                "Hora da partida: " + super.getHora() +
                "Data da partida: " + super.getData() +
                "Número de passageiros: " + super.getPassageiros() +
                "Número do voo: " + super.getVooNumero();
    }

}
