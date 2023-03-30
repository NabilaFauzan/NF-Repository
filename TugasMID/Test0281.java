//Nabila Fauzan 13020210281

public class Test0281{
    public static void main(String[] args){
        // TODO Auto-generated method stub
        Balok balok1 = new Balok(); //(a)buat instansi objek bernama balok1 dari Class Balok() →default const.
        Balok balok2 = new Balok(20, 35, 15); //(b)buat instansi objek bernama balok2 dari Class Balok(20,35, 15)→param const.
        balok1.setL(5); //(c)setter → set nilai l = 5 dari konstruktor Balok()
        balok2.setP(25); //(d)setter → set nilai p = 25 dari konstruktor Balok()
        balok2.setT(10); //(e)setter → set nilai t = 10 dari konstruktor Balok(20,35, 15)
        balok1.info(); //(f)panggil method info dari konstruktor Balok ()
        balok2.info(); //(g)panggil method info dari konstruktor Balok(20,35, 15)
    }
}

//class Balok
class Balok extends PersegiPanjang{
    int t;

    public Balok(){
        super(); //(h) berisi nilai panjang & lebar yang diperoleh dari konstruktor superclass PersegiPanjang serta tinggi=15
        t = 15;
    }

    public Balok(int p, int l, int t){
        super(p, l); //(i) berisi nilai pada saat runtime p p, l=l dari konstruktor superclass PersegiPanjang
        this.t = t;
    }

    //(j) buat getter setter class balok
    public int getT(){
        return t;
    }

    public void setT(int t){
        this.t =t;
    }

    public int volume(){
        //(k) fungsi untuk menghitung volume balok : p x l x t
        return getP() * getL() * t;
    }

    public void info(){
        //(l)fungsi untuk tampil nilai panjang, lebar, tinggi,Luas, dan volume balok
        System.out.println("Nilai Panjang: " + getP());
        System.out.println("Nilai Lebar: " + getL());
        System.out.println("Nilai Tinggi: " + t);
        System.out.println("Nilai Volume: " + volume());
    }
}

// class PersegiPanjang
class PersegiPanjang{
    int p, l;

    public PersegiPanjang(){
        //(m) berisi nilai panjang=30 & lebar=20
        p = 30;
        l = 20;
    }

    public PersegiPanjang(int p, int l){
        //(n) berisi nilai pada saat runtime p p, l=l
        this.p = p;
        this.l = l;
    }

    //(o) buat getter setter class Persegi Panjang
    public int getP(){
        return p;
    }

    public void setP(int p){
        this.p=p;
    }

    public int getL(){
        return l;
    }

    public void setL(int l){
        this.l = l;
    }
}