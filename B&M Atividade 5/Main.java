public class Main {
    public static void main(String[] args) {
        TimeFutebol time = new TimeFutebol(10, 5, 3);

        System.out.println("Posição atual: " + time.getPosicao());

        time.subirTime();

        System.out.println("Nova posição: " + time.getPosicao());

        time.rebaixarTime();

        System.out.println("Nova posição: " + time.getPosicao());
    }

}
