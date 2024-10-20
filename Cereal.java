package ve.edu.ucab.lab;

import java.time.LocalDate;

public class Cereal implements EsAlimento {
  private LocalDate caducidad;
  private int calorias;
  private String marca;
  private double precio;
  private String tipoCereal;

  // Constructor
  public Cereal(String marca, double precio, String tipoCereal, LocalDate caducidad) {
    this.marca = marca;
    this.precio = precio;
    this.tipoCereal = tipoCereal;
    this.caducidad = caducidad;

    switch (tipoCereal) {
      case "espelta":
        this.calorias = 5;
        break;
      case "maiz":
        this.calorias = 8;
        break;
      case "trigo":
        this.calorias = 12;
        break;
      default:
        this.calorias = 15;
    }
  }

  // Setters y getters de Caducidad
  @Override
  public void setCaducidad(LocalDate fc) {
    this.caducidad = fc;
  }

  @Override
  public LocalDate getCaducidad() {
    return caducidad;
  }

  // Setters y getters de Calorias
  @Override
  public int getCalorias() {
    return calorias;
  }

  public void setCalorias(int calorias) {
    this.calorias = calorias;
  }

  // Setters y getters de Marca
  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  // Setters y getters de Precio
  public double getPrecio() {
    return precio;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

  // Setters y getters de tipoCereal
  public String getTipoCereal() {
    return tipoCereal;
  }

  public void setTipoCereal(String tipoCereal) {
    this.tipoCereal = tipoCereal;
  }

  @Override
  public String toString() {
    return "Cereal{" + "caducidad=" + caducidad +
      ", calorias=" + calorias +
      ", marca='" + marca + '\'' +
      ", precio=" + precio +
      ", tipoCereal='" + tipoCereal + '\'' +
      '}';
  }
}