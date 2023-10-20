package MainApp;

public class Imprimante {
    private int ppm;
    private int dpi;
    private int p_car;
    private String modTiparire;

    public Imprimante(int ppm, int dpi, int p_car, String modTiparire) {
        this.ppm = ppm;
        this.dpi = dpi;
        this.p_car = p_car;
        this.modTiparire = modTiparire;
    }
     public int getppm(){
         return ppm;
     }

     public int getDpi(){
        return dpi;
     }

     public int p_car(){
        return p_car;
     }

     public String getModTiparire(){
        return modTiparire;
     }

    public void afisareImprimanta() {
        System.out.println("Imprimanta:");
        System.out.println("Pagini pe minut : " + ppm);
        System.out.println("Rezoluție : " + dpi);
        System.out.println("Pagini per cartus: " + p_car);
        System.out.println("Mod de tiparire: " + modTiparire);
    }
}
