package Day10;

import java.io.*;
import java.util.ArrayList;

class Student1{
    int id,age;
    String studentName;

    public Student1(int id, int age, String studentName) {
        this.id = id;
        this.age = age;
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "id=" + id +
                ", age=" + age +
                ", studentName='" + studentName + '\'' +
                '}';
    }
}
public class WithoutSerialization {
    public static void main(String[] args) {
        Student1 s1=new Student1(1,20, "Ram");
        Student1 s2=new Student1(2,22, "Shyam");
        Student1 s3=new Student1(3,25, "Hari");
        try{
            FileWriter writer=new FileWriter("D:\\Intern Syllabus\\output1.txt");
            BufferedWriter bufferedWriter=new BufferedWriter(writer);
            ArrayList<Student1> list=new ArrayList<>();
            list.add(s1);
            list.add(s2);
            list.add(s3);
            bufferedWriter.write(String.valueOf(list));
            bufferedWriter.flush();
            bufferedWriter.close();

            FileReader reader=new FileReader("D:\\Intern Syllabus\\output1.txt");
            BufferedReader bufferedReader=new BufferedReader(reader);
            String ch;
            while ((ch=bufferedReader.readLine())!=null){
                System.out.println(ch);
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
