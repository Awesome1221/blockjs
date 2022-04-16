package com.violethayes.blockjs.blockjs;

import com.eclipsesource.v8.V8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JSRuntime {
    public static String fileName;

    public static void main(String[] args) throws IOException {
        V8 runtime = V8.createV8Runtime();

        Files.createDirectories(Paths.get("BlockJSScripts"));
    }
}
