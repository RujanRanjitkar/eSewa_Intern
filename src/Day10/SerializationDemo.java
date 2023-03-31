package Day10;

import java.io.*;
import java.util.ArrayList;

class Student implements Serializable{
    int id, age;
    String studentName;

    public Student(int id, int age, String studentName) {
        this.id = id;
        this.age = age;
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", age=" + age +
                ", studentName='" + studentName + '\'' +
                '}';
    }
}
public class SerializationDemo {
    public static void main(String[] args) {
        Student s1=new Student(1,20, "Ram");
        Student s2=new Student(2,22, "Shyam");
        Student s3=new Student(3,25, "Hari");
        try{
            FileOutputStream fout=new FileOutputStream("D:\\Intern Syllabus\\output.txt");
            ObjectOutputStream out=new ObjectOutputStream(fout);
            ArrayList<Student> list=new ArrayList<>();
            list.add(s1);
            list.add(s2);
            list.add(s3);
            out.writeObject(list);
            out.flush();
            out.close();
            FileInputStream fin=new FileInputStream("D:\\Intern Syllabus\\output.txt");
            ObjectInputStream in=new ObjectInputStream(fin);
            ArrayList<Student> s=(ArrayList<Student>) in.readObject();
            for(Student st: s){
                System.out.println(st);
            }
            in.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
}
