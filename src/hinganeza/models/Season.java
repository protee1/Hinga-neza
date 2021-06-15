package hinganeza.models;
import java.time.LocalDateTime;
/**
*
* @author reg.rw
*/
public class Season { private int id;
 private String igiheCyihinga;
 private LocalDateTime startDate;
 private LocalDateTime endDate;
 
 public Season(String igiheCyihinga,LocalDateTime startDate,LocalDateTime endDate){
 this.igiheCyihinga=igiheCyihinga;
 this.startDate=startDate;
 this.endDate=endDate;
 }
 public void setId(int id){
 this.id=id;
 }
 public int getId(){
 return id;
 }
 
 public void setStartDate(LocalDateTime startDate){
 this.startDate=startDate;
 }
 public LocalDateTime getStartDate(){
 return startDate;
 
 }
 
 public void setEndDate(LocalDateTime endDate){
 this.endDate=endDate;
 }
 public LocalDateTime getEndDate(){
 return endDate;
 
 } 
 public void setIgigeCyihinga(String igiheCyihinga){
 this.igiheCyihinga=igiheCyihinga;
 }
 
 public String getIgiheCyihinga(){
 return igiheCyihinga;
 }
}