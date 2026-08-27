

public class classes1 {
    public static class Car{
        String Brand;
        int Year;

        Car(String brand,int year){
            this.Brand=brand;
            this.Year=year;
        }
    }
    public static void main(String[] args) {
        Car car=new Car("toyota", 2016);
        System.out.println(car.Brand);
        System.out.println(car.Year);
    }
}
