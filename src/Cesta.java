public final class Cesta {

    private static Integer goiabas = 6;

    public static Integer pedeGoiabas() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("\nDono da cesta: Tudo bem amigo, temos um total de " + goiabas + " goiabas para você\n");
        if(goiabas <= 5){
            System.out.println("\nDono da cesta: As goiabas da cesta estao acabando, vou pedir ao produtor");
            Thread.sleep(1000);
            Produtor.produzGoiaba();
            System.out.println("Dono da cesta: Chegaram novas goiabas, agora temos " + goiabas + " goiabas!");
        }
        return getGoiabas();
    }

    public static void setGoiabas(Integer goiabas) {
        Cesta.goiabas = goiabas;
    }

    private static Integer getGoiabas() {
        return goiabas--;
    }
}
