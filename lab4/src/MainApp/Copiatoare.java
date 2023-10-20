package MainApp;

public class Copiatoare {
    private int p_ton;
    private String formatCopiere;

    public Copiatoare(int p_ton, String formatCopiere) {
        this.p_ton = p_ton;
        this.formatCopiere = formatCopiere;
    }

    public int getP_ton(){
        return p_ton;
    }

    public String getFormatCopiere(){
        return formatCopiere;
    }

    public void afisareCopiatoare()
    {
        System.out.println("Copiator");
    System.out.println("Pagini pe toner: " + p_ton);
    System.out.println("Format copiere: " + formatCopiere);
    }
}
