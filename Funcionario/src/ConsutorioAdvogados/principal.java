package ConsutorioAdvogados;

/**
 *
 * @author Iris Correa
 */
public class principal {
    public static void main(String[] args) {
        //Criando e instanciando o objeto
        Advogado adv = new Advogado();
        
        //Método de entrada
        double trab = adv.EntrarTrabalhista();
        double crim = adv.EntrarCriminal();
        double civil = adv.EntrarCivil();
        
        //métodos de calculo
        double caltrab = adv.CalculoTrabalhista(trab);
        double calcrim = adv.CalculoCriminal(crim);
        double calcivil = adv.CalculoCivil(civil);
        
        //Método de saída
        adv.ExibirTotalHonorario(calcivil, calcrim, caltrab);
    }
}
