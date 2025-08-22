SimpleLogger
A lightweight and elegant Java logging library with color formatting support.

✨ Features
🎨 Color Formatting - Support for 8 colors and reset formatting

⏰ Automatic Date/Time - Built-in time templates

🧵 Thread Information - Automatic thread name display

🎛️ Flexible Formatting - Customizable output templates

🔌 Easy Integration - Minimal code to get started

📦 Installation
Add the JAR file to your project's classpath.

🚀 Quick Start
java
import ycken.simplelogger.Logger;

public class Main {
    // Logger with custom name and default formatting
    public static Logger logger = new Logger("MAIN");
    
    // Logger with custom name and custom formatting
    public static Logger customLogger = new Logger("CUSTOM", "&purple[{hh}:{mm}:{ss}] &cyan[{thread}]: &gray{log}");

    public static void main(String[] args) {
        String message = "Hello, World!";
        
        logger.log(message);
        customLogger.log(message);
        
        // Different log levels
        logger.info("Information message");
        logger.warn("Warning message");
        logger.error("Error message");
    }
}
🎨 Formatting Guide
Default Format
[{hh}:{mm}:{ss}] [{thread}]: {log}

Custom Format Example
"&purple[{hh}:{mm}:{ss}] &cyan[{thread}]: &gray{log}"

Available Color Tags
&black - Black text

&red - Red text

&green - Green text

&yellow - Yellow text

&blue - Blue text

&purple - Purple text

&cyan - Cyan text

&gray - Gray text

&reset - Reset formatting

Available String Tags
{h} - Hour (0-23)

{m} - Minute (0-59)

{s} - Second (0-59)

{hh} - Hour with leading zero (00-23)

{mm} - Minute with leading zero (00-59)

{ss} - Second with leading zero (00-59)

{thread} - Current thread name

{log} - Log message content

📋 API Reference
Constructor
java
// Create logger with default format
Logger(String name)

// Create logger with custom format  
Logger(String name, String format)
Methods
java
// Basic logging
void log(String message)

// Level-based logging
void info(String message)
void warn(String message) 
void error(String message)

// Utility methods
void setFormat(String format)
String getFormat()
🎯 Examples
Basic Usage
java
Logger logger = new Logger("APP");
logger.log("Application started");
// Output: [14:30:25] [main]: Application started
Custom Formatting
java
Logger logger = new Logger("API", "&blue[{hh}:{mm}:{ss}] &green{thread} &reset-> {log}");
logger.log("Request received");
// Output: [14:30:25] main -> Request received (in colors)
Multiple Loggers
java
Logger dbLogger = new Logger("DATABASE", "&cyan[DB] {log}");
Logger apiLogger = new Logger("API", "&green[API] {log}");

dbLogger.log("Connected to database");
apiLogger.log("Endpoint called");
