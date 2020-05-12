
public class Aslab extends Peserta implements Nilai{

    protected int microteaching;
    protected double rata;

    public Aslab(String Nama,int NIM,int tulis,int coding,int wawancara,int microteaching) {
        super(Nama, NIM, tulis, coding, wawancara);
        this.microteaching = microteaching;
        Nilai();
    }

    @Override
    public void Nilai() {
        rata = (super.coding + super.tulis + super.wawancara + microteaching)/4;
    }
}