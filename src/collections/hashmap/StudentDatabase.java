//package collections.hashmap;
//import java.util.*;
//public class StudentDatabase {
//    private HashMap<String, Student> students= new HashMap<>();
//
//    public StudentDatabase(List<Student> students) {
//        students.forEach(currentStudent-> this.students.put(currentStudent.getCNP(),currentStudent));
//    }
//    public String findStudentName(String CNP) throws Student.CNPSizeException
//    {
//        if(CNP.length() != 10)
//        {
//            throw new Student.CNPSizeException();
//        }
//        return students.getCNP().getName();
//    }
//}
