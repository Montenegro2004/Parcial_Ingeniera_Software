public class Foto {
    private String fichero;
    private double tamanoMB;
    private int numero;

    public Foto(int numero, String fichero) {
        this.numero = numero;
        this.fichero = fichero;
        this.tamanoMB = 1 + Math.random() * 9;
        this.tamanoMB = Math.round(tamanoMB * 100.0) / 100.0;
    }


    public void mostrarDetalles() {
        System.out.println("Foto: " + fichero + " (Producto #" + numero + ")");
    }
}
