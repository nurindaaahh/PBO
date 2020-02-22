public class PersegiPanjang {

    private double pDbl, lDbl;
    //private int pInt, lInt;
    static double large;

    PersegiPanjang(double p, double l){
        this.pDbl = p;
        this.lDbl = l;
    }

    double luasPersegiPanjang (){
        this.large = pDbl * lDbl;
        return large;
    }

    void vol (){
        System.out.println("Volume Berbeda beda");
    }
}
