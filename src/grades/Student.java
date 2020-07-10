package grades;
import java.util.ArrayList;



public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public static void main(String[] args) {
        Student Harry =  new Student("Harry");
        Harry.addGrade(98);
        Harry.addGrade(78);
        Harry.addGrade(100);

        Student William =new Student("William");
        William.addGrade(100);
        William.addGrade(99);
        William.addGrade(100);

        Student Kate = new Student("Kate");
        Kate.addGrade(77);
        Kate.addGrade((69));
        Kate.addGrade(85);

        Student Megan = new Student("Megan");
        Megan.addGrade(89);
        Megan.addGrade(92);
        Megan.addGrade(95);

        System.out.println(Harry.name);
        System.out.println(Harry.getGradeAverage());
        System.out.println(William.name);
        System.out.println(William.getGradeAverage());
        System.out.println(Kate.name);
        System.out.println(Kate.getGradeAverage());
        System.out.println(Megan.name);
        System.out.println(Megan.getGradeAverage());


    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String name) {
        this.name = name;
        this.grades= new ArrayList<>();;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public String getName() {
        return name;
    }

    public void addGrade(int grade) {
        grades.add(grade);

    }

    public double getGradeAverage(){
         int total = 0;
        for(int grade : grades)  {
            total += grade;
        }
        return total / grades.size();
    }

    public Student() {





    }
}
