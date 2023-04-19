public class TimeFutebol {
    private int vitorias;
    private int derrotas;
    private int posicao;

    public TimeFutebol(int vitorias, int derrotas, int posicao) {
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.posicao = posicao;
    }

    public void subirTime() {
        this.posicao--;
    }

    public void rebaixarTime() {
        this.posicao++;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }
}
