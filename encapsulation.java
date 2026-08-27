 class student{
        String Name;
        int Marks;
        student(String name,int marks){
            this.Name=name;
            this.Marks=marks;
        }
    void display2(){
        System.out.println("1st function");
    }
}
class paglu extends student{
    paglu(String name,int marks){
        super(name, marks);
    }
    void display3(){
        super.display2();
    }

}
public class encapsulation {
    
public static void main(String[] args) {
       paglu s1=new paglu("safsad",130);
        s1.display3();
    } 
}

