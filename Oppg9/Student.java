

public class Student{

  private String name;
  private int taskQty;

  public Student(String name, int taskQty){
    this.name = name;
    this.taskQty = taskQty;
  }

  public String getName(){
    return name;
  }

  public int getTasktQty(){
    return taskQty;
  }

  public void incTaskQty(int increment){
    this.taskQty += increment;
  }

  public String toString(){
    return "Name: " + name + " | Task quantity: " + taskQty;
  }


}
