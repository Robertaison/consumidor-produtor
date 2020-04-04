public class Consumidor {

    public static void consomeGoiabas() throws InterruptedException {
        System.out.println("Consumidor: Por favor, gostaria de uma goiaba");
        Cesta.pedeGoiabas();
    }
}
