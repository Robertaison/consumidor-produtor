public class Main {
    public static void main(String[] args) throws InterruptedException {
        while (true){
            Consumidor.consomeGoiabas();
            Thread.sleep(800);
        }
    }
}
