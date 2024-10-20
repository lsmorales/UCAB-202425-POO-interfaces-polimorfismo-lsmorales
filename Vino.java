package ve.edu.ucab.lab;

import java.time.LocalDate;

public class Vino implements EsAlimento, EsLiquido, ConDescuento {
  private double volumen;
  private String tipoEnvase;
  public String marca;
  public String tipoVino;
  public int gradosAlcohol;
  public double precio;
  private double descuento;
  private LocalDate caducidad;

  public Vino(double volumen, String tipoEnvase, String marca, String tipoVino, int gradosAlcohol, double precio, double descuento) {
    this.volumen = volumen;
    this.tipoEnvase = tipoEnvase;
    this.marca = marca;
    this.tipoVino = tipoVino;
    this.gradosAlcohol = gradosAlcohol;
    this.precio = precio;
    this.descuento = descuento;
  }

  // Implementación de métodos de EsAlimento
  @Override
  public void setCaducidad(LocalDate fc) {
    this.caducidad = fc;
  }

  @Override
  public LocalDate getCaducidad() {
    return caducidad;
  }

  @Override
  public int getCalorias() {
    return calcularCalorias(); // Llamamos al metodo que calcula las calorias
  }

  // Setters y getters de volumen
  @Override
  public void setVolumen(double volumen) {
    this.volumen = volumen;
  }

  @Override
  public double getVolumen() {
    return volumen;
  }

  // Setters y getters de TipoEnvase
  @Override
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

  // Setters y getters de tipoVino
  public void setTipoVino(String tipoVino) {
    this.tipoVino = tipoVino;
  }

  public String getTipoVino() {
    return tipoVino;
  }

  // Setters y getters de gradosAlcohol
  public void setGradosAlcohol(int gradosAlcohol) {
    this.gradosAlcohol = gradosAlcohol;
  }

  public int getGradosAlcohol() {
    return gradosAlcohol;
  }

  // Setters y getters de Precio
  public void setPrecio(double precio) {
    this.precio = precio;
  }

  public double getPrecio() {
    return precio;
  }

  // Metodo que calcula las calorias del vino
  public int calcularCalorias() {
    return gradosAlcohol * 10;
  }

  // Implementación de la interfaz ConDescuento
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

  @Override
  public String toString() {
    return "Vino{" + "volumen=" + volumen +
      ", tipoEnvase='" + tipoEnvase + '\'' +
      ", marca='" + marca + '\'' +
      ", tipoVino='" + tipoVino + '\'' +
      ", gradosAlcohol=" + gradosAlcohol +
      ", precio=" + precio +
      ", descuento=" + descuento +
      ", caducidad=" + caducidad +  // Mostrar la caducidad en el toString
      '}';
  }
}

