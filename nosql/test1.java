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


public class test1 {
    public static void insertTest(MongoCollection<Document> collection){
        //包含 文档 数组 内嵌文档数组 String
        //学生选课 学生名字 选课的数组 课程学分的数组
        //
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
        Document document = new Document("name", "short").append("type", 10).
                append("size", size).append("buyer", user).append("producer",producer);
        collection.insertOne(document);
//        List<Document> documents = new ArrayList<Document>();
//        documents.add(document);
//        collection.insertMany(documents);
        System.out.println("文档单个插入成功");

//        ArrayList<Document> ar = new ArrayList<Document>();
//        Document record1 = new Document(“userId”, “123”).
//                append(“status”,”0”).
//                append(“miles”,”100”);
//        Document record2 = new Document(“userId”, “1234”).
//                append(“status”,”0”).
//                append(“miles”,”200”);
//        ar.add(record1);
//        ar.add(record2);
//        Document document = new Document(“_id”,”321”).
//                append(“record”, ar);
//        Bcollection.insertOne(document);
////添加了一个_id为321, record为ar数组的记录
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
        Document document = new Document("name", "coat").append("type", 7).
                append("size", size).append("buyer", user).append("producer",producer);
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
        Document document1 = new Document("name", "dress").append("type", 15).
                append("size", size1).append("buyer", user1).append("producer",producer1);

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
        Document document2 = new Document("name", "TShirt").append("type", 12).
                append("size", size2).append("buyer", user2).append("producer",producer2);
//        collection.insertOne(document);

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
        Document document = new Document("name", "trousers").append("type", 8).
                append("size", size).append("buyer", user).append("producer",producer);

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
        Document document1 = new Document("name", "suit").append("type", 9).
                append("size", size1).append("buyer", user1).append("producer",producer1);

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
        Document document2 = new Document("name", "tunic").append("type", 5).
                append("size", size2).append("buyer", user2).append("producer",producer2);

        ArrayList<String> size4 = new ArrayList<>();
        size4.add("M");
        size4.add("L");
        Document buy41 = new Document("time","2017-09-03T00:00:00.000+00:00").append("num",120).append("price","350").append("name","pooo");
        ArrayList<Document> user4 = new ArrayList<Document>();
        user4.add(buy41);
//        user4.add(buy2);
        Document producer4 = new Document("name","chenxiao").append("area","beijing");
        Document document4 = new Document("name", "sleepcoat").append("type", 8).
                append("size", size4).append("buyer", user4).append("producer",producer4);

//        ArrayList<String> size5 = new ArrayList<>();
//        size1.add("S");
//        size1.add("M");
//        size1.add("L");
//        Document buy5 = new Document("time","2017-11-03T00:00:00.000+00:00").append("num",130).append("price","400").append("name","wang");
//        ArrayList<Document> user5 = new ArrayList<Document>();
//        user5.add(buy5);
//        Document producer5 = new Document("name","xiekkk").append("area","shanghai");
//        Document document5 = new Document("name", "suit").append("type", 12).
//                append("size", size1).append("buyer", user5).append("producer",producer5);
//
//        ArrayList<String> size6 = new ArrayList<>();
//        size6.add("S");
//        size6.add("M");
//
//        Document buy61 = new Document("time","2017-11-03T00:00:00.000+00:00").append("num",110).append("price","100").append("name","weee");
//        Document buy62 = new Document("time","2018-01-04T00:00:00.000+00:00").append("num",150).append("price","90").append("name","zaaa");
//        ArrayList<Document> user6 = new ArrayList<Document>();
//        user6.add(buy61);
//        user6.add(buy62);
//        Document producer6 = new Document("name","liummm").append("area","guangzhou");
//        Document document6 = new Document("name", "tunic").append("type", 13).
//                append("size", size6).append("buyer", user6).append("producer",producer6);


        List<Document> documents = new ArrayList<Document>();
        documents.add(document);
        documents.add(document1);
        documents.add(document2);
//        documents.add(document3);
        documents.add(document4);
        collection.insertMany(documents);
        System.out.println("多个文档插入成功");
    }

    public static void updateTest(MongoCollection<Document> collection){
        //更新文档
        FindIterable<Document> findIterable = collection.find();
        MongoCursor<Document> mongoCursor = findIterable.iterator();
        System.out.println("更改前");
        while(mongoCursor.hasNext()){
            System.out.println(mongoCursor.next());
        }
//        collection.updateMany(Filters.eq("size", "S"), new Document("$set",new Document("size","XS")));
        collection.updateOne(new Document("name","dress"),new Document("$set",new Document("type",10)));
        //检索查看结果
        System.out.println("更改后");
        FindIterable<Document> find = collection.find();
        MongoCursor<Document> mongoCursor1 = find.iterator();
        while(mongoCursor1.hasNext()){
            System.out.println(mongoCursor1.next());
        }
    }

    public static void updateArray(MongoCollection<Document> collection){
        //添加内嵌数组
        collection.updateOne(new Document("name","dress"),new Document("$push",new Document("size","XL")));
//      添加内嵌多个数组
        ArrayList<String> add = new ArrayList<>();
        add.add("XL");
        add.add("XXL");
        collection.updateOne(new Document("name","coat"),new Document("$push",new Document("size",new Document("$each",add))));
        System.out.println("更改后");
        FindIterable<Document> find = collection.find();
        MongoCursor<Document> mongoCursor1 = find.iterator();
        while(mongoCursor1.hasNext()){
            System.out.println(mongoCursor1.next());
        }
    }
//    public static void updateArray(MongoCollection<Document> collection){
//        Document y2= new Document("_id","123");
//        Document d = collection.find(y2).first();
//        ArrayList<Document> ar=(ArrayList<Document>)(d.get("his_Record"));
//        Document newrecord = new Document("bikeId","456").append("status", "0");
//        ar.add(0, newrecord);
//        Document y3 = new Document("his_Record",ar);
//        collection.updateOne(y2, new Document("$set",y3));
//    }
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

    public static void findAll(MongoCollection<Document> collection){
        //检索所有文档
        /**
         * 1. 获取迭代器FindIterable<Document>
         * 2. 获取游标MongoCursor<Document>
         * 3. 通过游标遍历检索出的文档集合
         * */
        FindIterable<Document> findIterable = collection.find();
        MongoCursor<Document> mongoCursor = findIterable.iterator();
        while(mongoCursor.hasNext()){
            System.out.println(mongoCursor.next());
        }
    }

    public static void selectTest(MongoCollection<Document> collection){
//        db.user.find({"name":"yuanhao"})
        Document document1 = new Document("name","coat");
        FindIterable findIterable1 = collection.find(document1);
        for (Object o : findIterable1) {
            System.out.println(o);
        }
        System.out.println("type gt 20");
        FindIterable<Document> find2 = collection.find(new Document("type",new Document("$gt",20)));
        for (Object o : find2) {
            System.out.println(o);
        }
        System.out.println("and type,10+ size,S");
//        ArrayList<Document> doList = new ArrayList<Document>();
//        doList.add(new Document("size","S"));
//        doList.add(new Document("producer.area","shenzhen"));
//        FindIterable<Document> find3 = collection.find(new Document("$and",doList));
        FindIterable<Document> find3 = collection.find(Filters.and(Filters.eq("size","S"),Filters.gt("type",10)));
        for (Document document : find3) {
            System.out.println(document);
        }

        System.out.println("or  producer.area shenzhen + size S");
        FindIterable<Document> find5 = collection.find(Filters.or(Filters.lt("type", 10), Filters.eq("producer.area", "beijing")));
        for (Document document : find5) {
            System.out.println(document);
        }

//        collection.find(Filters.and(Filters.gte("stars", 2), lt("stars", 5), eq("categories", "Bakery")))
//                .sort(Sorts.ascending("name"))
//                .projection(fields(include("name", "stars", "categories"), excludeId()))
//                .forEach(printBlock);
    }

    public static void selectcount(MongoCollection<Document> collection,String name,int set){
//        从MongoDB中获取文档，检索特定文档，并计算文档数。
//        db.user.count({'age':{"$gt":30}})
//        db.user.find({
//                "hobbies":{"$all":["dancing","tea"]}})
//        FindIterable<Document> find3
//        int res = (int) collection.count(new Document("type",new Document(name,set)));
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
//        db.COLLECTION_NAME.find().sort({KEY:1}) 1 升序 -1 降序 .limit(1) skip()偏移
//        .append("stars", 1)
//                .append("categories",1)
//                .append("_id", 0))
        FindIterable<Document> find = collection.find(new Document("size", "M"))
                .projection(new Document().append("_id", 0).append("producer", 1).append("name", 1).append("size",1)).
                        limit(limit).skip(1).sort(new Document(sortname,sort));
//                        limit(4).skip(1).sort(new Document("name",-1));
        for (Document document : find) {
            System.out.println(document);
        }
    }
    public static void deleteTest(MongoCollection<Document> collection){
        System.out.println("删除前数据"+ (int) collection.count());
        collection.deleteOne(new Document("name","short"));
        int x = (int) collection.count();
        System.out.println("删除后数据"+ x );
        collection.deleteMany(new Document("producer.area", "shanghai"));
        int y = (int) collection.count();
        System.out.println("删除后数据"+y);
    }

    public static void mapreduceTest(MongoCollection<Document> collection){
        String map = "function(){\n" +
//                "emit({count:this.count,\n" +
                "emit({type:this.type,\n" +
//                "name:this.name,\n" +
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

//        DBObject query = new BasicDBObject();
//        MapReduceCommand cmd = new MapReduceCommand(collection, map, reduce, "monthstat", MapReduceCommand.OutputType.INLINE, null);
//        MapReduceCommand cmd = new MapReduceCommand(books, map, reduce,
//                null, MapReduceCommand.OutputType.INLINE, null);

//        MapReduceOutput out = books.mapReduce(cmd);
//        collection.mapReduce(cmd);
//                "ret.count++;\n" +
//        String map1 = "function(){emit(this.type,1);}";
//        String reduce1 = "function(key,value){\n" +
//                "            var x = 0;\n" +
//                "            value.forEach(function(v){x+=v});\n" +
//                "            return x;\n" +
//                "        }";

//        m = function(){emit(this.age,1);}
//        r = function(key,value){
//            var x = 0;
//            value.forEach(function(v){x+=v});
//            return x;
//        }

//        Document document = new Document();
//        System.out.println(get);

//        MapReduceCommand cmd = new MapReduceCommand(collection, map, reduce,"testout", MapReduceCommand.OutputType.INLINE, null);
//        MapReduceCommand testout = new MapReduceCommand(collection, map, reduce,"testout", REDUCE, null);
//        MapReduceOutput out = collection.mapReduce(cmd);
//        MapReduceCommand.OutputType type

//        collection.run
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
    public static void map2(DBCollection dbCollection){
//        String map = "function(){\n" +
////                "emit({count:this.count,\n" +
//                "emit({type:this.type,\n" +
////                "name:this.name,\n" +
//                "},{count:1}\n" +
//                ");\n" +
//                "};\n";
//        String reduce = "function(key,value){\n" +
//                "var ret = {count:0};\n" +
//                "value.forEach(function(v) {ret.count++;});"+
//                "return ret;\n" +
//                "};";
        String map = "function() { "+
                "var category; " +
                "if ( this.type >= 250 ) "+
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
        DBObject query = new BasicDBObject();
        MapReduceCommand cmd = new MapReduceCommand(dbCollection, map, reduce, "monthstat", MapReduceCommand.OutputType.INLINE , null);
        MapReduceOutput out = dbCollection.mapReduce(cmd);
        for (DBObject o : out.results()) {
            System.out.println(o.toString());
        }
    }

    public static void aggregate(MongoCollection<Document> collection){
        Document sub_match = new Document();
//        sub_match.put("appId", app_id);
        sub_match.put("type", new Document("$gt", 8).append("$lt", 20));

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
//        JSONObject ret_obj = new JSONObject();
        AggregateIterable<Document> resultset = collection.aggregate(aggregateList);
//        MongoCursor<Document> cursor = resultset.iterator();
        for (Document document : resultset) {
            System.out.println(document);
        }
    }
//    public static void test(MongoCollection<Document> collection){
//        //and、or多条件联合查询
////age条件(and条件)
//        BasicDBList condList = new BasicDBList();
//        BasicDBObject cond = new BasicDBObject();
//        cond.put("$gt",0);
//        cond.put("$lte",40);
//        BasicDBObject composeCod = new BasicDBObject();
//        composeCod.put("age", cond);
//        condList.add(composeCod);
//
////name条件
//        BasicDBObject nameCond = new BasicDBObject();
//        nameCond.put("name", "name");
//        condList.add(nameCond);
//
////查询条件组合（or条件）
//        BasicDBObject searchCond = new BasicDBObject();
//        searchCond.put("$or", condList);
//
//        FindIterable<Document> findRefResult = collection.find(searchCond);
//        int i=1;
//        while (findRefResult.hasNext()) {
//            System.out.println("Inserted Document: "+i);
//            System.out.println(findRefResult.next());
//            i++;
//        }
//
////排序操作
//
//        DBCursor cursor = collection.find(filter_dbobject).limit(10).sort(new BasicDBObject("create_time",-1));
//    }
    public static void main(String[] args) {
        try{
            // 连接到 mongodb 服务
            MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
            // 连接到数据库
            MongoDatabase mongoDatabase = mongoClient.getDatabase("test");
            System.out.println("Connect to database successfully");
//            System.out.println("Connect to database successfully");
//            mongoDatabase.createCollection("test2");
//            System.out.println("集合创建成功");
            MongoCollection<Document> collection = mongoDatabase.getCollection("test0523");
            System.out.println("集合 test0523 选择成功");
//            int x = (int) collection.count();
            //插入
//            insertTest(collection);
//            insertMany(collection);
//            insertMany1(collection);
//            查找
//            findAll(collection);

//            更改
//            updateTest(collection);
            //更改数组
//            updateArray(collection);
            //更改内嵌文档
//            updateDocument(collection);
            //更改多个 数量加）
//            updateMany(collection);
            //查找
//            selectTest(collection);
//            selectcount(collection,"$gt",10);
            //参数为取得的个数和排序的顺序 name producer.name
//            resultTest(collection,3,-1,"name");
//            mapreduceTest(collection);
//            map1(collection);
//          聚合
            aggregate(collection);

//            deleteTest(collection);
//            DBCollection newtest = (DBCollection) mongoDatabase.getCollection("test0523");
//            map2(newtest);
        }catch(Exception e){
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
        }
    }
}
