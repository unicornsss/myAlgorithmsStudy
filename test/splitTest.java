package test;

/**
 * Created by 羊 on 2019/4/21.
 */
public class splitTest {
    public static void main(String[] args) {
//        String str = "20111230000005\t66c5bb7774e31d0a22278249b26bc83a\t凡人修仙传\t3\t1\thttp://www.booksky.org/BookDetail.aspx?BookID=1050804&Level=1";
//        156 个分隔
//        private TreeMap<Double, Text> repToRecordMap = new TreeMap<Double, Text>();

        String str="ORDER_13098828\tUSER_4614\t2013-04-21\tHOTEL_131862\tBASIC_471559\tROOM_192690913\t11\t13\t200.0\tzz3497.0\t61.0\t61.0\t2\t0\t2\t4\t0\t0\t0\t5\t0\tNULL\t460.0\t0\t0\t0\t-6194.4\t5.4\t8.0\t7.8\t10.8\t302.8\t0.0\t0.0\t0.0\t0.2\t0.0\t0.2\t0.8\t0.7\t0.1\t0.2\t0.0\t2702.0\t2172.2856\t2238.5\t214.0625\t2360.25\t0.0\t0.3\tNULL\tNULL\tNULL\tNULL\tNULL\tNULL\tNULL\tNULL\tNULL\t0.0\t0.0\t1.0\t145.01666\t320\t2.6808004\t2238.5\t3176.0\t1790.0\tNULL\tNULL\t202.0\t1.0\tNULL\t0.8\t0.9\t0.9\tNULL\tNULL\t0.3\tNULL\tNULL\tNULL\t0.9\t0.8\tNULL\t0.5\tNULL\tNULL\tNULL\tNULL\tNULL\tNULL\tNULL\tNULL\tNULL\tNULL\tNULL\tNULL\tNULL\tNULL\tNULL\tNULL\tNULL\tNULL\tNULL\tNULL\tNULL\tNULL\tNULL\tNULL\tNULL\tNULL\tNULL\tNULL\tNULL\tNULL\tNULL\tNULL\tNULL\tNULL\tNULL\tNULL\tNULL\tNULL\tNULL\tNULL\tNULL\t0.013274336\t0.025236594\t0.11630667\t0.0854583\t1.086256\t0.015161958\t1.3692569\tNULL\tNULL\tNULL\tNULL\tNULL\tNULL\tNULL\tNULL\tNULL\tNULL\tNULL\tNULL\tNULL\tNULL\tNULL\tNULL\tNULL\tNULL\tNULL\tNULL\tNULL\tNULL\n";
//        String str="orderid\tuid\torderdate\thotelid\tbasicroomid\troomid\tstar\trank\treturnvalue\tprice_deduct\tbasic_minarea\tbasic_maxarea\troomservice_1\troomservice_2\troomservice_3\troomservice_4\troomservice_5\troomservice_6\troomservice_7\troomservice_8\troomtag_1\troomtag_2\troomtag_3\troomtag_4\troomtag_5\troomtag_6\tuser_confirmtime\tuser_avgadvanceddate\tuser_avgstar\tuser_avggoldstar\tuser_avgrecommendlevel\tuser_avgroomnum\tordertype_1_ratio\tordertype_2_ratio\tordertype_3_ratio\tordertype_4_ratio\tordertype_5_ratio\tordertype_6_ratio\tordertype_7_ratio\tordertype_8_ratio\tordertype_9_ratio\tordertype_10_ratio\tordertype_11_ratio\tuser_avgdealpriceholiday\tuser_avgdealpriceworkday\tuser_avgdealprice\tuser_avgpromotion\tuser_avgprice_star\torderbehavior_1_ratio\torderbehavior_2_ratio\torderbehavior_3_ratio_1week\torderbehavior_4_ratio_1week\torderbehavior_5_ratio_1week\torderbehavior_3_ratio_1month\torderbehavior_4_ratio_1month\torderbehavior_5_ratio_1month\torderbehavior_3_ratio_3month\torderbehavior_4_ratio_3month\torderbehavior_5_ratio_3month\torderbehavior_6_ratio\torderbehavior_7_ratio\torderbehavior_8\torderbehavior_9\tuser_ordernum\tuser_activation\tuser_avgprice\tuser_maxprice\tuser_minprice\tuser_stdprice\tuser_cvprice\tuser_citynum\tuser_avgroomarea\tuser_roomservice_4_0ratio\tuser_roomservice_4_2ratio\tuser_roomservice_4_3ratio\tuser_roomservice_4_4ratio\tuser_roomservice_4_1ratio\tuser_roomservice_4_5ratio\tuser_roomservice_3_123ratio\tuser_roomservice_6_2ratio\tuser_roomservice_6_1ratio\tuser_roomservice_6_0ratio\tuser_roomservice_5_1ratio\tuser_roomservice_7_0ratio\tuser_roomservice_2_1ratio\tuser_roomservice_8_1ratio\tuser_rank_ratio\tuser_roomservice_5_345ratio\tuser_ordnum_1week\tuser_avgprice_1week\tuser_medprice_1week\tuser_minprice_1week\tuser_maxprice_1week\tuser_roomservice_3_123ratio_1week\tuser_roomservice_7_1ratio_1week\tuser_roomservice_7_0ratio_1week\tuser_roomservice_4_5ratio_1week\tuser_roomservice_4_4ratio_1week\tuser_roomservice_4_2ratio_1week\tuser_roomservice_4_3ratio_1week\tuser_roomservice_4_0ratio_1week\tuser_ordnum_1month\tuser_avgprice_1month\tuser_medprice_1month\tuser_minprice_1month\tuser_maxprice_1month\tuser_roomservice_3_123ratio_1month\tuser_roomservice_7_1ratio_1month\tuser_roomservice_7_0ratio_1month\tuser_roomservice_4_5ratio_1month\tuser_roomservice_4_4ratio_1month\tuser_roomservice_4_2ratio_1month\tuser_roomservice_4_3ratio_1month\tuser_roomservice_4_0ratio_1month\tuser_ordnum_3month\tuser_avgprice_3month\tuser_medprice_3month\tuser_minprice_3month\tuser_maxprice_3month\tuser_roomservice_3_123ratio_3month\tuser_roomservice_7_1ratio_3month\tuser_roomservice_7_0ratio_3month\tuser_roomservice_4_5ratio_3month\tuser_roomservice_4_4ratio_3month\tuser_roomservice_4_2ratio_3month\tuser_roomservice_4_3ratio_3month\tuser_roomservice_4_0ratio_3month\tbasic_week_ordernum_ratio\tbasic_recent3_ordernum_ratio\tbasic_comment_ratio\tbasic_30days_ordnumratio\tbasic_30days_realratio\troom_30days_ordnumratio\troom_30days_realratio\torderid_lastord\torderdate_lastord\thotelid_lastord\troomid_lastord\tbasicroomid_lastord\trank_lastord\treturn_lastord\tprice_last_lastord\troomservice_2_lastord\troomservice_3_lastord\troomservice_4_lastord\troomservice_5_lastord\troomservice_6_lastord\troomservice_8_lastord\troomtag_2_lastord\troomtag_3_lastord\troomtag_4_lastord\troomtag_5_lastord\troomtag_6_lastord\tstar_lastord\thotel_minprice_lastord\tbasic_minprice_lastord\n";
        String [] data = str.split("\t");
        try {
            double get = Double.valueOf(data[9]);
            System.out.println("get+"+get);

        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException"+e);
        }
//        int x = 0;
//        for(String ss : data){
//            System.out.println(ss);
////            x++;
//        }
//        if(data[9].matches("\\d+")){
//            System.out.println("data[9]"+data[9]);
//        }

        System.out.println(data[9]);
        System.out.println("x==="+data.length);
//        System.out.println("data[5]===+"+data[5]);
//        StringTokenizer tokenizer = new StringTokenizer(data[5]);
//        while (tokenizer.hasMoreTokens()) {
//            // Clean up the words
//            String cleanWord = tokenizer.nextToken().replaceAll("'", "").replaceAll("[^a-zA-Z]", " ");
//            // If the word is in the filter, output it and break
//            if (cleanWord.length() > 0 ) {
//                System.out.println("cleanWord+"+cleanWord);
////                context.write(value, NullWritable.get());
////                break;
//            }
//        }
    }
}
