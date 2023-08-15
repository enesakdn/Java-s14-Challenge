public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;


    public HealthyBurger(String name, String meat, double price) {
        super(name, meat, price);

    }

    public void addHealthyAddition1(String Name,double Price ) {
        this.healthyExtra1Name = Name;
        this.healthyExtra1Price = Price;
    }
    public void addHamburgerAddition2( String Name,double Price) {
        this.healthyExtra2Name = Name;
        this.healthyExtra2Price = Price;
    }
    public void itemizeHamburger(){
        System.out.println("Malzemeler: " +
                this.healthyExtra1Name+ " " + this.healthyExtra2Name +
                " Toplam Fiyat: " + ( + this.healthyExtra1Price +
                this.healthyExtra2Price));
    }





}
