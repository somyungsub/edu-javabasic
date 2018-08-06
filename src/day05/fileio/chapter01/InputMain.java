package day05.fileio.chapter01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputMain {
    public static void main(String[] args) {
        /*
            파일입출력
            - 파일 입출력은 가장 많이 활용되며 시스템 흐름이나 프로그래밍을 하셔야 할 때 기본적으로 아셔야합니다.
            - 핵심개념과 사용법을 익혀두시기 바랍니다.
            - FIle IO에서 쓰이는 클래스는 내부적으로 Exception을 발생시켜 안정성을 확보하고 있습니다.
            - 예외가 발생 할 경우 어떤 작업이 잘못되어 있기 때문이므로 이제부터는 예외를 잘 분석하실 줄도 아셔야 합니다!
         */


        InputStream is = null;  // InputStream은 1바이트씩 읽어 들이기 위한 통(Stream).  -> 1바이트씩 읽기 때문에 한글의 경우 깨짐
        Reader reader = null;   // Reader는 2바이트씩 읽어 들이기 위한 통.               -> 2바이트씩 읽기 때문에 한글의 경우 안깨짐
        try {

            // 파일하나를 생성하여(new File) Stream에 전달하고 통을 만듬
            is = new FileInputStream(new File("src/day05/fileio/test.txt"));    // File에 매개변수는 파일 경로명
            /*
                Reader는 InputStream에 있는 정보를 다시 2바이트로 재 정의해서 사용하는데 이때 매개변수로 InputStream이 필요합니다
                - 이유는 기본적으로 Stream(통)이 생성되어야 Stream을 통해 읽어 들일 수 있기 때문입니다.
                - 기본구조를 잊지마세요. 파일읽기나 쓰기를 하려면 Stream이란 통이 필요합니다.
             */
            reader = new InputStreamReader(is); // InputStream을 매개변수로 전달하여 재해석 후 Reader 반환


            // 읽은데이터를 저장하기 위한 임시 변수
            int i = 0;
            /*
                is.read()가 -1인경우 더이상 읽을게 없다는 것을 의미
                - is는 1바이트씩 읽기 때문에 한글이 깨집니다.
             */
//            while ((i = is.read()) != -1) { // read메서드로 읽은 후 i에 저장 하여 반환 값이 -1이 아닐때 까지 실행
//                System.out.print((char)i);
//            }

            /*
                reader.read()가 -1인경우 더이상 읽을게 없다는 것을 의미
                - reader는 2바이트씩 읽기 때문에 한글이 안꺠집니다.
                - 위 while문이 주석이 안된 경우 stream은 읽기를 끝낸 상태여서 아래 while문은 안 읽힙니다.
                  따라서 위에 while문 주석 후 실행.
             */
            while ((i = reader.read()) != -1) {
                System.out.print((char)i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();    // new FileInputStream 때문에 생기는 Exception입니다
        } catch (IOException e) {
            e.printStackTrace();    // is.read(), reader.read() 즉, read 메서드 때문에 발생하는 Exception, 다중catch라 합니다.
        }

    }
}
