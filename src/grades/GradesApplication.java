package grades;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        Student elenasofia = new Student("Elena-Sofia");
        elenasofia.addGrade(99);
        elenasofia.addGrade(75);
        elenasofia.addGrade(86);
        students.put("fashionista11", elenasofia);

        Student lucia= new Student("Lucia");
        lucia.addGrade(88);
        lucia.addGrade(90);
        lucia.addGrade(100);
        students.put("partyGurl", lucia);

        Student monica = new Student("Monica");
        monica.addGrade(30);
        monica.addGrade(90);
        monica.addGrade(100);
        students.put("magmatizm", monica);

        Student marina = new Student("Marina");
        marina.addGrade(100);
        marina.addGrade(28);
        marina.addGrade(88);
        students.put("sadGirlz", marina);


    }
}
