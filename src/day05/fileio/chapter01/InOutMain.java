package day05.fileio.chapter01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class InOutMain {

    public static void main(String[] args) {
        /*
            InputMain, OutputMain를 보신 다음 보시기 바랍니다.

            파일에 있는 정보를 읽은 후 지정한 경로에 파일 쓰기 예제
         */

        try {
            // 파일 읽기 위한 준비작업
            InputStream is = new FileInputStream(new File("src/day05/fileio/test.txt"));        // 읽어들일 파일 경로
            Reader reader = new InputStreamReader(is);

            // 파일 쓰기 위한 준비작업
            OutputStream os = new FileOutputStream(new File("src/day05/fileio/testOut.txt"));   // 쓰기 위한 파일경로
            Writer writer = new OutputStreamWriter(os);

            // 위 파일 쓰기 위한 준비작업 2줄을 1줄로 줄임. 나중에 Java가 조금씩 익숙해지시면 이런식으로 하셔야 합니다.
            // Writer writer = new OutputStreamWriter(new FileOutputStream(new File("src/day05/fileio/testOut.txt")));

            // 파일 쓰기 실행
            int i;
            while ((i = reader.read()) != -1) {
                writer.write(i);    // reader로 읽은 데이터 i를 writer에 저장해두기
            }
            writer.flush();         // writer는 flush를 해줘야 담아둔 데이터를 뿌립니다.
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }

    }
}
