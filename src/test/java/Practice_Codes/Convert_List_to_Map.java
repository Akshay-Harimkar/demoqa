package Practice_Codes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Students{
    private String name;
    private int rollno;


    public Students(String name, int rollno){
        this.name = name;
        this.rollno = rollno;
    }


    public String getName(){
        return name;
    }

    public int getRollNO(){
        return rollno;

    }
}

public class Convert_List_to_Map {
    public static void main(String[] args) {
    List<Students> students = new ArrayList<>();   
    students.add(new Students("Shivam", 001));
    students.add(new Students("Akshay", 002));
    students.add(new Students("random", 003));
    students.add(new Students("harsh",004));

    Map<String, Integer> studentsMap = new HashMap<>();
    for(Students student : students){
        studentsMap.put(student.getName(), student.getRollNO());
}
 System.out.println(studentsMap);
    
    
    }
}
