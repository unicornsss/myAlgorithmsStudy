package test;

/**
 * Created by 羊 on 2019/5/22.
 */
public class Stringtest1 {
    public static void main(String[] args) {
//        <row Id="2047" PostTypeId="2" ParentId="1535" CreationDate="2008-08-05T09:43:55.000" Score="12" Body="&lt;p&gt;This looks like an excellent opportunity to have a look at Aspect Oriented Programming. Here is a good article on &lt;a href=&quot;http://blogs.msdn.com/simonince/archive/2008/06/24/aspect-oriented-interception.aspx&quot; rel=&quot;noreferrer&quot;&gt;AOP in .NET&lt;/a&gt;. The general idea is that you'd extract the cross-functional concern (i.e. Retry for x hours) into a separate class and then you'd annotate any methods that need to modify their behaviour in that way. Here's how it might look (with a nice extension method on Int32)&lt;/p&gt;&#xA;&#xA;&lt;pre&gt;&lt;code&gt;[RetryFor( 10.Hours() )]&#xA;public void DeleteArchive()&#xA;{&#xA;  //.. code to just delete the archive&#xA;}&#xA;&lt;/code&gt;&lt;/pre&gt;&#xA;"
//        OwnerUserId="358" LastActivityDate="2008-08-05T09:43:55.000" CommentCount="0" />
//                Tags="&lt;c#&gt;&lt;asp.net-mvc&gt;&lt;visual-studio&gt;"
        String str="&lt;c#&gt;&lt;asp.net-mvc&gt;&lt;visual-studio&gt;";
        String[] tagTokens = str.split("&gt;&lt;");
        for (String tag : tagTokens) {
            String groomed = tag.replaceAll("&lt;|&gt;", "").toLowerCase();
            System.out.println(groomed);

        }
//        String groomed = tag.replaceAll(">|<", "").toLowerCase();
    }
}
