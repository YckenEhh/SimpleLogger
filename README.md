# 🌿 SimpleLogger — minimal Java logger

A lightweight library for **clean and stylish logging**.  
Custom formatting, color tags, and simple API.  
**Chill vibes only.**

---

## 🚀 Usage

```java
import ycken.simplelogger.Logger;

public class Main {

    // Logger with custom name and default format:
    // "[{hh}:{mm}:{ss}] [{thread}]: {log}"
    public static Logger logger = new Logger("MAIN");

    // Logger with custom name and custom format:
    public static Logger loggerFormated = new Logger(
        "MAIN_FORMATED",
        "&purple[{hh}:{mm}:{ss}] &cyan[{thread}]: &gray{log}"
    );

    public static void main(String[] args) {
        String logMessage = "Hello, World!";

        logger.log(logMessage);
        loggerFormated.log(logMessage);
    }
}
```

---

## 📸 Output

<img width="1660" height="890" alt="Screenshot From 2025-08-23 02-34-41" src="https://github.com/user-attachments/assets/a2268936-4b20-47e0-b1b0-5a3af770c268" />

---

## 🎨 Custom formatting

Use:

```java
new Logger("MAIN", "format");
```

instead of:

```java
new Logger("MAIN");
```

**Example format:**  
```
"[{hh}:{mm}:{ss}] [{thread}]: {log}"
```

---

## 🌈 Color tags

| Tag       | Color        |
|-----------|--------------|
| `&black`  | ⚫ Black      |
| `&red`    | 🔴 Red        |
| `&green`  | 🟢 Green      |
| `&yellow` | 🟡 Yellow     |
| `&blue`   | 🔵 Blue       |
| `&purple` | 🟣 Purple     |
| `&cyan`   | 🟦 Cyan       |
| `&gray`   | ⚪ Gray       |
| `&reset`  | ♻️ Reset color |

---

## 🕒 String tags

| Tag       | Meaning                     |
|-----------|-----------------------------|
| `{h}`     | Hour (1–12)                 |
| `{m}`     | Minute (1–59)               |
| `{s}`     | Second (1–59)               |
| `{hh}`    | Hour (00–23)                |
| `{mm}`    | Minute (00–59)              |
| `{ss}`    | Second (00–59)              |
| `{thread}`| Current thread name         |
| `{log}`   | Log message text            |

---

🔥 Simple as that: create a logger, set your style, and enjoy beautiful logs right in the console.
