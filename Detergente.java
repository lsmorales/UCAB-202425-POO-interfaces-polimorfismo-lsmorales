package ve.edu.ucab.lab;

public class Detergente implements EsLiquido, ConDescuento {
  private double volumen;
  private String tipoEnvase;
  private String marca;
  private double precio;
  private double descuento;

  // Constructor
  public Detergente(String marca, double precio) {
    this.marca = marca;
    this.precio = precio;
  }

  // Implementación de la interfaz EsLiquido
  @Override
  // Setters y getters de volumen
  public void setVolumen(double volumen) {
    this.volumen = volumen;
  }

  @Override
  public double getVolumen() {
    return volumen;
  }

  @Override
  // Setters y getters de TipoEnvase
  public void setTipoEnvase(String envase) {
    this.tipoEnvase = envase;
  }

  @Override
  public String getTipoEnvase() {
    return tipoEnvase;
  }

  // Setters y getters de Marca
  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getMarca() {
    return marca;
  }

  // Setters y getters de Precio
  public void setPrecio(double precio) {
    this.precio = precio;
  }

  public double getPrecio() {
    return precio;
  }


  //Implementación de la interfaz ConDescuento
  @Override
  public void setDescuento(double descuento) {
    this.descuento = descuento;
  }

  @Override
  public double getDescuento() {
    return descuento;
  }

  @Override
  public double getPrecioDescuento() {
    return precio - (precio * descuento / 100);
  }


  // El toString es un objeto que convierte la clase en un String y muestra todas las características del producto
  @Override
  public String toString() {
    return "Detergente{" + "volumen=" + volumen +
      ", tipoEnvase='" + tipoEnvase + '\'' +
      ", marca='" + marca + '\'' +
      ", precio=" + precio +
      ", descuento=" + descuento +
      '}';
  }
}
