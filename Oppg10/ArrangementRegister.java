import java.util.ArrayList;
import java.util.Arrays;

public class ArrangementRegister{
  private ArrayList<Arrangement> arrangements;


  public ArrangementRegister(){
    arrangements = new ArrayList<Arrangement>();
  }

  public boolean registerArrangement(Arrangement object){
    if(arrangements.add(object)){
      return true;
    }else{
      return false;
    }
  }

  public void findArrangementByPlace(String place){
    for(var i = 0; i<arrangements.size(); i++){
      if(arrangements.get(i).getPlace().equals(place)){
        arrangements.get(i).printString();
      }
    }
  }

  public void findArrangementByDate(int date){
    for(var i = 0; i<arrangements.size(); i++){
      if((arrangements.get(i).getTime()/10000) == date){
        arrangements.get(i).printString();
      }
    }
  }

  public void findArrangementBetweenDates(int firstDate, int secondDate){
    ArrayList<Long> timeList = new ArrayList<Long>();
    for(var i = 0; i<arrangements.size(); i++){
      if((arrangements.get(i).getTime()/10000) >= firstDate && (arrangements.get(i).getTime()/10000) <= secondDate){
        timeList.add(arrangements.get(i).getTime());
      }
    }
    long[] timeArray = new long[timeList.size()];
    for(var i = 0; i<timeArray.length; i++){
      timeArray[i] = timeList.get(i);
    }
    Arrays.sort(timeArray);

    for(var i = 0; i<timeArray.length; i++){
      for(var j = 0; j<arrangements.size(); j++){
        if(arrangements.get(j).getTime() == timeArray[i]){
          arrangements.get(j).printString();
        }
      }
    }
  }

  public ArrayList<Arrangement> listOfArrangementsByPlace(String place){
    ArrayList<Arrangement> placeList = new ArrayList<Arrangement>();

    for(var i = 0; i<arrangements.size(); i++){
      if(arrangements.get(i).getPlace().equals(place)){
        placeList.add(arrangements.get(i));
      }
    }

    return placeList;
  }

  public ArrayList<Arrangement> listOfArrangementsByType(String type){
    ArrayList<Arrangement> typeList = new ArrayList<Arrangement>();

    for(var i = 0; i<arrangements.size(); i++){
      if(arrangements.get(i).getPlace().equals(type)){
        typeList.add(arrangements.get(i));
      }
    }

    return typeList;
  }

  public ArrayList<Arrangement> listOfArrangementsByTime(long time){
    ArrayList<Arrangement> timeList = new ArrayList<Arrangement>();

    for(var i = 0; i<arrangements.size(); i++){
      if((arrangements.get(i).getTime()) == time){
        timeList.add(arrangements.get(i));
      }
    }

    return timeList;
  }

  public ArrayList<Arrangement> listOfAllArrangements(){
    return arrangements;
  }

  public void printArrangements(ArrayList<Arrangement> list){
    for(var i = 0; i<list.size(); i++){
      list.get(i).printString();
    }
  }



}
