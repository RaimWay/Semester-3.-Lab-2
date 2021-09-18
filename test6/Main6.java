package test6;

public class Main6 {
    public static void main(String[] args) {
        NetworkInfo obj = create("A5B4C3D2", "WannaPass?", "classic");
        obj.showParameters();
    }

    static class NetworkInfo {
        private String ssid;
        private String passwd;
        private String securityType;

        public void showParameters(){
            System.out.print("Current ssid: ");
            System.out.println(this.ssid);
            System.out.print("Current passwd: ");
            System.out.println(this.passwd);
            System.out.print("Current securityType: ");
            System.out.println(this.securityType);
        }
    }

    public static NetworkInfo create(String ssid, String passwd, String securityType){
        NetworkInfo s = new NetworkInfo();
        s.ssid = ssid;
        s.passwd = passwd;
        s.securityType = securityType;

        return s;
    }
}