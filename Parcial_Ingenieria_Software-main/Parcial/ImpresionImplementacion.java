import java.util.ArrayList;

public class ImpresionImplementacion implements ProductoImplementacion {
    private String tipo;
    private int numero;
    private String descripcion;
    private ArrayList<Foto> fotos;

    public ImpresionImplementacion(int numero, String tipo, String descripcion, ArrayList<Foto> fotos) {
        this.numero = numero;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.fotos = fotos;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Impresión tipo: " + tipo + " (Producto #" + numero + ") - " + descripcion + "Fotos: ");
        for (Foto foto : fotos) {
            foto.mostrarDetalles();
        }
    }
}