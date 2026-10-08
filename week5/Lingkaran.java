public class Lingkaran extends Bentuk {
    protected double radius;

    public Lingkaran(double radius, String warna){
        super(warna);
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double r){
        this.radius = r;
    }

    public double hitungLuas(){
        return Math.PI * radius * radius;
    }
    @Override 
    public void printInfo(){
        System.out.println("Lingkaran berwarna " + warna + ", luas = " + hitungLuas());
    }
}
