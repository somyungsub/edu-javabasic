package day05.fileio.chapter01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OutputMain {

    public static void main(String[] args) {
        /*
            OutputStream
            - InputStream의 반대개념 입니다. 즉, 쓰기 입니다.
         */
        OutputStream os = null; // 1바이트씩 쓰기 위한 통(Stream).
        Writer writer = null;   // 2바이트씩 쓰기 -> 한글안깨짐 기본적으로 OutputStream을 받아서 활용 해야합니다.

        try {
            os = new FileOutputStream(new File("src/day05/fileio/testOut.txt"));
            char[] ch = {'a', 'b', 'c', '한', '글', '은', '깨', '질', '까', '요'};
            /*
                OutputStream은 1바이트씩 읽기 때문에 바래 아래 for문을 쓰면 한글이 깨집니다.
                - 실행 후 생성된 testOut.txt 확인
                - 만약 경로에 testOut.txt 파일이 없으면 생성 후 쓰기를 실행합니다. 파일이 있다면 덮어쓰기를 합니다.
             */
//            for (char c : ch) {
//                os.write(c);    // 바로바로 Stream을 통해 쓰기
//                try {
//                    Thread.sleep(2000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }

            /*
                Writer역시 Reader와 마찬가지로 2바이트를 다루고 있기 때문에 쓰기경우에도 한글이 깨지지 않습니다.
                - 위에 for문을 주석처리 후 아래 writer부터 주석을 해제 후 실행 해보시면 확인이 가능합니다.
             */
            writer = new OutputStreamWriter(os);
            for (char c : ch) {
                writer.write(c);    // 데이터 저장하여 담아두기
                try {
                    Thread.sleep(2000); // 2초간 정지
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            writer.flush();         // writer는 flush를 해줘야 담아둔 데이터를 뿌립니다.
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 사용한 자원 반납(닫기를 통한 자원 종료)
            try {
                os.close();     // 원래는 InputStream에서도 사용한 Stream은 닫아주어야합니다.
                writer.close(); // 원래는 Reader에서도 사용한 Reader는 닫아주어야합니다.
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
