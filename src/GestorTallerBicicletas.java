import java.util.ArrayList;
import java.util.List;

public class GestorTallerBicicletas {
    private List<Bicicleta> coleccionBicicletas;

    public GestorTallerBicicletas() {
        this.coleccionBicicletas = new ArrayList<>();
    }


    public void registrarBicicleta(Bicicleta bicicleta) {
        if (bicicleta != null) {
            coleccionBicicletas.add(bicicleta);
            System.out.println(bicicleta.getCodigo() + " (" + bicicleta.getClass().getSimpleName() + ") registrada correctamente.");
        }
    }

    public Bicicleta buscarPorCodigo(String codigo) {
        for (Bicicleta b : coleccionBicicletas) {
            if (b.getCodigo().equalsIgnoreCase(codigo)) {
                return b;
            }
        }
        return null;
    }


    public void mostrarBusquedaPorCodigo(String codigo) {
        System.out.println("=== BUSQUEDA POR CODIGO: \"" + codigo + "\" ===");
        Bicicleta b = buscarPorCodigo(codigo);
        if (b != null) {
            if (b instanceof BicicletaElectrica) {
                BicicletaElectrica be = (BicicletaElectrica) b;
                System.out.println("Tipo: Bicicleta Eléctrica | Código: " + be.getCodigo() +
                        " | Año: " + be.getAnioFabricacion() +
                        " | Peso: " + be.getPeso() + " kg" +
                        " | Autonomía: " + be.getAutonomia() + " km" +
                        " | Batería certificada: " + (be.isBateriaCertificada() ? "Si" : "No") +
                        " | Garantía extendida: " + (be.tieneGarantiaExtendida() ? "Si" : "No") +
                        " | Costo mantención: $" + (long) be.calcularCostoMantencion());
            } else if (b instanceof BicicletaMontanya) {
                BicicletaMontanya bm = (BicicletaMontanya) b;
                System.out.println("Tipo: Bicicleta Montaña | Código: " + bm.getCodigo() +
                        " | Año: " + bm.getAnioFabricacion() +
                        " | Peso: " + bm.getPeso() + " kg" +
                        " | Suspensiones: " + bm.getCantidadSuspensiones() +
                        " | Costo mantención: $" + (long) bm.calcularCostoMantencion());
            }
        } else {
            System.out.println("No se encontró ninguna bicicleta con el código especifico.");
        }
        System.out.println("---");
    }
    public void listarTodas() {
        System.out.println("=== LISTADO DE BICICLETAS ===");
        for (Bicicleta b : coleccionBicicletas) {
            System.out.println(b.toString());
        }
    }
}
