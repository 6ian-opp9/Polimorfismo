
public abstract class FormaDisegnabile {
    private int x;
    private int y;
    private String colore;

    public FormaDisegnabile(int x, int y, String colore) {
        this.x = x;
        this.y = y;
        this.colore = colore;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getColore() {
        return colore;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public void sposta(int deltaX, int deltaY) {
        x += deltaX;
        y += deltaY;
    }

    public abstract void disegna();
}
