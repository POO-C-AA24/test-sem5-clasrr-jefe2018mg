import java.util.Scanner;
public class varriante1 {
    public static void main (String[]args){
        Scanner tc =new Scanner(System.in);
        Terreno arrayTerrenos[]=new Terreno[2];
        int i=0;
        String opc;
        while(true){
            System.out.println("Dame alto,ancho,vmc: ");
            arrayTerrenos[i]=new Terreno(tc.nextDouble(),tc.nextDouble(),tc.nextDouble());
            arrayTerrenos[i].calcularArea();
            arrayTerrenos[i].calcularCostoFinal();
            System.out.println(arrayTerrenos[i]);
            i++;
            System.out.println("Desea mas terreno (S/N)?: ");
            opc=tc.next();
            if(opc.equals("N")||(i>=arrayTerrenos.length))break;
        }
        System.out.println("Los terrenos igresados y calculardos son: ");
        for(Terreno terr:arrayTerrenos){
            terr.calcularArea();terr.calcularCostoFinal();
            System.out.println(terr);
        }
    }
}
