public class Ex12 {
    private String nume = "Samaleot";
    private String prenume = "Jora";
    private String salariu = "2000 euro";

    public String getSalariu() {
        return salariu;
    }

    public String getPrenume() {
        return prenume;
    }

    public String getNume() {
        return nume;
    }
}
class FakeID extends Ex12 { //clasa FakeID mosteneste metodele din superclasa Ex12

    public String setNume(String nume) {
        return nume;
    }

    public String setPrenume(String prenume) {
        return prenume;
    }

    public String setSalariu(String salariu) {
        return salariu;
    }


    public static void main(String[] args) {
        FakeID ex12 = new FakeID(); //apelam constructorul din clasa FakeID

        System.out.println(ex12.getNume());
        System.out.println(ex12.getPrenume());
        System.out.println(ex12.getSalariu());

        System.out.println("");

        System.out.println(ex12.setNume("Dwayne"));
        System.out.println(ex12.setPrenume("Johnson"));
        System.out.println(ex12.setSalariu("5000 euro"));
    }
}