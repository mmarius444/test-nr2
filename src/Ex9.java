public class Ex9 {
    public int calcPerimeter(int a) {
        return a*4;
    }

    public static void main(String[] args) {
        Ex9 ex9 = new Ex9();

        System.out.println("Perimetrul unui patrulater cu latura de 8 cm este: " + ex9.calcPerimeter(8));
    }
}
