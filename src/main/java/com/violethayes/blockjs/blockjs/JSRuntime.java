package com.violethayes.blockjs.blockjs;

import com.eclipsesource.v8.*;
import com.violethayes.blockjs.blockjs.jslogic.Chat;
import com.violethayes.blockjs.blockjs.jslogic.Console;

public class JSRuntime {
    private static final V8 runtime = V8.createV8Runtime();

    public void run(String code) {
        this.regMethods();
        runtime.executeScript(code);
    }

    public void kill() {
        runtime.release();
    }

    private void regMethods() {
        Console console = new Console();
        V8Object consoleObj = new V8Object(runtime);

        runtime.add("console", consoleObj);

        consoleObj.registerJavaMethod(console, "log", "log", new Class<?>[]{String.class});
        consoleObj.registerJavaMethod(console, "error", "error", new Class<?>[]{String.class});
        consoleObj.registerJavaMethod(console, "warn", "warn", new Class<?>[]{String.class});

        Chat chat = new Chat();
        V8Object chatObj = new V8Object(runtime);

        runtime.add("chat", chatObj);

        chatObj.registerJavaMethod(chat, "send", "send", new Class<?>[]{String.class});
    }
}
