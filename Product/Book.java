package Product;

public class Book extends Product {
    private String author;

    Book() {
    }

    public Book(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public double getDiscount() {
         return super.getPrice()*0.30;
    }

}
