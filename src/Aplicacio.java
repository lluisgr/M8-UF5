/**
 * Clase on s'executa el programa
 * @author Silvia
 * @version 1.0
 */
public class Aplicacio {
    /**
     * Mètode principal = flux d'esdeveniments principal
     * @param args - String d'arguments(info) per l'execució del programa
     */
    public static void main(String[] args) {
        
        System.out.println("Introdueix el nom del propietari: ");
        String nom = cLlegir.dato();
        System.out.println(".................................................");
        System.out.println("Introdueix el número secret del propietari: ");
        int numero = cLlegir.datoInt();
        System.out.println(".................................................");
        CompteBancari compte = new CompteBancari(nom, numero);
        System.out.println(compte.welcome());
        System.out.println("Introdueix la quantitat a ingressar: ");
        float quantitat = cLlegir.datoFloat();
        boolean resultat = compte.ingressar(quantitat);
        if (resultat == false) {
            System.out.println("No s'ha pogut realitzar l'ingrés!");
        } else {
            System.out.println("Ingrés realitzat correctament!");
            System.out.println(compte.mostrarDades());
        }
        System.out.println(".................................................");

        System.out.println("Introdueix la quantitat a extreure: ");
        quantitat = cLlegir.datoFloat();
        resultat = compte.extreure(quantitat);
        if (resultat == false) {
            System.out.println("No s'ha pogut realitzar l'extracció!");
        } else if (compte.consultarSaldo() < 0) {
            System.out.println("El saldo final del compte és negatiu: " + compte.consultarSaldo());
        } else {
            System.out.println("Ingrés realitzat correctament!");
            System.out.println(compte.mostrarDades());
        }
        System.out.println(".................................................");
        
        
         System.out.println("Introdueix el nom del propietari: ");
        nom = cLlegir.dato();
        System.out.println(".................................................");
        System.out.println("Introdueix el número secret del propietari: ");
        numero = cLlegir.datoInt();
        System.out.println(".................................................");
        
        CompteBancari Comptenum2 = new CompteBancari(nom, numero);
        
        System.out.println("Introdueix la quantitat a trespassar: ");
        quantitat = cLlegir.datoFloat();
        resultat = compte.extreure(quantitat);
        
        if (resultat == false) {
            System.out.println("No s'ha pogut realitzar el traspas");
        } else if (compte.consultarSaldo() < 0) {
            System.out.println("El saldo final del compte és negatiu: " + compte.consultarSaldo());
        } else {   
            resultat = Comptenum2.ingressar(quantitat);
            if(resultat == false){
                System.out.println("No s'ha pogut realitzar el traspas");
            }else{
                System.out.println("Traspas realitzat correctament.");
            }
            System.out.println("Primer compte");
            System.out.println(compte.mostrarDades());
            System.out.println("Segon compte");
            System.out.println(Comptenum2.mostrarDades());
        }
        
        
        System.out.println(".................................................");
        
        
        
    }
}
