package aula4;

public class aula4 {

    public static void main(String[] args) {

        Caneta c1 = new Caneta("Compact", "Vermelha", 0.7f);
        c1.getModelo();
        c1.getCor();
        c1.getPonta();

        System.out.println("*********************************");

        Caneta c2 = new Caneta("Luxuosa", "Preta", 2.0f);
        c2.getModelo();
        c2.getCor();
        c2.getPonta();

    }
}
