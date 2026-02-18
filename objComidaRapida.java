
    public objComidaRapida(int tipo, int tamaño, int cantidad, double precioUnidad, double totalPagar,
            String descripcion, String notas) {
        Tipo = tipo;
        Tamaño = tamaño;
        Cantidad = cantidad;
        PrecioUnidad = precioUnidad;
        TotalPagar = totalPagar;
        Descripcion = descripcion;
        Notas = notas;
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
    public String getDescripcion() {
        return Descripcion;
    }
    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }
    public String getNotas() {
        return Notas;
    }
    public void setNotas(String notas) {
        Notas = notas;
    }
    
}