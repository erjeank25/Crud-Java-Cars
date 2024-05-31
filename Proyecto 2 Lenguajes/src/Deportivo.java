public class Deportivo extends Vehiculo{
    private static final double descuento = 0.05; // 5%
    private static final double alquilerDia = 100.0; // Precio base por día
    private static final double precioVenta = 12000.0; // Precio base por día
    
    public Deportivo(String marca, String modelo, String tipo, int año) {
        super(marca, modelo, tipo, año);
    }

    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public String getModelo() {
        return modelo;
    }

    @Override
    public String getTipo() {
        return tipo;
    }
    
    @Override
    public double getDescuento() {
        return descuento;
    }

    @Override
    public double getPrecioAlquilerPorDia() {
        return alquilerDia;
    }
    
    @Override
    public int getAño() {
        return año;
    }
    
    @Override
    public double getPrecioVenta() {
        return precioVenta;
    }    
}
