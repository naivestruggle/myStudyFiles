/**
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        //创建一个工厂类
        WebSiteFactory webSiteFactory = new WebSiteFactory();

        //客户要一个以新闻形式发布的网站
        WebSite news = webSiteFactory.getWebSiteCategory("新闻");
        news.use(new User("tom"));

        //客户要一个以博客形式发布的网站
        WebSite blog = webSiteFactory.getWebSiteCategory("博客");
        blog.use(new User("jack"));

        WebSite news2 = webSiteFactory.getWebSiteCategory("新闻");
        news2.use(new User("tomcat"));

        System.out.println("网站共有："+webSiteFactory.getWebSiteCount()+"个");
    }
}
