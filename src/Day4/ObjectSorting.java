package Day4;
class Student{
    int id;
    String name;
    int mark;
    public Student(int id, String name, int mark) {
        this.id = id;
        this.name = name;
        this.mark = mark;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
}
public class ObjectSorting {
    public static void main(String[] args) {
        Student[] obj={new Student(1,"ram",20),
                new Student(2,"hari",11),
                new Student(3,"shyam",12),
                new Student(4,"sita",9)
        };
        Student temp;
        for(int i=0; i<obj.length-1;i++){
            for(int j=i+1; j<obj.length;j++){
                if(obj[i].getMark()>obj[j].getMark()){
                    temp=obj[i];
                    obj[i]=obj[j];
                    obj[j]=temp;
                }
            }
        }
        for(int i=0; i<obj.length;i++){
            System.out.println(obj[i].getId() + obj[i].getName() + obj[i].getMark());
        }
    }

}
