public class BankAccount {
    public static void main(String[] args) {
        encap obj=new encap();
        obj.setter(5000);
       int k= obj.getter();
        System.out.println(k);
    }
    
}
class encap{
    private int balance;
    public void setter(int balance){
        this.balance=balance;
    }
    public int getter(){
        return balance;
    }
}
