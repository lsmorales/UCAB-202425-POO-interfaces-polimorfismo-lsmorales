package ve.edu.ucab.lab;

import java.time.LocalDate;

public interface EsAlimento {
  public void setCaducidad(LocalDate fc);
  public LocalDate getCaducidad();
  public int getCalorias();
}
