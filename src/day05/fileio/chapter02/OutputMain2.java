package day05.fileio.chapter02;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OutputMain2 {

    public static void main(String[] args) {
        /*
            문자열 저장 예제
         */
        OutputStream os = null; // 1바이트씩 쓰기 위한 통(Stream).
        Writer writer = null;   // 2바이트씩 쓰기 -> 한글안깨짐 기본적으로 OutputStream을 받아서 활용 해야합니다.

        try {
            os = new FileOutputStream(new File("src/day05/fileio/testOut.txt"));
            writer = new OutputStreamWriter(os);

            /*
                저장 데이터를 char[] 에서 String[]로 바꿨습니다. (문자열로 변경)
                - 즉 파일에서 읽어들인 정보가 문자열이면 문자열로 저장작업이 가능합니다.
                  ex) BufferedReader에서 readLine 메서드로 읽은 후 저장이 가능!
             */
            String[] str = {"abc한글은깨질까요\n"
                    , "abc한글은깨질까요2\n"
                    , "abc한글은깨질까요3\n"};

            // 파일쓰기
            for (String s : str) {
                writer.write(s);    // 데이터 저장하여 담아두기
            }
            writer.flush();         // writer는 flush를 해줘야 담아둔 데이터를 뿌립니다.
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }

    }
}
