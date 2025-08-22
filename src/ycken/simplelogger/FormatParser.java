package ycken.simplelogger;

import java.time.LocalTime;
import java.util.HashMap;

public class FormatParser {
    private final String formatData;
    private static final HashMap<String, String> COLOR_MAP = new HashMap<>();

    public FormatParser(String formatData){
        this.formatData = formatData;
        setupColors();
    }

    public FormatParser(){
        this.formatData = "[{hh}:{mm}:{ss}] [{thread}]: {log}";
        setupColors();
    }

    private void setupColors(){
        COLOR_MAP.put("&black", "\u001B[30m");
        COLOR_MAP.put("&red", "\u001B[31m");
        COLOR_MAP.put("&green", "\u001B[32m");
        COLOR_MAP.put("&yellow", "\u001B[33m");
        COLOR_MAP.put("&blue", "\u001B[34m");
        COLOR_MAP.put("&purple", "\u001B[35m");
        COLOR_MAP.put("&cyan", "\u001B[36m");
        COLOR_MAP.put("&gray", "\u001B[37m");
        COLOR_MAP.put("&reset", "\\u001B[0m");
    }

    public String returnFormated(String logMessage, String thread){
        String toReturn = formatData;

        toReturn = toReturn.replace("{h}", Integer.toString(LocalTime.now().getHour()));
        toReturn = toReturn.replace("{m}", Integer.toString(LocalTime.now().getMinute()));
        toReturn = toReturn.replace("{s}", Integer.toString(LocalTime.now().getSecond()));
        toReturn = toReturn.replace("{hh}", String.format("%02d",LocalTime.now().getHour()));
        toReturn = toReturn.replace("{mm}", String.format("%02d",LocalTime.now().getMinute()));
        toReturn = toReturn.replace("{ss}", String.format("%02d",LocalTime.now().getSecond()));
        toReturn = toReturn.replace("{thread}", thread);
        toReturn = toReturn.replace("{log}", logMessage);

        for (HashMap.Entry<String, String> entry : COLOR_MAP.entrySet()){
            toReturn = toReturn.replace(entry.getKey(), entry.getValue());
        }

        return toReturn;
    }
}
