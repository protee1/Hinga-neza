
package hinganeza;

import hinganeza.models.Akarere;
import hinganeza.models.Igihingwa;
import hinganeza.models.Season;
import hinganeza.models.Umurima;
import java.time.LocalDateTime;
import java.util.Scanner;

/**
 *
 * @author reg.rw
 */
public class Hinganeza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //igihembwe cyihinga
        System.out.println("Murakaza neza muri program ya Hinga neza");
        System.out.println("Mwatangira mwinjiza amakuru yibanze kumuhinzi kanda Enter gkomeza");
        
        System.out.print("Shyiramo igihembwe cyihinga ushaka guhingamo: ");
        Scanner igihembweCyihingwa=new Scanner(System.in);
        String _season=igihembweCyihingwa.next();
        Season season=new Season();
        season.setIzina(_season);
        
        //umurima
        System.out.print("Injizamo amakuru arebana numurima wandika ubwoko bwumurima munyuguti nto:");
         Scanner ubwokoBwumurima=new Scanner(System.in);
        String ubwoko=ubwokoBwumurima.next();
        Umurima umurima=new Umurima();
        umurima.setizina(ubwoko);
        //akarere
        System.out.print("Injizamo akarere umurima uherereyemo:");
         Scanner akarereKumurima=new Scanner(System.in);
        String _akarere=akarereKumurima.next();
        Akarere akarere=new Akarere();
        akarere.setIzina(_akarere);
        
        //igihingwa
         System.out.print("Injizamo igihingwa ushaka guhinga:");
         Scanner _igihingwa=new Scanner(System.in);
        String ig=_igihingwa.next();
        Igihingwa igihingwa=new Igihingwa();
        igihingwa.setIzina(ig);
        
                    System.out.println("wingijemo:\n"+ "season: " +season.getIzina() +"\n"+ "umurima: "+ umurima.getIzina() +"\n"+"igihingwa: " + igihingwa.getIzina() + "\n"+ "akarere: " +akarere.getIzina());

        if(season.getIzina().equalsIgnoreCase("umuhindo")|| umurima.getIzina().equalsIgnoreCase("amakoro" )|| akarere.getIzina().equalsIgnoreCase("musanze") || igihingwa.getIzina()=="ibirayi"){
            System.out.println("wingijemo:\n"+ "season: " +season.getIzina() +"\n"+ "umurima: "+ umurima.getIzina() +"\n"+"igihingwa: " + igihingwa.getIzina() + "\n"+ "akarere: " +akarere.getIzina());
        }
        else{
            System.out.println(" ntabwo wemerewe guhinga");
        }
        
        
        
        
    }
    
}
