package Day8;

import java.util.HashMap;
import java.util.Map;


class Student{
    String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
class StudentId{
    int id;

    public StudentId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "StudentId{" +
                "id=" + id +
                '}';
    }

    public  int hashCode(){
        return id;
    }

    public  boolean equals(Object o){
        if(o instanceof StudentId){
            StudentId s=(StudentId) o;
            if(s.id==this.id)
                return true;
            else
                return false;
        }
        return false;
    }
}
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<StudentId, Student> hashMap=new HashMap<>();
        Student s1=new Student("Ram");
        Student s2=new Student("Shyam");
        Student s3=new Student("Hari");

        StudentId id1=new StudentId(1);
        StudentId id2=new StudentId(1);
        StudentId id3=new StudentId(3);

        hashMap.put(id1,s1);
        hashMap.put(id2,s2);
        hashMap.put(id3,s3);

        for(Map.Entry m: hashMap.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

    }
}
