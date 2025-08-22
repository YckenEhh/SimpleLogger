package ycken.simplelogger;


public class Logger {
    private final FormatParser formatParser;
    private final String loggerName;

    public Logger(String loggerName){
        this.loggerName = loggerName;
        formatParser = new FormatParser();
    }

    public Logger(String loggerName, String format){
        this.loggerName = loggerName;
        formatParser = new FormatParser(format);
    }

    public void log(String logMessage){
        System.out.println(formatParser.returnFormated(logMessage, loggerName));
    }
}
