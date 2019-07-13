package nosql;

import com.mongodb.*;
import com.mongodb.client.*;
import com.mongodb.client.model.Filters;
import com.mongodb.client.result.UpdateResult;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 羊 on 2019/5/23.
 */

public class mongoDBTest {
    public static void insertTest(MongoCollection<Document> collection){
        //包含 文档 数组 内嵌文档数组 String
        //学生选课 学生名字 选课的数组 课程学分的数组
        //内嵌文档
//        Document user = new Document("user","xxxx").append("age","18");
        //内嵌数组
        ArrayList<String> size = new ArrayList<>();
        size.add("S");
        size.add("M");
        size.add("L");
        Document buy1 = new Document("time","2017-11-03T00:00:00.000+00:00").append("num",100).append("price","600").append("name","wang");
        Document buy2 = new Document("time","2017-11-04T00:00:00.000+00:00").append("num",90).append("price","650").append("name","qz");
        ArrayList<Document> user = new ArrayList<Document>();
        user.add(buy1);
        user.add(buy2);
        Document producer = new Document("name","xx").append("area","shenzhen");
        Document document = new Document("name", "short").append("type", 10).append("size", size).append("buyer", user).append("producer",producer);
        collection.insertOne(document);
        System.out.println("文档单个插入成功");
    }

    public static void insertMany(MongoCollection<Document> collection){
        ArrayList<String> size = new ArrayList<>();
        size.add("M");
        size.add("L");
        Document buy1 = new Document("time","2017-09-03T00:00:00.000+00:00").append("num",120).append("price","350").append("name","pooo");
        Document buy2 = new Document("time","2017-10-04T00:00:00.000+00:00").append("num",80).append("price","300").append("name","wqq");
        Document buy3 = new Document("time","2017-12-14T00:00:00.000+00:00").append("num",90).append("price","275").append("name","zxxx");
        ArrayList<Document> user = new ArrayList<Document>();
        user.add(buy1);
        user.add(buy2);
        user.add(buy3);
        Document producer = new Document("name","xyyy").append("area","beijing");
        Document document = new Document("name", "coat").append("type", 7).append("size", size).append("buyer", user).append("producer",producer);
        ArrayList<String> size1 = new ArrayList<>();
        size1.add("S");
        size1.add("M");
        size1.add("L");
        Document buy11 = new Document("time","2017-11-03T00:00:00.000+00:00").append("num",130).append("price","400").append("name","wang");
        Document buy21 = new Document("time","2017-08-16T00:00:00.000+00:00").append("num",95).append("price","340").append("name","mlll");
        Document buy31 = new Document("time","2017-10-05T00:00:00.000+00:00").append("num",120).append("price","390").append("name","sily");
        ArrayList<Document> user1 = new ArrayList<Document>();
        user1.add(buy11);
        user1.add(buy21);
        user1.add(buy31);
        Document producer1 = new Document("name","okkk").append("area","guangzhou");
        Document document1 = new Document("name", "dress").append("type", 15).append("size", size1).append("buyer", user1).append("producer",producer1);
        ArrayList<String> size2 = new ArrayList<>();
        size2.add("S");
        size2.add("M");
        size2.add("L");
        size2.add("XL");
        Document buy12 = new Document("time","2017-11-03T00:00:00.000+00:00").append("num",110).append("price","100").append("name","weee");
        Document buy22 = new Document("time","2018-01-04T00:00:00.000+00:00").append("num",150).append("price","90").append("name","zaaa");
        ArrayList<Document> user2 = new ArrayList<Document>();
        user2.add(buy12);
        user2.add(buy22);
        Document producer2 = new Document("name","xx").append("area","guangzhou");
        Document document2 = new Document("name", "TShirt").append("type", 12).append("size", size2).append("buyer", user2).append("producer",producer2);
        List<Document> documents = new ArrayList<Document>();
        documents.add(document);
        documents.add(document1);
        documents.add(document2);
        collection.insertMany(documents);
        System.out.println("多个文档插入成功");
    }

    public static void insertMany1(MongoCollection<Document> collection){
        ArrayList<String> size = new ArrayList<>();
        size.add("M");
        size.add("L");
        Document buy1 = new Document("time","2017-09-03T00:00:00.000+00:00").append("num",120).append("price","350").append("name","pooo");
        Document buy2 = new Document("time","2017-10-04T00:00:00.000+00:00").append("num",80).append("price","300").append("name","wqq");
        ArrayList<Document> user = new ArrayList<Document>();
        user.add(buy1);
        user.add(buy2);
        Document producer = new Document("name","xiaozhao").append("area","shanghai");
        Document document = new Document("name", "trousers").append("type", 8).append("size", size).append("buyer", user).append("producer",producer);
        ArrayList<String> size1 = new ArrayList<>();
        size1.add("S");
        size1.add("M");
        size1.add("L");
        Document buy11 = new Document("time","2017-11-03T00:00:00.000+00:00").append("num",130).append("price","400").append("name","wang");
        Document buy21 = new Document("time","2017-08-16T00:00:00.000+00:00").append("num",95).append("price","340").append("name","mlll");
        ArrayList<Document> user1 = new ArrayList<Document>();
        user1.add(buy11);
        user1.add(buy21);
        Document producer1 = new Document("name","xiekkk").append("area","shanghai");
        Document document1 = new Document("name", "suit").append("type", 9).append("size", size1).append("buyer", user1).append("producer",producer1);
        ArrayList<String> size2 = new ArrayList<>();
        size2.add("S");
        size2.add("M");
        size2.add("L");
        size2.add("XL");
        Document buy12 = new Document("time","2017-11-03T00:00:00.000+00:00").append("num",110).append("price","100").append("name","weee");
        Document buy22 = new Document("time","2018-01-04T00:00:00.000+00:00").append("num",150).append("price","90").append("name","zaaa");
        ArrayList<Document> user2 = new ArrayList<Document>();
        user2.add(buy12);
        user2.add(buy22);
        Document producer2 = new Document("name","liummm").append("area","guangzhou");
        Document document2 = new Document("name", "tunic").append("type", 5).append("size", size2).append("buyer", user2).append("producer",producer2);
        ArrayList<String> size4 = new ArrayList<>();
        size4.add("M");
        size4.add("L");
        Document buy41 = new Document("time","2017-09-03T00:00:00.000+00:00").append("num",120).append("price","350").append("name","pooo");
        ArrayList<Document> user4 = new ArrayList<Document>();
        user4.add(buy41);
        Document producer4 = new Document("name","chenxiao").append("area","beijing");
        Document document4 = new Document("name", "sleepcoat").append("type", 8).append("size", size4).append("buyer", user4).append("producer",producer4);
        List<Document> documents = new ArrayList<Document>();
        documents.add(document);
        documents.add(document1);
        documents.add(document2);
        documents.add(document4);
        collection.insertMany(documents);
        System.out.println("多个文档插入成功");
    }

    public static void updateTest(MongoCollection<Document> collection){
        //更新文档
        Document document = new Document("name","dress");
        FindIterable<Document> findIterable = collection.find(document);
        MongoCursor<Document> mongoCursor = findIterable.iterator();
        System.out.println("更改前");
        while(mongoCursor.hasNext()){
            System.out.println(mongoCursor.next());
        }
        System.out.println("更改内容");
//        collection.updateMany(Filters.eq("size", "S"), new Document("$set",new Document("size","XS")));
        collection.updateOne(document,new Document("$set",new Document("type",10)));
        //检索查看结果
        System.out.println("更改后");
        FindIterable<Document> find = collection.find(document);
        MongoCursor<Document> mongoCursor1 = find.iterator();
        while(mongoCursor1.hasNext()){
            System.out.println(mongoCursor1.next());
        }
    }

    public static void updateArray(MongoCollection<Document> collection){
        //添加内嵌数组
        Document document = new Document("name","dress");
        collection.updateOne(document,new Document("$push",new Document("size","XL")));
        //添加内嵌多个数组
        ArrayList<String> add = new ArrayList<>();
        add.add("XL");
        add.add("XXL");
        Document document1 = new Document("name","coat");
        collection.updateOne(document1,new Document("$push",new Document("size",new Document("$each",add))));
        System.out.println("更改后");
        FindIterable<Document> find = collection.find(document);
        MongoCursor<Document> mongoCursor1 = find.iterator();
        while(mongoCursor1.hasNext()){
            System.out.println(mongoCursor1.next());
        }
        FindIterable<Document> find1 = collection.find(document1);
        MongoCursor<Document> mongoCursor12 = find1.iterator();
        while(mongoCursor12.hasNext()){
            System.out.println(mongoCursor12.next());
        }
    }

    public static void updateDocument(MongoCollection<Document> collection){
        Document x = new Document("name","dress");
        Document document1  = collection.find(x ).first();
        System.out.println(document1);
        Document y = new Document("$set",new Document("producer.name","robinLi"));
        collection.updateOne(x,y);
        System.out.println("更改后");
        Document document2  = collection.find(x).first();
        System.out.println(document2);
    }

    public static void updateMany(MongoCollection<Document> collection){
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        Document document = new Document("name","dress");
        Document get = collection.find(document).first();
        System.out.println(get);
        UpdateResult updateResult = collection.updateOne(document, new Document("$inc", new Document("type", -1)));
        Document get1 = collection.find(document).first();
        System.out.println(get1);
        //更改多个
        System.out.println("更改多个");
        FindIterable<Document> find = collection.find();
        MongoCursor<Document> mongoCursor = find.iterator();
        while(mongoCursor.hasNext()){
            System.out.println(mongoCursor.next());
        }
        UpdateResult updateResult1 = collection.updateMany(new Document(), new Document("$inc", new Document("type", 10)));
        System.out.println(updateResult+"updateResult");
        System.out.println("更改后");
        FindIterable<Document> find1 = collection.find();
        MongoCursor<Document> mongoCursor1 = find1.iterator();
        while(mongoCursor1.hasNext()){
            System.out.println(mongoCursor1.next());
        }
    }

    /**
     * 1. 获取迭代器FindIterable<Document>
     * 2. 获取游标MongoCursor<Document>
     * 3. 通过游标遍历检索出的文档集合
     * */
    public static void findAll(MongoCollection<Document> collection){
        //检索所有文档
        System.out.println("查询所有结果");
        FindIterable<Document> findIterable = collection.find();
        MongoCursor<Document> mongoCursor = findIterable.iterator();
        while(mongoCursor.hasNext()){
            System.out.println(mongoCursor.next());
        }
    }

    public static void selectTest(MongoCollection<Document> collection){
        Document document1 = new Document("name","coat");
        FindIterable findIterable1 = collection.find(document1);
        FindIterable<Document> find2 = collection.find(new Document("type",new Document("$gt",20)));
//        System.out.println("name,coat结果");
        for (Object o : findIterable1) {
            System.out.println(o);
        }
        System.out.println("type gt 20 结果");
        for (Object o : find2) {
            System.out.println(o);
        }
        System.out.println("and type,10+ size,S 结果" );
        FindIterable<Document> find3 = collection.find(Filters.and(Filters.eq("size", "S"), Filters.gt("type", 10)));
        for (Document document : find3) {
            System.out.println(document);
        }
        System.out.println("or  producer.area shenzhen + size S 结果");
        FindIterable<Document> find5 = collection.find(Filters.or(Filters.lt("type", 10), Filters.eq("producer.area", "beijing")));
        for (Document document : find5) {
            System.out.println(document);
        }
    }

    public static void selectcount(MongoCollection<Document> collection,String name,int set){
//        从MongoDB中获取文档，检索特定文档，并计算文档数。
        FindIterable<Document> find = collection.find(new Document("type",new Document(name,set)));
        int count = 0;
        for (Document document : find) {
            System.out.println(document);
            count++;
        }
        System.out.println("type："+name+set+"返回结果"+count);
    }

    public static void resultTest(MongoCollection<Document> collection,int limit,int sort,String sortname){
//        限制结果集大小、返回的字段，并将结果集分页及排序
//        sort({KEY:1}) 1 升序 -1 降序 .limit(1) skip()偏移
        FindIterable<Document> find = collection.find(new Document("size", "M"))
                .projection(new Document().append("_id", 0).append("producer", 1).append("name", 1).append("size",1)).
                        limit(limit).skip(1).sort(new Document(sortname,sort));
        for (Document document : find) {
            System.out.println(document);
        }
        System.out.println("个数限制"+limit+"排序名字"+sortname+"排序顺序"+sort+"跳过1");
    }
    public static void deleteTest(MongoCollection<Document> collection){
        System.out.println("删除前数据"+ (int) collection.count());
        collection.deleteOne(new Document("name","short"));
        int x = (int) collection.count();
        System.out.println("\"name\",\"short\"删除后数据"+ x );
        collection.deleteMany(new Document("producer.area", "shanghai"));
        int y = (int) collection.count();
        System.out.println("\"producer.area, \"shanghai\"删除后数据"+y);
    }

    public static void mapreduceTest(MongoCollection<Document> collection){
        String map = "function(){\n" +
                "emit({type:this.type,\n" +
                "},{count:1}\n" +
                ");\n" +
                "};\n";
        String reduce = "function(key,value){\n" +
                "var ret = {count:0};\n" +
                "value.forEach(function(v) {ret.count++;});"+
                "return ret;\n" +
                "};";
        System.out.println("==========");
        MapReduceIterable<Document> get = collection.mapReduce(map, reduce);
        for (Document document : get) {
            System.out.println(document);
        }
    }

    public static void map1(MongoCollection<Document> collection){
        String map = "function() { "+
                "var category; " +
                "if ( this.type >= 19 ) "+
                "category = 'Big type'; " +
                "else " +
                "category = 'Small type'; "+
                "emit(category, {name: this.name});}";

        String reduce = "function(key, values) { " +
                "var sum = 0; " +
                "values.forEach(function(doc) { " +
                "sum += 1; "+
                "}); " +
                "return {testsum: sum};} ";

        System.out.println("==========");
        MapReduceIterable<Document> get = collection.mapReduce(map, reduce);
        for (Document document : get) {
            System.out.println(document);
        }
    }

    public static void aggregate(MongoCollection<Document> collection){
        Document sub_match = new Document();
//        sub_match.put("appId", app_id);
        sub_match.put("type", new Document("$gt", 8).append("$lt", 21));

        FindIterable<Document> get= collection.find(sub_match);
        for (Document document : get) {
            System.out.println(document);
        }
        Document sub_group = new Document();
        sub_group.put("_id", "$size");
        sub_group.put("count", new Document("$sum", 1));
        Document match = new Document("$match", sub_match);
        Document group = new Document("$group", sub_group);
        Document sort = new Document("$sort", new Document("_id", 1));
        List<Document> aggregateList = new ArrayList<Document>();
        aggregateList.add(match);
        aggregateList.add(group);
        aggregateList.add(sort);
        AggregateIterable<Document> resultset = collection.aggregate(aggregateList);
        for (Document document : resultset) {
            System.out.println(document);
        }
    }

    public static void main(String[] args) {
        try{
            // 连接到 mongodb 服务
            MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
            // 连接到数据库
            MongoDatabase mongoDatabase = mongoClient.getDatabase("test");
            System.out.println("Connect to database successfully");
            System.out.println("集合创建成功");
            MongoCollection<Document> collection = mongoDatabase.getCollection("testcloth");
            System.out.println("集合 testcloth 选择成功");
//            int x = (int) collection.count();
            //插入
            insertTest(collection);
            insertMany(collection);
            insertMany1(collection);
            //查找
            findAll(collection);
            //查找
            selectTest(collection);
            //从MongoDB中获取文档，检索特定文档，并计算文档数。
            selectcount(collection,"$gt",10);
            //更改
            updateTest(collection);
            //更改数组
            updateArray(collection);
            //更改内嵌文档
            updateDocument(collection);
            //更改多个 数量加）
            updateMany(collection);
            //参数为取得的个数和排序的顺序 name producer.name
            resultTest(collection,3,-1,"name");
            //mapreduce操作
            mapreduceTest(collection);
            map1(collection);
            //聚合
            aggregate(collection);
            //删除
            deleteTest(collection);
        }catch(Exception e){
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
        }
    }
}
