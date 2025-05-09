public class encap1 {
    public static void main(String[] args) {
        Student obj=new Student();
        obj.set("SAMBHAV",99);
        obj.get();
        obj.deatils();
    
    
    }
    
}
class Student{
    private String name;
    private int marks;
    public void set(String name,int marks){
    this.marks=marks;
    this.name=name;
}
public void get(){
    System.out.println("name="+name +" "+"marks=" + marks);
   
}
public void deatils(){
    System.out.println("FULL NAME = SAMBHAV TIWARI  "+"ROLLNO.=0246CS231180  "+"AGE=99");
}
}