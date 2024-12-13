package Inner3;

public class RAM implements Bilgisayar{
    @Override
    public void ekle() {
        System.out.println("RAM eklendi.");
    }

    @Override
    public void çıkar() {
        System.out.println("RAM cıkarıldı.");
    }

    @Override
    public void tamiret() {
        System.out.println("RAM tamir edildi.");

    }
}
