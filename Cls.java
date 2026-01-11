// class Pen{
//     String color;
//     String type;

//     public void printAll(){
//         System.out.println(this.color);
//         System.out.print(this.type);
//     }
// }

// public class Cls {
//     public static void main(String args[]){

//     Pen pen1 = new Pen();
//     pen1.color = "Blue";
//     pen1.type= "Ballpoint";

//     Pen pen2 = new Pen();
//     pen2.color="Red";
//     pen2.type = "Gel";
    
//     pen1.printAll();
//     pen2.printAll();
    
//     }
// }

// class Student{
//     String name;
//     int age;
//     String city;

//     public void Info(){
//         System.out.println(this.name);
//         System.out.println(this.age);
//         System.out.println(this.city);
//     }
// }
// public class Cls {

// public static void main(String args[]){
//     Student s1 = new Student();
//     s1.name="Rafiq";
//     s1.age = 23;
//     s1.city = "dhaka";

//     Student s2 = new Student();
//     s2.name="Safiq";
//     s2.age = 22;
//     s2.city = "Uttara";

//     s1.Info();
//     s2.Info();
// }
// }

class Student{
    String name;
    int age;

    public void info(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(String name,int age){
        this.name = name;
        this.age=age;
    }

}

public class Cls {
    public static void main(String args[]){
    Student s1=new Student("rock", 25);
    Student s2=new Student("sami", 125);
    Student s3=new Student("tuki", 34);
    Student s4=new Student("rk", 9);

    s1.info();
    s2.info();
    s3.info();
    s4.info();
    }

}