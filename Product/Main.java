package Product;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//generate objects
       Movie m1=new Movie("moon12",35,"Ali") ;
       Movie m2=new Movie("The End",120,"join") ;
        System.out.println("Movie Discount");
        System.out.println("m1:"+m1.getDiscount());
        System.out.println("m2:"+m2.getDiscount());

        Book b1=new Book("Programing",70,"sam") ;
        System.out.println("b1:"+b1.getDiscount());

    }
}