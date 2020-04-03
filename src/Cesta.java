public final class Cesta {

    private static Integer goiabas = 0;
    private static final Cesta INSTANCE = new Cesta();

    public static Cesta getInstance(){
        return INSTANCE;
    }

    public static Integer pedeGoiabas() {
        System.out.println("Tudo bem amigo, temos um total de " + goiabas + " goiabas para você");
        if(goiabas <= 5){
            System.out.println("As goiabas da cesta estao acabando, vou pedir ao produtor");
            Produtor.produzGoiaba();
            System.out.println("Chegaram novas goiabas, agora temos " + goiabas + " goiabas!");
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
