package redis;

/**
 * Created by 羊 on 2019/5/2.
 */
public class test {

//    public static final void main(String[] args) {
//        new Chapter01().run();
//    }
//
//    public void run() {
//        //1、初始化redis连接
//        Jedis conn = new Jedis("localhost");
//        conn.select(15);
//
//        //2、发布文章
//        String articleId = postArticle(
//                conn, "guoxiaoxu", "A title", "http://www.google.com");
//        System.out.println("我发布了一篇文章，id为：: " + articleId);
//        System.out.println("文章保存的散列格式如下：");
//        Map<String,String> articleData = conn.hgetAll("article:" + articleId);
//        for (Map.Entry<String,String> entry : articleData.entrySet()){
//            System.out.println("  " + entry.getKey() + ": " + entry.getValue());
//        }
//
//        System.out.println();
//        //2、测试文章的投票过程
//        articleVote(conn, "other_user", "article:" + articleId);
//        String votes = conn.hget("article:" + articleId, "votes");
//        System.out.println("我们为该文章投票，目前该文章的票数 " + votes);
//        assert Integer.parseInt(votes) > 1;
//        //3、测试文章的投票过程
//        articleOppose(conn, "other_user", "article:" + articleId);
//        String oppose = conn.hget("article:" + articleId, "votes");
//        System.out.println("我们为该文章投反对票，目前该文章的反对票数 " + oppose);
//        assert Integer.parseInt(oppose) > 1;
//
//        System.out.println("当前得分最高的文章是：");
//        List<Map<String,String>> articles = getArticles(conn, 1);
//        printArticles(articles);
//        assert articles.size() >= 1;
//
//        addGroups(conn, articleId, new String[]{"new-group"});
//        System.out.println("我们将文章推到新的群组，其他文章包括：");
//        articles = getGroupArticles(conn, "new-group", 1);
//        printArticles(articles);
//        assert articles.size() >= 1;
//    }



}
