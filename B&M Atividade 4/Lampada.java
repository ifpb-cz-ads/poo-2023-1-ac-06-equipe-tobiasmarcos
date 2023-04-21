public class Lampada {
    private int voltagemLampada;
    private int vidaUtil;
    private boolean onOff;

    public Lampada(int voltagemLampada, int vidaUtil) {
        this.voltagemLampada = voltagemLampada;
        this.vidaUtil = vidaUtil;
        this.onOff = false;
    }

    public void acenderLampada() {
        if (vidaUtil > 0 && !onOff) {
            onOff = true;
            System.out.println("Lâmpada acesa!");
        } else {
            System.out.println("A lâmpada não pode ser acesa!");
        }
    }

    public void apagarLampada() {
        if (onOff) {
            onOff = false;
            System.out.println("Lâmpada apagada!");
        } else {
            System.out.println("A lâmpada já está apagada!");
        }
    }

    public int getVoltagemLampada() {
        return voltagemLampada;
    }

    public void setVoltagemLampada(int voltagemLampada) {
        this.voltagemLampada = voltagemLampada;
    }

    public int getVidaUtil() {
        return vidaUtil;
    }

    public void setVidaUtil(int vidaUtil) {
        this.vidaUtil = vidaUtil;
    }

    public boolean isOnOff() {
        return onOff;
    }
}
