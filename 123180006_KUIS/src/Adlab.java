
public class Adlab extends Peserta implements Nilai{
    protected int jaringan;
    protected double rata;

    public Adlab(String Nama,int NIM,int tulis,int coding,int wawancara,int jaringan) {
        super(Nama, NIM, tulis, coding, wawancara);
        this.jaringan = jaringan;
        Nilai();
    }

    @Override
    public void Nilai() {
        rata = (super.coding + super.tulis + super.wawancara + jaringan)/4;
    }

}
