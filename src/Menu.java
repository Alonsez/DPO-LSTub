
import java.util.Scanner;

/**
 * Clase que tiene el menú del programa
 * @author Mireia Checho on 27/11/2017
 * @version 1.0
 */

public class Menu {

    private Scanner scanner = new Scanner(System.in);
    private int opcion;
    private CercaResultats cercaResultats = new CercaResultats();
    //private Ruta rutaRanking = new Ruta();
    //private ArrayList<LlocsRanking> llocsRanking = new ArrayList<LlocsRanking>();

    public Menu() { }

    /**
     * Funcion que pinta el menú, es un bucle infinito a no ser que se de la orden de salir (opción 7)
     * @throws Exception
     */
    public void printaMenu() throws Exception {

        while (opcion != 7) {
            try {
                System.out.println("************ LSBicing menu: ************\n" +
                        "1. Cerca de Resultats\n" +
                        "2. Desar Preferits\n" +
                        "3. Millors Videos\n" +
                        "4. Estadístiques\n" +
                        "5. Llistes de Reproducció\n" +
                        "6. El Mosaic\n" +
                        "7. Sortir\n" +
                        "Sel·lecciona una opcio:");
                opcion = Integer.parseInt(scanner.nextLine());
                //Map map = new Map();
                //Result[] results;
                switch (opcion) {
                    case 1:

                        cercaResultats.CercaResultats();
                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                    case 4:

                        break;
                    case 5:

                         break;
                    case 6:

                        break;
                    case 7:
                        System.out.println("Exit");
                        break;
                    default:
                        System.out.println("L'opció ha de ser un numero de l'1 al 7");
                        break;
                }


            } catch (NumberFormatException excepcion) {
                System.out.println("L'opció ha de ser un numero de l'1 al 7");
            }catch (RuntimeException e){

                e.printStackTrace();
                //System.out.println("No s'han trobat resultats.");
            }
        }
    }
}

