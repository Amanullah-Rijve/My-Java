// class defiend
class Student{
    int rollno;
    String name;
    int marks;

    // shows information fo student
    public void displayInfo(){
        System.out.println(this.rollno);
        System.out.println(this.name);
        System.out.println(this.marks);
    }

    // pass or fail statement
    public void issPass(){
        if(marks >=39){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }
    }

    //default constructor 
    Student(){
        this.rollno=0;
        this.name = "Unknown";
        this.marks=0;
    }

    // parameteries constructor
    Student(int rollno,String name,int marks){
        this.rollno=rollno;
        this.name=name;
        this.marks=marks;
    }

}

// main class
public class Practice {
    public static void main(String args[]){
        // createing object
        Student s0= new Student()  ;  
        Student s1=new Student(21, "Rafi", 38);
        Student s2=new Student(01, "safi", 98);
    
        // calling all object values
        s0.displayInfo();
        s0.issPass();
    
        s1.displayInfo();
        s1.issPass();
    
        s2.displayInfo();
        s2.issPass();
    }
}
