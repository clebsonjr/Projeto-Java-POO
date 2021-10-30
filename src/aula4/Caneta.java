package aula4;

public class Caneta {

    private String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;

    public Caneta(String modelo, String cor, float ponta) {
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
        System.out.println("O modelo da caneta: " + this.getModelo());
        System.out.println("A cor da caneta: " + this.getCor());
        System.out.println("Tipo de ponta: " + this.getPonta());

    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

}
