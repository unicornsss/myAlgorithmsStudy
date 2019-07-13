package futest.serialTest;

import java.io.*;

/**
 * Created by 羊 on 2019/5/16.
 */
public class testSerializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        serializablePerson();
        PersonSerial personSerial = DeserializePerson();
        System.out.println(personSerial);
    }

    public static void serializablePerson() throws IOException {
        PersonSerial personSerial = new PersonSerial();
        personSerial.setAge(18);
        personSerial.setName("xiaohong");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File("C:\\Users\\lenovo\\Desktop\\wordtest2.txt")));
        objectOutputStream.writeObject(personSerial);
        System.out.println("success");
        objectOutputStream.close();
    }

    public static PersonSerial DeserializePerson() throws IOException, ClassNotFoundException {

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(new File("C:\\Users\\lenovo\\Desktop\\wordtest2.txt")));
        PersonSerial pp = (PersonSerial) objectInputStream.readObject();
        System.out.println("re---success");
        return pp;
    }
}
