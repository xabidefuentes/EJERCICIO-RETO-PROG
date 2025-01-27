import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner; // Importar la lectura del teclado

public class EjercicioRetoProg {
    public static void main() {
        Scanner escaner = new Scanner(System.in);
        int opcion=0;
        do {

            System.out.println("********************* BIENVENIDO A LA BIBLIOTECA MUNICIPAL DE MUSKIZ *********************");
            System.out.println("******************************************************************************************");
            System.out.println("Seleccione el ejercicio que deseas ejecutar:");
            System.out.println("1. Ejercicio 1: GÉNERO FAVORITO");
            System.out.println("2. Ejercicio 2: COMPROBAR PENALIZACIONES");
            System.out.println("3. Ejercicio 3: HACER INVENTARIO");
            System.out.println("4. Ejercicio 4: COMPROBAR INVENTARIO");
            System.out.println("5. Salir");
    
            try {
                opcion = escaner.nextInt();
                if(escaner.hasNextLine()){//esto es para limpiar el buffer del teclado en caso de que tenga algo 
                escaner.nextLine();}
                switch (opcion) {
                    case 1:
                        ejercicio1(escaner);
                        break;
                    case 2:
                        ejercicio2(escaner);
                        break;
                    case 3:
                        ejercicio3(escaner);
                        break;
    
                    case 4:
                        ejercicio4(escaner);
                        break;
                    case 5:
                        System.out.println("Saliendo...");
                        escaner.close();
                        return;
                    default:
                        System.out.println("ERROR, seleciona una opción válida.");
                        break;
                }
            
            
            } catch (NumberFormatException e) {
                System.out.println("ERROR, seleciona una opción válida.");

            }
        } while (opcion<=5);
            escaner.close(); // Cierra la lectura del teclado 
           
    }

    public static void ejercicio1(Scanner teclado) {
        
    int TeoriaPolitica = 0;
   int NarrativaFantastica = 0;
   int TerrorEspacial = 0;
   int DramaCoreano = 0;

   System.out.println("********************* Bienvenido a la Biblioteca Municipal de Muskiz *********************");
   System.out.println("******************************************************************************************");
   System.out.println("En este programa indicaras mediante un numero del 1 al 7 que genero de lectura prefieres.");
   System.out.println("     1-Teoria Politica\r\n" + //
            "     2-Narrativa Fantastica\r\n" + //
            "     3-Terror Espacial\r\n" + //
            "     4-Drama Coreano");

   for (int cont = 0; cont < 100; cont++) {
      System.out.println("Introduzca su elección: ");
      int opcion = Integer.parseInt(teclado.nextLine());
      switch (opcion) {
         case 1:
            TeoriaPolitica++;
            break;

         case 2:
            NarrativaFantastica++;
            break;

         case 3:
            TerrorEspacial++;
            break;

         case 4:
            DramaCoreano++;
            break;
        
         default:
            System.out.println("Eso no está dentro de las opciones");
            cont = cont - 1;
            break;
        }
        System.out.println("");
        System.out.println("Registrado correctamente");
        System.out.println("");
     }

     System.out.println(TeoriaPolitica+" personas han elegido el género Teoria Politica");
     System.out.println(NarrativaFantastica+" personas han elegido el género Narrativa Fantastica");
     System.out.println(TerrorEspacial+" personas han elegido el género Terror Espacial");
     System.out.println(DramaCoreano+" personas han elegido el género Drama Coreano");

     System.out.println("");
     System.out.println("Este es el orden de mayor a menor:");
     System.out.println("");

   if (TeoriaPolitica>=NarrativaFantastica && TeoriaPolitica>=TerrorEspacial && TeoriaPolitica>=DramaCoreano) {
      if (NarrativaFantastica>=TerrorEspacial && NarrativaFantastica>=DramaCoreano) {
         if (TerrorEspacial>=DramaCoreano) {
            System.out.println("     1-Teoria Politica\r\n" + //
            "     2-Narrativa Fantastica\r\n" + //
            "     3-Terror Espacial\r\n" + //
            "     4-Drama Coreano");
         } else {
            System.out.println("     1-Teoria Politica\r\n" + //
            "     2-Narrativa Fantastica\r\n" + //
            "     3-Drama Coreano\r\n" + //
            "     4-Terror Espacial");
         }
      } else if (TerrorEspacial>=NarrativaFantastica && TerrorEspacial>=DramaCoreano) {
         if (NarrativaFantastica>=DramaCoreano) {
            System.out.println("     1-Teoria Politica\r\n" + //
            "     2-Terror Espacial\r\n" + //
            "     3-Narrativa Fantastica\r\n" + //
            "     4-Drama Coreano");
         } else {
            System.out.println("     1-Teoria Politica\r\n" + //
            "     2-Terror Espacial\r\n" + //
            "     3-Drama Coreano\r\n" + //
            "     4-Narrativa Fantastica");
         }
      } else if (DramaCoreano>=TerrorEspacial && DramaCoreano>=NarrativaFantastica){
         if (NarrativaFantastica>=TerrorEspacial) {
            System.out.println("     1-Teoria Politica\r\n" + //
            "     2-Drama Coreano\r\n" + //
            "     3-Narrativa Fantastica\r\n" + //
            "     4-Terror Espacial");
         } else {
            System.out.println("     1-Teoria Politica\r\n" + //
            "     2-Drama Coreano\r\n" + //
            "     3-Terror Espacial\r\n" + //
            "     4-Narrativa Fantastica");
         }
      }
   }

   if (NarrativaFantastica>=TeoriaPolitica && NarrativaFantastica>=TerrorEspacial && NarrativaFantastica>=DramaCoreano) {
      if (TeoriaPolitica>=TerrorEspacial && TeoriaPolitica>=DramaCoreano) {
         if (TerrorEspacial>=DramaCoreano) {
            System.out.println("     1-Narrativa Fantastica\r\n" + //
            "     2-Teoria Politica\r\n" + //
            "     3-Terror Espacial\r\n" + //
            "     4-Drama Coreano");
         } else {
            System.out.println("     1-Narrativa Fantastica\r\n" + //
            "     2-Teoria Politica\r\n" + //
            "     3-Drama Coreano\r\n" + //
            "     4-Terror Espacial");
         }
      } else if (TerrorEspacial>=TeoriaPolitica && TerrorEspacial>=DramaCoreano) {
         if (TeoriaPolitica>=DramaCoreano) {
            System.out.println("     1-Narrativa Fantastica\r\n" + //
            "     2-Terror Espacial\r\n" + //
            "     3-Teoria Politica\r\n" + //
            "     4-Drama Coreano");
         } else {
            System.out.println("     1-Narrativa Fantastica\r\n" + //
            "     2-Terror Espacial\r\n" + //
            "     3-Drama Coreano\r\n" + //
            "     4-Teoria Politica");
         }
      } else if (DramaCoreano>=TerrorEspacial && DramaCoreano>=TeoriaPolitica){
         if (TeoriaPolitica>=TerrorEspacial) {
            System.out.println("     1-Narrativa Fantastica\r\n" + //
            "     2-Drama Coreano\r\n" + //
            "     3-Teoria Politica\r\n" + //
            "     4-Terror Espacial");
         } else {
            System.out.println("     1-Narrativa Fantastica\r\n" + //
            "     2-Drama Coreano\r\n" + //
            "     3-Terror Espacial\r\n" + //
            "     4-Teoria Politica");
         }
      }
   }

   if (TerrorEspacial>=NarrativaFantastica && TerrorEspacial>=TeoriaPolitica && TerrorEspacial>=DramaCoreano) {
      if (NarrativaFantastica>=TeoriaPolitica && NarrativaFantastica>=DramaCoreano) {
         if (TeoriaPolitica>=DramaCoreano) {
            System.out.println("     1-Terror Espacial\r\n" + //
            "     2-Narrativa Fantastica\r\n" + //
            "     3-Teoria Politica\r\n" + //
            "     4-Drama Coreano");
         } else {
            System.out.println("     1-Terror Espacial\r\n" + //
            "     2-Narrativa Fantastica\r\n" + //
            "     3-Drama Coreano\r\n" + //
            "     4-Teoria Politica");
         }
      } else if (TeoriaPolitica>=NarrativaFantastica && TeoriaPolitica>=DramaCoreano) {
         if (NarrativaFantastica>=DramaCoreano) {
            System.out.println("     1-Terror Espacial\r\n" + //
            "     2-Teoria Politica\r\n" + //
            "     3-Narrativa Fantastica\r\n" + //
            "     4-Drama Coreano");
         } else {
            System.out.println("     1-Terror Espacial\r\n" + //
            "     2-Teoria Politica\r\n" + //
            "     3-Drama Coreano\r\n" + //
            "     4-Narrativa Fantastica");
         }
      } else if (DramaCoreano>=TeoriaPolitica && DramaCoreano>=NarrativaFantastica){
         if (NarrativaFantastica>=TeoriaPolitica) {
            System.out.println("     1-Terror Espacial\r\n" + //
            "     2-Drama Coreano\r\n" + //
            "     3-Narrativa Fantastica\r\n" + //
            "     4-Teoria Politica");
         } else {
            System.out.println("     1-Terror Espacial\r\n" + //
            "     2-Drama Coreano\r\n" + //
            "     3-Teoria Politica\r\n" + //
            "     4-Narrativa Fantastica");
         }
      }
   }

   if (DramaCoreano>=NarrativaFantastica && DramaCoreano>=TerrorEspacial && DramaCoreano>=TeoriaPolitica) {
      if (NarrativaFantastica>=TerrorEspacial && NarrativaFantastica>=TeoriaPolitica) {
         if (TerrorEspacial>=TeoriaPolitica) {
            System.out.println("     1-Drama Coreano\r\n" + //
            "     2-Narrativa Fantastica\r\n" + //
            "     3-Terror Espacial\r\n" + //
            "     4-Teoria Politica");
         } else {
            System.out.println("     1-Drama Coreano\r\n" + //
            "     2-Narrativa Fantastica\r\n" + //
            "     3-Teoria Politica\r\n" + //
            "     4-Terror Espacial");
         }
      } else if (TerrorEspacial>=NarrativaFantastica && TerrorEspacial>=TeoriaPolitica) {
         if (NarrativaFantastica>=TeoriaPolitica) {
            System.out.println("     1-Drama Coreano\r\n" + //
            "     2-Terror Espacial\r\n" + //
            "     3-Narrativa Fantastica\r\n" + //
            "     4-Teoria Politica");
         } else {
            System.out.println("     1-Drama Coreano\r\n" + //
            "     2-Terror Espacial\r\n" + //
            "     3-Teoria Politica\r\n" + //
            "     4-Narrativa Fantastica");
         }
      } else if (TeoriaPolitica>=TerrorEspacial && TeoriaPolitica>=NarrativaFantastica){
         if (NarrativaFantastica>=TerrorEspacial) {
            System.out.println("     1-Drama Coreano\r\n" + //
            "     2-Teoria Politica\r\n" + //
            "     3-Narrativa Fantastica\r\n" + //
            "     4-Terror Espacial");
         } else {
            System.out.println("     1-Drama Coreano\r\n" + //
            "     2-Teoria Politica\r\n" + //
            "     3-Terror Espacial\r\n" + //
            "     4-Narrativa Fantastica");
         }
      }
   }


}
    
    public static void ejercicio2(Scanner teclado) {
        
        System.out.println("~~~~~~~~~~ EJERCICIO 2 ~~~~~~~~~~");
        System.out.println("Introduce la fecha de recogida del libro (dd/MM/yyyy):");
        String fechaIntroducida = teclado.nextLine();
        
    
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate fechaRecogida = null;
        try {
            fechaRecogida = LocalDate.parse(fechaIntroducida, formateador);
        } catch (DateTimeParseException e) {
            System.out.println("ERROR, la fecha tiene que tener este formato: dd/MM/yyyy");
        }

        
        LocalDate fechaLimite = fechaRecogida.plusDays(30);
        LocalDate fechaActual = LocalDate.now();

      
        int diasPasados = fechaActual.getDayOfYear() - fechaLimite.getDayOfYear();
        int diasRestantes = fechaLimite.getDayOfYear() - fechaActual.getDayOfYear();

    
        if (fechaActual.isAfter(fechaLimite)) {
            System.out.println("La fecha máxima de entrega era el día: " + fechaLimite.format(formateador) + ". Se ha pasado de fecha " + diasPasados + " dias, hay que sancionarlo.");
        } else {
            System.out.println("La fecha máxima de entrega es el día: " + fechaLimite.format(formateador) + ". La fecha está dentro de plazo, le quedan " + diasRestantes + " días para entregar el libro.");
        }
    }
    
    public static void ejercicio3(Scanner teclado) {
        System.out.println("~~~~~~~~~~ EJERCICIO 3 ~~~~~~~~~~");
        int contMedia = 0 , acumPag = 0 , maxPaginas = 0 , minPaginas = 10000 , contLibros = 0;
        String tituloMax = "" , tituloMin = "";
        System.out.println("Cuando quieras terminar mete la palabra termine");
        System.out.println("Dame el titulo del libro");
        String titulo = teclado.nextLine();
        
        while(!titulo.equals("termine")){
            System.out.println("Dame el número de páginas");
             int paginas = teclado.nextInt(); // Leer del teclado
             if(teclado.hasNextLine()){ // Esto es para limpiar el buffer del teclado en caso de que tenga algo 
                teclado.nextLine();
                if(paginas > maxPaginas){
                    maxPaginas = paginas;
                    tituloMax = titulo;
        
                }
                if (paginas < minPaginas) {
                    minPaginas = paginas;
                    tituloMin = titulo;
                }
                if(paginas >= 300){
                    contLibros++;
                }
                contMedia=contMedia+paginas;
                acumPag++;
                System.out.println("Dame el titulo del libro");
    
            }
        }
        if(contMedia==0){
            System.out.println("No se ha introducido ningun libro ");
        }else{
             System.out.println("La media de paginas de todos los libros es: "+contMedia/acumPag);
        }
        System.out.println("El titulo del libro con más páginas es: " + tituloMax);
        System.out.println("el titulo del libro con menos páginas es: " + tituloMin );
        if (contLibros == 0){
            System.out.println("No hay ningun libro con mas de 300 paginas");
        } else {
        System.out.println("La cantidad de libros que tienen mas de 300 páginas son: " + contLibros);
        }
        }

    public static void ejercicio4(Scanner teclado) {
        System.out.println("~~~~~~~~~~ EJERCICIO 4 ~~~~~~~~~~");
        int totallibros = 45000;
        int cont = 0;
        String titulo = "";
        System.out.println("Para terminar mete un titulo vacio");
        System.out.println("Mete los titulos de los libros:");
        titulo = teclado.nextLine(); // Leer del teclado
        while(!titulo.equals("")){
            cont++;
            System.out.println("Mete los titulos de los libros:");
            titulo=teclado.nextLine(); // Leer del teclado
        }
        if (cont == totallibros){
            System.out.println("El inventario es correcto");
        } else {
            int resta=totallibros-cont;
            System.out.println("Faltan " + resta + " libros por devolver");
        } 
        }
}

