package ve.edu.ucab.lab;

import java.time.LocalDate;
import java.util.ArrayList; //Permite usar listas dinámicas, que se ajustan en tamaño de acuerdo a la cantidad
                            //de elementos que se agreguen o eliminen, no tienen tamaño fijo
import java.util.List;

public class Main {
  public static void main(String[] args) {
    Detergente detergente = new Detergente("Ariel", 5);
    Detergente detergente1 = new Detergente("Fabuloso", 17);
    EsLiquido detergente2 = new Detergente("Suavitel", 18);
    System.out.println(detergente.toString());
    System.out.println(detergente1.toString());
    System.out.println(detergente2.toString());

    Cereal cereal = new Cereal("Chocokrispy", 14, "espelta", LocalDate.now().plusMonths(3)); //LocalDate es una var nueva, se instancia de forma diferente
    EsAlimento cereal1 = new Cereal("Zucaritas", 17, "trigo", LocalDate.now().plusMonths(1));
    System.out.println(cereal.toString());
    System.out.println(cereal1.toString());

    Vino vino = new Vino(1000, "vidrio", "Torres", "Tinto", 12, 20, 25);
    Vino vino1 = new Vino(900, "vidrio", "Villa Maria", "Blanco", 10, 22, 15);
    Vino vino2 = new Vino(950, "vidrio", "Penfolds", "Rosado", 12, 25, 20);
    System.out.println(vino.toString());
    System.out.println(vino1.toString());
    System.out.println(vino2.toString());

    List<EsAlimento> productos = new ArrayList<>();
    productos.add(cereal);
    productos.add(cereal1);
    productos.add(vino);
    productos.add(vino1);
    productos.add(vino2);

    //Suma de las calorías de los productos
    int sumarCalorias = 0; //Acumulará el total de calorías de todos los productos
    for (EsAlimento producto : productos) { //En cada iteración, la var producto toma el valor de uno de los elementos
      //de la lista (objetos que implementan la interfaz EsAlimento)
      sumarCalorias = sumarCalorias + producto.getCalorias(); //Se llama al metodo getCalorias que va devolviendo
      //la cantidad de calorías del producto actual
      //Suma el valor devuelto por getCalorias a la var sumarCalorias
    }
    System.out.println("En total, va a consumir " + sumarCalorias + " calorias");
  }
}

