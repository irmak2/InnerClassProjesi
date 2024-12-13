package Inner3;

public class Islemci implements Bilgisayar{
    @Override
    public void ekle() {
        System.out.println("islemci eklendi.");
    }

    @Override
    public void çıkar() {
        System.out.println("islemci çıkarıldı.");

    }

    @Override
    public void tamiret() {
        System.out.println("islemci tamir edildi.");

    }
}
