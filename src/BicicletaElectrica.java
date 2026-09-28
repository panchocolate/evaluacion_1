public class BicicletaElectrica extends Bicicleta implements ConGarantiaExtendida {
    private int autonomia;
    private boolean bateriaCertificada;
    private boolean garantiaExtendida;

    public BicicletaElectrica(String codigo, int anioFabricacion, double peso, int autonomia, boolean bateriaCertificada) {
        super(codigo, anioFabricacion, peso);
        setAutonomia(autonomia);
        setBateriaCertificada(bateriaCertificada);
        this.garantiaExtendida = false;
    }

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        if (autonomia <= 0) {
            throw new IllegalArgumentException("La autonomía debe ser un valor mayor a cero.");
        }
        this.autonomia = autonomia;
    }

    public boolean isBateriaCertificada() {
        return bateriaCertificada;
    }

    public void setBateriaCertificada(boolean bateriaCertificada) {
        this.bateriaCertificada = bateriaCertificada;
    }


    @Override
    public boolean tieneGarantiaExtendida() {
        return garantiaExtendida;
    }

    @Override
    public void activarGarantiaExtendida() {
        this.garantiaExtendida = true;
    }

    @Override
    public double calcularCostoMantencion() {
        double costoBase = 45000.0;
        if (!bateriaCertificada) {
            costoBase *= 1.25;
        }
        return costoBase;
    }
}