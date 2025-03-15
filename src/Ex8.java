public class Ex8 {
    String Cristinel;
    String Cristinuta;

    public String loadTruckCristinel () {
        return "Camionul a fost incarcat cu pachete Cristinel";
    }

    public String loadTruckCristinuta () {
        return "Camionul a fost incarcat cu pachete Cristinuta";
    }

    public String unloadTruckCristinel (String b) {
        return "Camionul cu pachete Cristinel a fost descarcat in magazinul " + b;
    }

    public String unloadTruckCristinuta (String b) {
        return "Camionul cu pachete Cristinuta a fost descarcat in magazinul " + b;
    }

    public String arrivalTruck () {
        return "Camionul a ajuns in Chisinau";
    }

    public String toStringObject () {
        return toString();
    }

    public static void main(String[] args) {

        Ex8 Linella = new Ex8();
        Ex8 Metro = new Ex8();
        Ex8 Nr1 = new Ex8();
        Ex8 Truck = new Ex8();

        System.out.println(Truck.loadTruckCristinel());
        System.out.println(Truck.loadTruckCristinuta());

        System.out.println("");
        System.out.println(Truck.arrivalTruck());
        System.out.println("");

        System.out.println(Nr1.unloadTruckCristinel("Nr1"));
        System.out.println(Nr1.unloadTruckCristinuta("Nr1"));

        System.out.println("");

        System.out.println(Metro.unloadTruckCristinel("Metro"));
        System.out.println(Metro.unloadTruckCristinuta("Metro"));

        System.out.println("");

        System.out.println(Linella.unloadTruckCristinel("Linella"));
        System.out.println(Linella.unloadTruckCristinuta("Linella"));
    }
}