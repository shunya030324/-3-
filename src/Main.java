
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Main {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("田中");
        names.add("鈴木");
        names.add("山田");
        names.add("中田");
        names.add("山本");

        System.out.println(names.size());
        System.out.println(names.get(0));
        System.out.println(names.get(1));
        System.out.println(names.get(2));
        System.out.println(names.get(3));
        System.out.println(names.get(4));

        Map<String, String> userMap = new HashMap<>();
        userMap.put("山田", "２０歳");
        userMap.put("鈴木", "４０歳");
        userMap.put("山本", "５０歳");

        System.out.println(userMap.get("山田"));
        System.out.println(userMap.get("鈴木"));
        System.out.println(userMap.get("山本"));

        //Mapでキーに学生番号1〜１０、値に名前を入れる
        //１〜１０以外の数字を入力したら例外処理をする
        Map<Integer, String> studentMap = new HashMap<>();
        studentMap.put(1, "田中さん");
        studentMap.put(2, "鈴木さん");
        studentMap.put(3, "山田さん");
        studentMap.put(4, "中田さん");
        studentMap.put(5, "山本さん");
        studentMap.put(6, "田中さん");
        studentMap.put(7, "鈴木さん");
        studentMap.put(8, "山田さん");
        studentMap.put(9, "中田さん");
        studentMap.put(10, "山本さん");
        //キー1〜１０を繰り返し処理して、値を出力する
        int i = 0;
        while (i <= 10) {
            System.out.println(studentMap.get(i));
            i++;
        }
        //もし10以上の数値をgetしたら例外を発生させる
        if (studentMap.get(i) == null) {
            throw new IllegalArgumentException("10以上の数値を入力しないでください");
        }



    }
}
