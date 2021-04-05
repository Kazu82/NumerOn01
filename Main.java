public class Main {
    public static void main(String[] args) {
        Scan scan1 = new Scan();
        scan1.numberScan();
        //↓入力ができているかの確認。後で削除。1234
        System.out.println(scan1.getNumberArr());

    }
}
