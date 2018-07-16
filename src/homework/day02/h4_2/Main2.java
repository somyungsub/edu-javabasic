package homework.day02.h4_2;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        System.out.print("크기를 입력하세요: ");
        int num1=num.nextInt();
        int[][] arr=new int[num1][num1];
        int i=0,j=0,sum=0;
        int temp;

        for(i=0;i<num1;i++)
        {
            for(j=0;j<num1;j++)
                arr[j][i]=++sum;
        }

        for(i=0;i<num1;i++)
        {
            for(j=0;j<num1/2;j++)
            {
                if(i%2==1)
                {
                    temp=arr[j][i];
                    arr[j][i]=arr[num1-j-1][i];
                    arr[num1-j-1][i]=temp;
                }
            }
        }

        for(i=0;i<num1;i++)
        {
            for(j=0;j<num1;j++)
                System.out.printf("%3d",arr[i][j]);
            System.out.print("\n");
        }
    }
}
