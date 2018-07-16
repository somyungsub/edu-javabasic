package homework.day02.h4_1;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        Random rand=new Random();
        System.out.print("크기를 입력하세요: ");
        int num1=num.nextInt();
        int[] arr=new int[num1];
        int i=0,j=0,count=0;

        System.out.println("배열생성중!!");
        for(i=0; i<arr.length;i++)
        {
            arr[i]=rand.nextInt(50)+1;

            while(true)
            {
                count=0;
                for(j=0;j<=i;j++)
                {
                    if(arr[i]==arr[j] && i!=j)
                    {

                        arr[i]=rand.nextInt(50)+1;

                    }
                }

                for(j=0;j<i;j++)
                {
                    if(arr[i]==arr[j])
                        count++;
                }
                if(count==0)
                    break;

            }
        }


        System.out.println("생성완료");
        System.out.println("최대값 최소값 구하기");
        for(i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+"  ");
        }
        int max,min;
        max=min=arr[0];

        for(i=0;i<arr.length; i++)
        {
            if(max<arr[i])
                max=arr[i];
        }
        for(i=0;i<arr.length;i++)
        {
            if(min>arr[i])
                min=arr[i];
        }
        System.out.print("\n최소값 : "+min+"  최대값 : "+max);
    }
}
