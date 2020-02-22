public class LimasPersegiPanjang extends PersegiPanjang {
    double tl;
    private double vol;

    public LimasPersegiPanjang(double p, double l){
        super(p, l);
    }

    @Override
    double luasPersegiPanjang() {
        return large;
    }

    double vol (double ht){
      this.tl = ht;
      vol = 1.0/3.0 * luasPersegiPanjang() * tl;
      return vol;
    }
}
