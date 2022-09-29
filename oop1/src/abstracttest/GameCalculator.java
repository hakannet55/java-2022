package abstracttest;

// Abstract dogrudan new ile kullanılamaz
public abstract class GameCalculator {

    public abstract void welcomeMessage();

    public void hesap() {
        System.out.println("Puan: 100");
    }

    // final override etmesini engelle
    public final void gameOver() {
        System.out.println("Bitti");
    }
}
