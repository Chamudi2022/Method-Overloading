public class MethodOverloading{
    void display(int a,double b){
        System.out.println("Method 1");

    }
    void display(int a,double b, double c){
        System.out.println("Method 2");
    }
    public static void main(String[] args) {
     MethodOverloading mol = new MethodOverloading();
     mol.display(4,2.5);
     mol.display(40,50.2,7.5);
    }

}
