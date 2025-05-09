class encap {
private int a;
public void setrupees(int a){
    this.a=a;
}
    public int getrupees(){
        return a;
    }
}
class Main{
    public static void main(String[] args) {
     encap obj=new encap();
     obj.setrupees(500);
     int k=obj.getrupees();
     System.out.println(k);

    }
}