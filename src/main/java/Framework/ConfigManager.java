package Framework;

import Loggers.ILogger;
import org.apache.commons.configuration2.CompositeConfiguration;
import org.apache.commons.configuration2.PropertiesConfiguration;
import org.springframework.boot.context.properties.ConstructorBinding;

import java.io.FileNotFoundException;
import java.net.URL;

@ConstructorBinding
public class ConfigManager implements ILogger {

    private static ConfigManager configManager = null;

    CompositeConfiguration compositeConfiguration;
    PropertiesConfiguration propertiesConfiguration;
    PropertiesConfiguration overRideConfig;
    private static long runId = 0;

    private ConfigManager() throws FileNotFoundException {

        log.info("Loading configs from conf.properties else will be loaded from default.config");

        try{
            log.info("Loading configuration properties ..........::::::........");
            URL config = ConfigManager.class.getClassLoader().getResource("/config.properties");
            if(config == null){
                config = ConfigManager.class.getClassLoader().getResource("config.properties");
                if (config == null){
                    log.error("failed to load the properties ....");
                }
            }

        }catch (Exception e){
            log.error(e.getMessage());
        }
    }

    public static ConfigManager getInstance() throws FileNotFoundException {
        if (configManager == null){
            synchronized (ConfigManager.class){
                configManager = new ConfigManager();
                return configManager;
            }
        }
        return null;
    }
}
