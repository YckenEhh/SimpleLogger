# SimpleLogger
 A simple java logger libriary

# Usage:
```
import ycken.simplelogger.Logger;

public class Main {

    // Logger with custom name and default formating ([{hh}:{mm}:{ss}] [{thread}]: {log}):
    public static Logger logger = new Logger("MAIN");

    // Logger with custom name and custom formating:
    public static Logger loggerFormated = new Logger("MAIN_FORMATED", "&purple[{hh}:{mm}:{ss}] &cyan[{thread}]: &gray{log}");

    public static void main(String[] args) {
        String logMessage = "Hello, World!";

        logger.log(logMessage);
        loggerFormated.log(logMessage);
    }
}
```
