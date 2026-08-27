public class classes {
   public static class student{
     int ROLLNO;
     String Name;
     int Marks;
     String Grade;
     student(int roll,String name,int marks){
        this.ROLLNO=roll;
        this.Name=name;
        this.Marks=marks;
     }
     student(int roll,String name){
        this.ROLLNO=roll;
        this.Name=name;
     }
     student(int roll,String name,String grade){
        this.ROLLNO=roll;
        this.Name=name;
        this.Grade=grade;
     }

    }
    public static void main(String[] args) {
        student s1= new student(1," paglu1", 0);
        student s2= new student(2,"paglu2");
        student s3= new student(3, "paglu3", "A");
        
        System.out.println(s1.Name);
        System.out.println(s2.ROLLNO);
        System.out.println(s3.Grade);

       
        
    }
}
