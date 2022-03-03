package Listeners;

import Framework.ConfigManager;
import Loggers.ILogger;

import java.io.FileNotFoundException;

public class TestFrameworkListener implements ILogger{

    public static void main(String[] args) throws FileNotFoundException {
       ConfigManager.getInstance();
    }
}
