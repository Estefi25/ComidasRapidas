public class objComidasRapidas {
    public class objComidaRapida {
    private int Tipo;
    private int Tamaño;
    private int Cantidad;
    private double PrecioUnidad;
    private double TotalPagar;
  
    public objComidaRapida(int tipo, int tamaño, int cantidad, double precioUnidad, double totalPagar) {
        Tipo = tipo;
        Tamaño = tamaño;
        Cantidad = cantidad;
        PrecioUnidad = precioUnidad;
        TotalPagar = totalPagar;
    
    }
    public objComidaRapida() {
    }
    public int getTipo() {
        return Tipo;
    }
    public void setTipo(int tipo) {
        Tipo = tipo;
    }
    public int getTamaño() {
        return Tamaño;
    }
    public void setTamaño(int tamaño) {
        Tamaño = tamaño;
    }
    public int getCantidad() {
        return Cantidad;
    }
    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }
    public double getPrecioUnidad() {
        return PrecioUnidad;
    }
    public void setPrecioUnidad(double precioUnidad) {
        PrecioUnidad = precioUnidad;
    }
    public double getTotalPagar() {
        return TotalPagar;
    }
    public void setTotalPagar(double totalPagar) {
        TotalPagar = totalPagar;
    }
 
    }
    
    
}
