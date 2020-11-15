package Level1;
import java.util.Scanner;

public class Level1Test {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            Couple couple = new Couple();
            Matrix mat = new Matrix();

            System.out.println("请输入累加的数：");
            int count = scan.nextInt();
            System.out.println( count+ "累加得：" + couple.count(count));

            System.out.println("请输入斐波拉契的第n项");
            int fb = scan.nextInt();
            System.out.println(couple.fb(fb));

            mat.ranks();
            System.out.println("请输入矩阵A(先行后列)：");
            int[][] detA = mat.matrix();
            mat.setDetA(detA);
            System.out.println("请输入矩阵B(先行后列)：");
            int[][] detB = mat.matrix();
            mat.setDetB(detB);

            //输出矩阵
            mat.multiplication();

        }

}
