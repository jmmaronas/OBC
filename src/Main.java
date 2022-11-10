public class Main {
    public static void main(String[] args) {
        System.out.println(suma(2, 4, 6));
        Coche myCoche = new Coche();
        myCoche.incremento();
        System.out.println(myCoche.numeroPuertas);
    }

    public static int suma(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
}

    class Coche {
        int numeroPuertas = 4;

        public void incremento() {
            this.numeroPuertas ++;
        }


    }
