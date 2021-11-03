import java.util.ArrayList;

public class Taskoverview{

  private ArrayList<Student> students;
  private int studentQty = 0;


  public Taskoverview(){
    students = new ArrayList<Student>();
  }

  public int studentsRegistered(){
    return students.size();
  }

  public int tasksCompleted(Student a){
    return a.getTasktQty();
  }

  public boolean registerNewStudent(Student newStudent){
    if(students.add(newStudent)){
      studentQty += 1;
      return true;
    }else{
      return false;
    }

  }

  public void incStudentTask(Student student, int i){
    try{
      int index = students.indexOf(student);
      students.get(index).incTaskQty(i);
    }catch(Exception e){
      System.out.println("\n||ERROR|| : " + student.getName() + " not registered");
    }
  }

  public String toString(){
    String text = "\nStudents registered: " + this.studentsRegistered() + "\n\n";
    for(var i=0;i<students.size();i++){
      text += students.get(i).toString() + "\n--------------------------------------------------\n";
    }
    return text;
  }

}
