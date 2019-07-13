package futest;

import java.io.*;

/**
 * Created by 羊 on 2019/5/14.
 */
public class zijieliu {
    public static void copyFile(String src, String dist) throws IOException {
        FileInputStream in = new FileInputStream(src);
        FileOutputStream out = new FileOutputStream(dist);
        byte[] buffer = new byte[20 * 1024];
        int cnt;
        // read() 最多读取 buffer.length 个字节
        // 返回的是实际读取的个数
        // 返回 -1 的时候表示读到 eof，即文件尾
        while ((cnt = in.read(buffer, 0, buffer.length)) != -1) {
            out.write(buffer, 0, cnt);
        }
        in.close();
        out.close();
    }

    //input输入流测试
    public static void InputTest(){
        InputStream inputStream =null;
        try {
//            创建
            inputStream = new FileInputStream("C:\\Users\\lenovo\\Desktop\\nosql0514.txt");
            System.out.println(inputStream.read());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void DataInputTest(){
        DataInputStream data = null;
        DataOutputStream dos = null;
        try {
            //创
            data = new DataInputStream(new FileInputStream("C:\\Users\\lenovo\\Desktop\\TIM图片20190512225512.png"));
            dos = new DataOutputStream(new FileOutputStream("C:\\Users\\lenovo\\Desktop\\testtt.png"));
            //用
            int r;
            while((r = data.read())!= -1){
                dos.write(r);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                data.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    public static void bufferReaderTest(){
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("C:\\Users\\lenovo\\Desktop\\nosql0514.txt"));
            System.out.println(bufferedReader.readLine());
            bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\lenovo\\Desktop\\nosql0514-2.txt"));
            bufferedWriter.write("hello");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedReader.close();
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        bufferReaderTest();
    }
}
