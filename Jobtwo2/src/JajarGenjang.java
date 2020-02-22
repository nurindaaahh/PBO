public class JajarGenjang {
    private double aDbl, hDbl;
    static double large;

    JajarGenjang(double a, double h){
        this.aDbl = a;
        this.hDbl = h;
    }

    double luasJajarGenjang (){
        this.large = aDbl * hDbl;
        return large;
    }

    void vol (){
        System.out.println("Volume Berdeda beda");
    }
}
