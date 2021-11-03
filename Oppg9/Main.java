
class Main{
  public static void main(String[] args) {

    Student daniel = new Student("Daniel",9);
    Student jakob = new Student("Jakob",2);
    Student marius = new Student("Marius",10);
    Student donald = new Student("Donald",0);
    Student yo = new Student("yo",10);

    Taskoverview overview = new Taskoverview();

    overview.registerNewStudent(daniel);
    overview.registerNewStudent(jakob);
    overview.registerNewStudent(marius);

    overview.incStudentTask(marius, 3);
    overview.incStudentTask(donald, 3);
    overview.incStudentTask(yo, 99);

    System.out.println(overview.toString());

  }
}
