public class Quadrato extends FormaDisegnabile {
    private int lato;

    public Quadrato(int x, int y, String colore, int lato) {
        super(x, y, colore);
        this.lato = lato;
    }

    public int getLato() {
        return lato;
    }

    public void setLato(int lato) {
        this.lato = lato;
    }

    public double area() {
        return lato * lato;
    }

    public double perimetro() {
        return 4 * lato;
    }

    public void disegna() {
        for (int i = 0; i < lato; i++) {
            for (int j = 0; j < lato; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
