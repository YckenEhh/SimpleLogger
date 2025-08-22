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

# Output:
<img width="1660" height="890" alt="Screenshot From 2025-08-23 02-34-41" src="https://github.com/user-attachments/assets/a2268936-4b20-47e0-b1b0-5a3af770c268" />

# Custom formating
Use ```new Logger("MAIN", "format")``` instant of ```new Logger("MAIN")```
# Formating example: ```"[{hh}:{mm}:{ss}] [{thread}]: {log}"```
# Color tags:
- &black
- &red
- &green
- &yellow
- &blue
- &purple
- &cyan
- &gray
- &reset
# String tags
- {h}
- {m}
- {s}
- {hh}
- {mm}
- {ss}
- {thread}
- {log}
