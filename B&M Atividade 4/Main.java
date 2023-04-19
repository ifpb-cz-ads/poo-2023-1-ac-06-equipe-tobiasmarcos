public class Main {
    public static void main(String[] args) {
        Lampada lampada = new Lampada(110, 5000);
        System.out.println("A lâmpada está " + (lampada.isOnOff() ? "ligada" : "desligada"));
        lampada.acenderLampada();
        System.out.println("A lâmpada está " + (lampada.isOnOff() ? "ligada" : "desligada"));
        lampada.apagarLampada();
        System.out.println("A lâmpada está " + (lampada.isOnOff() ? "ligada" : "desligada"));
    }
}
