package readConfig;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public interface ConfigProvider {
    Config config = readConfig();
    static Config readConfig(){
        return ConfigFactory.systemProperties().hasPath("testProfile")
        ? ConfigFactory.load(ConfigFactory.systemProperties().getString("testProfile"))
        : ConfigFactory.load("application.conf");
    }
    String URL = readConfig().getString("url");
    String DEMO_LOGIN = readConfig().getString("usersParams.demo.login");
    String DEMO_PASSWORD = readConfig().getString("usersParams.demo.password");
    String false_DEMO_LOGIN = readConfig().getString("usersParams.falseDemo.login");
    String false_DEMO_PASSWORD = readConfig().getString("usersParams.falseDemo.password");
    String city1 = readConfig().getString("City.city_name1");
    String city2 = readConfig().getString("City.city_name2");
    String IdProduct = readConfig().getString("idProduct");
    String product = readConfig().getString("Product");

}




