package intro;

public class main {

    public static ServiceMth serviceMth;

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        startFunc();
        startFunc2();
    }

    public static void startFunc2() {
        UserModelCls[] userData = {new UserModelCls("name-1", 1), new UserModelCls("name-2", 2)};
        String message = "";
        UserDataModel tempVal;
        if (userData.length > 0) {
            for (UserModelCls userModelCls : userData) {
                if (userModelCls.getId() == 1) {
                    message += "v-" + userModelCls.getName();
                }
            }

        } else {
            message = "not found data";
        }
        print("message:");
        print(message);
    }

    public static void print(String message) {
        System.out.println(message);
    }

    public static void startFunc() {
        ServiceMth serviceMth = new ServiceMth();
        serviceMth.setName("t1");
        String val = serviceMth.getName();

        System.out.println("run1-" + val);
        int vade = 12;
        double ay = 12.4;

        double dolarDun = 18.5;
        double dolarBugun = 18.9;
        String ok = "";
        if (dolarBugun > dolarDun) {
            ok = "up.svg";
        } else if (dolarBugun < dolarDun) {
            ok = "down.svg";
        } else {
            ok = "none.svg";
        }
        System.out.println(ok);

        String[] krediler = {"kredi-1", "kredi-2", "kredi-3"};

        for (int i = 0; i < krediler.length; i++) {
            System.out.println(krediler[i]);
        }
    }

}
