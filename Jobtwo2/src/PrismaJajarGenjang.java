public class PrismaJajarGenjang extends JajarGenjang {
    double tp;
    private double vol;

    public PrismaJajarGenjang(double a, double h){
        super(a, h);
    }

    @Override
    double luasJajarGenjang(){
        return large;
    }

    double vol (double ht){
        this.tp = ht;
        vol = luasJajarGenjang() * tp;
        return vol;
    }
}
