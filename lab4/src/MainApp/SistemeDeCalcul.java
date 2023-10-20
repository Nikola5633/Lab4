package MainApp;

public class SistemeDeCalcul {
    private String tipMonitor;
    private String vitProc;
    private int cHDD;
    private String sistemOperare;

    public SistemeDeCalcul(String tipMonitor, String vitProc, int cHDD, String sistemOperare) {
        this.tipMonitor = tipMonitor;
        this.vitProc = vitProc;
        this.cHDD = cHDD;
        this.sistemOperare = sistemOperare;
    }

    public String getTipMonitor(){
        return tipMonitor;
    }
    public String getVitProc(){
        return vitProc;
    }
    public int getcHDD(){
        return cHDD;
    }
    public String getSistemOperare(){
        return sistemOperare;
    }
    public void afisareSisteme(){
        System.out.println();
        System.out.println("Tip monitor: " + tipMonitor);
        System.out.println("Viteza procesor: "+vitProc);
        System.out.println("Capacitate hdd: " +cHDD);
        System.out.println("Sistem de operare: "+sistemOperare);
    }
}
