public class Balok extends PersegiPanjang {

    double tb;
    private double vol;

    public Balok(double p, double l){
        super(p, l);
    }

    @Override
    double luasPersegiPanjang(){
        return large;
    }

    double vol (double ht){
        this.tb = ht;
        vol = luasPersegiPanjang() * tb;
        return vol;
    }
}
