package Day8;

import java.util.HashSet;
import java.util.Iterator;

class Employee{
    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int hashCode(){
        return id;
    }

    public boolean equals(Object o){
        if(o instanceof Employee){
            Employee e=(Employee)  o;
            if(e.id==this.id)
                return true;
        }
        return false;
    }
}
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Employee> hashSet=new HashSet<Employee>();
        Employee e1=new Employee(1, "Ram");
        Employee e2=new Employee(1, "Shyam");
        Employee e3=new Employee(1, "Hari");

        hashSet.add(e1);
        hashSet.add(e2);
        hashSet.add(e3);

        Iterator itr=hashSet.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
