package test;

/**
 * Created by 羊 on 2019/4/22.
 */
public class bloomTest {
    public static void main(String[] args) throws Exception {
        BloomFilter filter =new BloomFilter(10,0.1);
//        int ip = filter.getIpAddress();

        int key = 6;
        filter.add(1);
        filter.add(3);
        filter.add(6);
//        然后你就可以检查这个条目是否已经加入：

        if (filter.contains(3)) {
            throw new Exception("IP is blacklisted");
        }
//        BloomFilter filter =new BloomFilter(10,2,1); // 过滤器长度为10 ，用2哈希函数，MURMUR_HASH (1)
//        Key  key  =new Key("hadoop".getBytes());
//        filter.add(key);
//        Key hb  = new Key("hbase".getBytes());
//        boolean has  =filter.membershipTest(key);
//        System.out.println(has);
//        System.out.println(filter.membershipTest(hb));
    }
}
