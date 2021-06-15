package hinganeza.models;
/**
*
* @author reg.rw
*/
public class Ifumbire {
 public int id;
 public String izina;
 public Ifumbire(String izina, int id){
 this.id=id;
 this.izina=izina;
 }
 public void setId(int id){
 this.id=id; }
 public int getId(){
 return id;
 }
 public void setizina(String izina){
 this.izina=izina;
 }
 public String getIzina(){
 return izina;
 }
}
