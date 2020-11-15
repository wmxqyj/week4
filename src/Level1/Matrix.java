package Level1;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix extends Level1Test{
    private int row;
    private int[][] detA,detB,detC;

    public void setRow(int row) {
        this.row = row;
    }

    //输入矩阵的行和列的长度
    public void ranks(){
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入矩阵的行列数：");
        setRow(scan.nextInt());
    }

    //将数字读入矩阵中
    public int[][] matrix(){
        Scanner scan = new Scanner(System.in);
        int[][] det = new int[row][row];
        for (int i = 0;i < row;i++){
            for(int j = 0;j <row;j++){
                //取1-100的整数
                det[i][j] = scan.nextInt();
            }
            System.out.println(Arrays.toString(det[i]));
        }
        return det;
    }

    public void setDetA(int[][] d){
        detA = d;
    }
    public void setDetB(int[][] d){
        detB = d;
    }
    public void multiplication(){
        //矩阵相乘
        int sum = 0;
        detC = new int[row][row];
        for(int i = 0;i < row;i++){
            for(int j = 0;j < row;j++){
                for(int k = 0;k < row;k++){
                    sum += detA[i][k] * detB[k][j];
                }
                detC[i][j] = sum;
            }
        }


        //输出相乘后的矩阵
        System.out.println("相乘后的对称矩阵：");
        for(int i = 0;i < row;i++) {
            System.out.println(Arrays.toString(detC[i]));
        }

        //对角线之和
        int  diagonal = 0;
        for(int i = 0;i < row;i++){
            diagonal += detC[i][i];
        }
        System.out.println("此矩阵对角线的和为："+ diagonal);

    }


}
