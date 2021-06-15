package hinganeza.models;
/**
*
* @author reg.rw
*/
public class Akarere {
 private int id;
private String izina;
private int maxTemperature;
private int minTemperature;
private double maxRainfall;
private double minRainFall;
private String avarageClimate;
public Akarere(){}
private String latitude;public Akarere(String izina,int maxTemperature,int minTemperature,double maxRainfall,double 
minRainFall,String avarageClimate,String latitude){
this.izina=izina;
this.maxTemperature=maxTemperature;
this.minTemperature=minTemperature;
this.maxRainfall=maxRainfall;
this.minRainFall=minRainFall;
this.avarageClimate=avarageClimate;
this.latitude=latitude;
}
 public int getId() {
 return id;
 }
 public void setId(int id) {
 this.id = id;
 }
 public String getIzina() {
 return izina;
 }
 public void setIzina(String izina) {
 this.izina = izina;
 }
 public int getMaxTemperature() {
 return maxTemperature;
 } public void setMaxTemperature(int maxTemperature) {
 this.maxTemperature = maxTemperature;
 }
 public int getMinTemperature() {
 return minTemperature;
 }
 public void setMinTemperature(int minTemperature) {
 this.minTemperature = minTemperature;
 }
 public double getMaxRainfall() {
 return maxRainfall;
 }
 public void setMaxRainfall(double maxRainfall) {
 this.maxRainfall = maxRainfall;
 }
 public double getMinRainFall() {
 return minRainFall;
 }
 public void setMinRainFall(double minRainFall) {
 this.minRainFall = minRainFall;
 }
 public String getAvarageClimate() {
 return avarageClimate;
 } public void setAvarageClimate(String avarageClimate) {
 this.avarageClimate = avarageClimate;
 }
 public String getLatitude() {
 return latitude;
 }
 public void setLatitude(String latitude) {
 this.latitude = latitude;
 }

    @Override
    public String toString() {
        return "Akarere{" + "id=" + id + ", izina=" + izina + ", maxTemperature=" + maxTemperature + ", minTemperature=" + minTemperature + ", maxRainfall=" + maxRainfall + ", minRainFall=" + minRainFall + ", avarageClimate=" + avarageClimate + ", latitude=" + latitude + '}';
    }
 
}