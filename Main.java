public class Main {
    public static void main(String[] args) {
        final int limitNumber = 10; //解答の回数制限
        int remain = limitNumber;

        System.out.println("---------------------------");
        System.out.println("----------NumerOn----------");
        System.out.println("---------------------------");
        System.out.println("");
        System.out.println("0から9の数字の内3つの数字を使って");
        System.out.println("3桁の番号を作成します。※同じ数字は一度しか使えません");
        System.out.println(remain + "回以内に番号を当ててください。");
        System.out.println("数字を入力した後、");
        System.out.println("EAT⇒数字と桁があっている、BITE⇒数字はあっているが桁はあっていない。");
        System.out.println("がコールされるので、コールをもとに番号を当ててください。");
        System.out.println("");
        System.out.println("-----NumerOn Start !!!-----");

        Logic logic1 = new Logic();
        Scan scan1 = new Scan();
        Print print1 = new Print();
       
        logic1.createThreeNumber(); //正解となる3桁の番号を作成。

        do{
            System.out.println("残りの入力可能回数は" + remain + "回です。");
            scan1.numberScan(); //キーボードから3桁の番号の入力を受け付ける。
            remain--;
            System.out.println("EAT: " + logic1.eatCount(logic1.getThreeNumberArr(), scan1.getNumberArr())); //EATのカウント
            System.out.println("BITE: " + logic1.biteCount(logic1.getThreeNumberArr(), scan1.getNumberArr())); //BITEのカウント
        } while(logic1.eatCount(logic1.getThreeNumberArr(), scan1.getNumberArr()) != 3 && remain > 0); //EATが3で正解が出た場合か、制限回数を超えたら終了。
        print1.printAnswer(remain, logic1.getThreeNumberArr(), scan1.getNumberArr()); //正解か不正解かによって別々のメッセージを出力。       
    }
}
