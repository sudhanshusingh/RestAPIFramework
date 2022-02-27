package Framework;

import Loggers.ILogger;

import java.net.URL;

public class GenerateXml implements ILogger {

    public static void main(String[] args) {
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
}
