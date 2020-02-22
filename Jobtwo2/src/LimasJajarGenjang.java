public class LimasJajarGenjang extends JajarGenjang {
    double tli;
    private double vol;

    public LimasJajarGenjang(double a, double h){
        super (a, h);
    }

    @Override
    double luasJajarGenjang(){
        return large;
    }

    double vol (double ht){
        this.tli = ht;
        vol = 1.0/3.0 * luasJajarGenjang() * tli;
        return vol;
    }
}
