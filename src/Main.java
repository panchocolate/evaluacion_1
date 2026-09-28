public class Main {
    public static void main(String[] args) {
        BicicletaElectrica bicE01 = new BicicletaElectrica("BIC-E01", 2023, 22.5, 60, false);
        BicicletaElectrica bicE02 = new BicicletaElectrica("BIC-E02", 2022, 24.0, 45, true);
        BicicletaMontanya bicM01 = new BicicletaMontanya("BIC-M01", 2021, 13.5, 2);
        BicicletaMontanya bicM02 = new BicicletaMontanya("BIC-M02", 2020, 12.0, 1);
        bicE01.activarGarantiaExtendida();


        GestorTallerBicicletas gestor = new GestorTallerBicicletas();
        gestor.registrarBicicleta(bicE01);
        gestor.registrarBicicleta(bicE02);
        gestor.registrarBicicleta(bicM01);
        gestor.registrarBicicleta(bicM02);

        System.out.println();


        gestor.mostrarBusquedaPorCodigo("BIC-E01");

        System.out.println();

        gestor.listarTodas();
    }
}
