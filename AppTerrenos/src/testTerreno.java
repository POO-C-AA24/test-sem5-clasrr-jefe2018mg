
public class testTerreno {

    public static void main(String[] args) {
        Terreno t1 = new Terreno(40, 10, 2);
        Terreno t2 = new Terreno(21, 12, 2);
        Terreno t3 = new Terreno(10, 10, 2);
        /*
        t1.calcularArea();
        t1.calcularCostoFinal();
        System.out.println(t1);
        t2.calcularArea();
        t2.calcularCostoFinal();
        System.out.println(t2);
        t3.calcularArea();
        t3.calcularCostoFinal();
        System.out.println(t3);*/
        Terreno arrayTerreno[] = new Terreno[3];
        arrayTerreno[0] = t1;
        arrayTerreno[0] = t2;
        arrayTerreno[0] = t3;
        for (int i = 0; i < arrayTerreno.length; i++) {
            arrayTerreno[i].calcularArea();
            arrayTerreno[i].calcularCostoFinal();
            System.out.println(arrayTerreno[i]);
        }
    }

}
