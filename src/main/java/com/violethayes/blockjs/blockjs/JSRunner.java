package com.violethayes.blockjs.blockjs;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JSRunner {
    public static String fileName;

    public static void main(String[] args) throws IOException {
        Files.createDirectories(Paths.get("BlockJSScripts"));

        JSRuntime runtime = new JSRuntime();
        runtime.run("console.log('Hello World!');");
        runtime.run("console.warn('Testing');");
        runtime.run("console.error('Testing');");
    }
}
