package futest;

import java.io.File;

/**
 * Created by 羊 on 2019/5/13.
 */
public class IO_file {
    public static int ListAllFile(File dir){
        int i = 0;
        if(dir ==  null || !dir.exists()){
            return i;
        }
        if(dir.isFile()){
            System.out.println(dir.getName());
            i = i+1;
            return i;
        }
        for (File file : dir.listFiles()) {
            int x = ListAllFile(file);
            i = x+i;
        }
        return i;
    }

    public static void getMenu(File file){
        String[] FileNames = file.list();
        for (String fileName : FileNames) {
            System.out.println(fileName);
        }
    }

    public static void main(String[] args) {
        File path = new File("D:\\1各种课件\\自助");
//        System.out.println(ListAllFile(path));
        getMenu(path);
    }
}
