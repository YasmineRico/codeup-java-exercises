package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name){
        this.name= name;
        this.grades = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public void addGrade(int grade){
        grades.add(grade);
    }

    public double getGradeAverage(){
        int total = 0;
        for (Integer grade: grades) total += grade;
        return total/grades.size();
    }
//Javier said not to do this... whoops.
    public static void main(String[] args) {
        Student thomas = new Student("Thomas");
        thomas.getName();
        thomas.addGrade(100);
        thomas.addGrade(80);
        thomas.addGrade(75);
        System.out.println(thomas.getName());
        System.out.println(thomas.getGradeAverage());
    }



}


