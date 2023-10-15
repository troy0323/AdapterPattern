


public class ApplianceApp {



    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        Refrigerator refrigerator = new Refrigerator();
        SmartphoneCharger charger = new SmartphoneCharger();
        LaptopAdapter laptopAdapter = new LaptopAdapter(laptop);
        RefrigeratorAdapter refrigeratorAdapter = new RefrigeratorAdapter(refrigerator);
        SmartphoneAdapter chargerAdapter = new SmartphoneAdapter(charger);
        System.out.println();
        System.out.println(laptopAdapter.plugIn());
        System.out.println(refrigeratorAdapter.plugIn());
        System.out.println(chargerAdapter.plugIn());
    }
}
