/**
 * Classe amb Objecte CompteBancari amb les seves funcions i atributs. Emmegatzemar info
 * @version 1.0
 * @author Silvia
 */
public class CompteBancari {
    /**
     * Variables de clase
     * nom = String - nom propietari
     * numSecret = int - pin 
     * saldoInicial = float. Static - sempre el mateix
     * saldo = float - saldo compte bancaria
     */
    private String nom;
    private int numSecret;
    private static float saldoInicial = (float) 100.0;
    private float saldo;
    
    /**
     * Constructor de classe. Dades a introduir i guardar:
     * @param nom inicia obj
     * @param numSecret inicia obj
     */
    public CompteBancari(String nom, int numSecret) {
        this.nom = nom;
        this.numSecret = numSecret;
        this.saldo = CompteBancari.saldoInicial;
    }
    
    /**
     * Funcio - Obtenir nom propietari
     * @return String nom
     */
    public String getNom() {
        return this.nom;
    }

    /**
     * Funcio - obtenir numSecret(pin)
     * @return Integer numSecret
     */
    public int getNumSecret() {
        return this.numSecret;
    }

    /**
     * Funcio - obtenir saldo compte
     * @return Float saldo
     */
    public float consultarSaldo() {
        return this.saldo;
    }

    /**
     * Funcio obtenir saldo Inicial 
     * @return Static Float saldo inicial (0.0)
     */
    public static float getSaldoInicial() {
        return CompteBancari.saldoInicial;
    }

    /**
     * Funcio otorgar saldo Inicial (0.0)
     * @param saldoIncial Static Float
     */
    public static void setSaldoInicial(float saldoIncial) {
        CompteBancari.saldoInicial = saldoIncial;
    }

    /**
     * Funcio mostra dades d'un obj
     * @return String + String(nom) + numSecret(int) + saldo(float)
     */
    public String mostrarDades() {
        return ("El propietari es diu: " + this.nom + " amb número secret: "
                + this.numSecret + ". El saldo actual es: " + this.saldo);
    }

    /**
     * Funcio suma saldo. Condició: qunatiat -q 0
     * @param quantitat donat per l'usuari (-q 0)
     * @return boolean = resultat
     */
    public boolean ingressar(float quantitat) {
        boolean resultat = false;
        if (quantitat >= 0) {
            this.saldo = this.saldo + quantitat;
            resultat = true;
        }
        return resultat;
    }
    
    /**
     * Funcio resta saldo. Condició: quantitat -q 0
     * @param quantitat donat per usuari. (-q 0)
     * @return boolan = resultat
     */
    public boolean extreure(float quantitat) {
        boolean resultat = false;
        if (quantitat >= 0) {
            this.saldo = this.saldo - quantitat;
            resultat = true;
        }
        return resultat;
    }
    
    public String saludo(){
        return "Hola que tal!";
    }
}
