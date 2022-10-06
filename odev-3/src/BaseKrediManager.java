import com.sun.jdi.Value;

public class BaseKrediManager {
    public double oran=1.18;
    public String currency="TL";

    public String hesapla(double tutar){
        return render(tutar * this.oran);
    }

    public String render(double val){
        return String.valueOf(val + currency);
    }

    public String getFaizOran(){
        return String.valueOf(this.oran);
    }

}
