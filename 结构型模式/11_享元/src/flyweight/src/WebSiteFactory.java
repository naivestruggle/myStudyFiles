import java.util.HashMap;

/**
 * 网站工厂类
 * 更据需求，返回一个具体的网站
 */
public class WebSiteFactory {
    /**
     * 集合，充当网站池
     */
    private HashMap<String,ConcreteWebSite> pool = new HashMap<>();

    /**
     * 更据网站的类型，返回一个网站，如果没有就创建一个网站，并放入到池中，并返回
     */
    public WebSite getWebSiteCategory(String type){
        if(!pool.containsKey(type)){
            //池中没有， 就创建一个放入池中
            pool.put(type,new ConcreteWebSite(type));
        }

        return pool.get(type);
    }

    /**
     * 获取网站分类的总数（池中有多少个网站类型）
     * @return
     */
    public int getWebSiteCount(){
        return pool.size();
    }
}
