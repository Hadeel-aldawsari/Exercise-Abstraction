package Product;

public class Movie extends Product{
    private String director;

    Movie(){

    }


    public Movie(String name, double price, String director) {
        super(name, price);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public double getDiscount() {
         if(director.equals("join"))return super.getPrice()*0.4;
        return super.getPrice()*0.5;
    }
}
