package br.senai.jandira.sp.model;

public abstract class Voo {
    private String companhia, destino, origem, dataVoo, hora;
    private int passageiros, vooNumero;
    
    
    public Voo (String companhia, String destino, String origem, String dataVoo, String hora, int passageiros, int vooNumero) {
        this.companhia = companhia;
        this.destino = companhia;
        this.origem = origem;
        this.destino = destino;
        this.hora = hora;
        this.dataVoo = dataVoo;
        this.passageiros = passageiros;
        this.vooNumero = vooNumero;

    }

    public abstract String print();

    public String getCompanhia() {
        return companhia;
    }

    public void setCompanhia(String companhia) {
        this.companhia = companhia;
    }

    public String getDestino() {
        return destino;
    }

    public  void setDestino(String destino) {
        this.destino = destino;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getData() {
        return dataVoo;
    }

    public void setDataVoo(String dataVoo) {
        this.dataVoo = dataVoo;
    }

    public int getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(int passageiros) {
        this.passageiros = passageiros;
    }

    public int getVooNumero() {
        return vooNumero;
    }

    public void setVooNumero(int vooNumero) {
        this.vooNumero = vooNumero;
    }
}
