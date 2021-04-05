import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Scan {

    private ArrayList<Integer> numberArr1 = new ArrayList<Integer>(); //入力された3桁の数字を格納するリスト

    public ArrayList<Integer> getNumberArr() {
        return this.numberArr1;
    }

    public void numberScan() {
        System.out.println("0~9のうち3つの数字を入力してください。");
        for(;;) {
            Scanner scanner = new Scanner(System.in);
            int int1 = scanner.nextInt();
            if(int1 < 1000 && int1 > 0) {
                Integer[] integer1 = new Integer[3]; //１，１０，１００の位の数字をそれぞれ配列に格納。
                integer1[0] = Integer.valueOf(int1 / 100);
                integer1[1] = Integer.valueOf(int1 % 100 / 10);
                integer1[2] = Integer.valueOf(int1 % 10);
                if(!(integer1[0].equals(integer1[1])) && !(integer1[0].equals(integer1[2])) && !(integer1[1].equals(integer1[2]))) {
                    ArrayList<Integer> numberArr2 = new ArrayList<Integer>(Arrays.asList(integer1));
                    for(int i = 0; i < 3; i++) {
                        numberArr1.add(i,numberArr2.get(i));
                    }
                    break;
                }
            }
            System.out.println("エラーです。もう一度入力してください。"); 
        }
    }    



}
