package day05.fileio.chapter02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputMain2 {
    public static void main(String[] args) {
        /*
            자주쓰이는 BufferedReader
            - BufferedReader는 readLine이란 메서드를 통해 한글자가 아닌 한줄씩 통으로 읽어 들입니다.
              readLine은 반환자료형은 String입니다. 다음예제를 보시고 분석해보시기 바랍니다.

         */
        InputStream is = null;  // InputStream은 1바이트씩 읽어 들이기 위한 통.  -> 1바이트씩 읽기 때문에 한글의 경우 깨짐
        Reader reader = null;   // Reader는 2바이트씩 읽어 들이기 위한 통.       -> 2바이트씩 읽기 때문에 한글의 경우 안깨짐
        try {

            is = new FileInputStream(new File("src/day05/fileio/test.txt"));
            reader = new InputStreamReader(is);

            /*
                BufferedReader처럼 뒤에 Reader붙는 클래스들은
                Reader클래스의 보조개념으로 나오는 클래스 중 하나입니다. (Reader는 상위클래스)

                BufferedReader의 특징
                - 그냥 Reader는 한글자씩 읽었다면 BufferedReader는 한줄씩 읽는것이 가능 (readLine메서드)
                - 읽을 문장이 없는 경우 null을 반환
                - readLine메서드는 하위에만 존재하므로 while문에서 명시적형변환을 해서 사용하거나
                  자료형자체를 Reader가 아닌 BufferedReader로 선언해서 사용

                * BufferedReader 외에 많은 클래스가 용도별로 있습니다. 나머지 클래스는 차후 필요시 학습을 하시면 될 것같습니다.
                * 지금과 사용법은 별반 차이가 없으니 큰 어려움 없을겁니다.

             */
            Reader br = new BufferedReader(reader); // 다형성
//            BufferedReader br = new BufferedReader(reader);  // 이럴경우 아래 while문 조건식에서 br.readLine()로 바로 사용이 가능
            String str;
            while ((str = ((BufferedReader) br).readLine()) != null) {
                System.out.println(str);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
