package hinganeza.models;
public class Igihingwa {
 private int id;
private String izina;
private String ubwokoBwigihingwa;
private String inganoYigihingwa;
private String ibaraRyigihingwa;private int minTemperature;
private int maxTemperature;
private double minLength;
private double maxLength;
private int germinatePeriodLength;
public Igihingwa(){}
 public Igihingwa(String izina, String ubwokoBwigihingwa, String inganoYigihingwa, String 
ibaraRyigihingwa, int minTemperature, int maxTemperature, double minLength, double maxLength, 
int germinatePeriodLength) {
 this.izina = izina;
 this.ubwokoBwigihingwa = ubwokoBwigihingwa;
 this.inganoYigihingwa = inganoYigihingwa;
 this.ibaraRyigihingwa = ibaraRyigihingwa;
 this.minTemperature = minTemperature;
 this.maxTemperature = maxTemperature;
 this.minLength = minLength;
 this.maxLength = maxLength;
 this.germinatePeriodLength = germinatePeriodLength;
 }
 public int getId() {
 return id;
 }
 public void setId(int id) {
 this.id = id;
 }
 public String getIzina() {
 return izina;
 } public void setIzina(String izina) {
 this.izina = izina;
 }
 public String getUbwokoBwigihingwa() {
 return ubwokoBwigihingwa;
 }
 public void setUbwokoBwigihingwa(String ubwokoBwigihingwa) {
 this.ubwokoBwigihingwa = ubwokoBwigihingwa;
 }
 public String getInganoYigihingwa() {
 return inganoYigihingwa;
 }
 public void setInganoYigihingwa(String inganoYigihingwa) {
 this.inganoYigihingwa = inganoYigihingwa;
 }
 public String getIbaraRyigihingwa() {
 return ibaraRyigihingwa;
 }
 public void setIbaraRyigihingwa(String ibaraRyigihingwa) {
 this.ibaraRyigihingwa = ibaraRyigihingwa;
 }
 public int getMinTemperature() {
 return minTemperature;
 } public void setMinTemperature(int minTemperature) {
 this.minTemperature = minTemperature;
 }
 public int getMaxTemperature() {
 return maxTemperature;
 }
 public void setMaxTemperature(int maxTemperature) {
 this.maxTemperature = maxTemperature;
 }
 public double getMinLength() {
 return minLength;
 }
 public void setMinLength(double minLength) {
 this.minLength = minLength;
 }
 public double getMaxLength() {
 return maxLength;
 }
 public void setMaxLength(double maxLength) {
 this.maxLength = maxLength;
 }
 public int getGerminatePeriodLength() {
 return germinatePeriodLength; }
 public void setGerminatePeriodLength(int germinatePeriodLength) {
 this.germinatePeriodLength = germinatePeriodLength;
 }

    @Override
    public String toString() {
        return "Igihingwa{" + "id=" + id + ", izina=" + izina + ", ubwokoBwigihingwa=" + ubwokoBwigihingwa + ", inganoYigihingwa=" + inganoYigihingwa + ", ibaraRyigihingwa=" + ibaraRyigihingwa + ", minTemperature=" + minTemperature + ", maxTemperature=" + maxTemperature + ", minLength=" + minLength + ", maxLength=" + maxLength + ", germinatePeriodLength=" + germinatePeriodLength + '}';
    }
 
}
