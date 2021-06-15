package hinganeza.models;
public class Umuhinzi {
 private int id;
 private String izina;
 private int imyaka;
 private int amasaha;
 private boolean afiteImodoka;
 
 public Umuhinzi(String izina,int imyaka, int amasaha, boolean afiteImodoka){
 this.izina=izina;
 this.imyaka=imyaka;
 this.afiteImodoka=afiteImodoka;
 this.amasaha=amasaha;
 
 }
 public void setId(int id){
 this.id=id;
 }
 public int getId(){
 return id;
 }
 public void setizina(String izina){
 this.izina=izina;
 }
 public String getIzina(){
 return izina;
 }
  public void setImayaka(int imyaka){
 this.imyaka=imyaka;
 }
 public int getImyaka(){
 return imyaka;
 }
 
 public void setAmasaha(int amasaha){
 this.amasaha=amasaha;
 }
 public int getAmasaha(){
 return amasaha;
 }
 public void setAfiteImadoka(boolean afiteImodoka){
 this.afiteImodoka=afiteImodoka;
 }
 public boolean getAfiteImodoka(){
 return afiteImodoka;
 }
 
}