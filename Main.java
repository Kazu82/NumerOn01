public class Main {
    public static void main(String[] args) {
        Scan scan1 = new Scan();
        scan1.numberScan();
        //↓入力ができているかの確認。後で削除。
        System.out.println(scan1.getNumberArr());

        Logic logic1 = new Logic();
        logic1.createThreeNumber();

        System.out.println(logic1.getThreeNumberArr());

        int i = logic1.biteCount(logic1.getThreeNumberArr(), scan1.getNumberArr());
        System.out.println(i);
        
        int j = logic1.eatCount(logic1.getThreeNumberArr(), scan1.getNumberArr());
        System.out.println(j);

        Print print1 = new Print();
        print1.printAnswer(logic1.getThreeNumberArr(), scan1.getNumberArr());
    }
}
