public class Main {
    public static void main(String[] args) {
        Carro bmwAzul = new Carro("i4", "BMW", 2020, "Azul",286, 469.950, 225);
        Carro skylineRosa = new Carro("R34", "Nissan", 1998, "Rosa", 280, 2.800000, 327);
        Carro silviaRoxo = new Carro("S15", "Nissan", 2001, "Roxo", 250, 180.000,350);
        Carro supraRoxo = new Carro("Mk4", "Toyota", 1993, "Roxo", 326, 250.000, 250);
        System.out.println(bmwAzul.toString());
    }
}