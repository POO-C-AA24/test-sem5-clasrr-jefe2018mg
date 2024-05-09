
public class testTerreno1 {
    public static void main (String[]args){
        Terreno arrayTerreno[]={new Terreno(10,3,2),new Terreno(10,3,2),new Terreno(10,3,2)};
        for(Terreno terr:arrayTerreno){
            terr.calcularArea();
            terr.calcularCostoFinal();
            System.out.println(terr);
        }
    }
}
