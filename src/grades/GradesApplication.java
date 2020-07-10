package grades;

import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args) {
        HashMap<String, Integer> students = new HashMap<>();
        students.put("MickeyDaMouse", 99);
        students.put("GirlDuck", 78);
        students.put("MooooonBeam", 68);
        students.put("DispDuck", 82);


        System.out.println(students);

    }
}