public class KonutKrediManager extends BaseKrediManager {
    KonutKrediManager(){
        // set default oran
        this.oran = 1.55;
    }

    @Override
    public String hesapla(double tutar) {
        Utils.print("Konut Kredisi Hesaplandı: oran:"+ this.oran);
        return super.render(tutar * 1.25);
    }
}
