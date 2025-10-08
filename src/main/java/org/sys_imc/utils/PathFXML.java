package org.sys_imc.utils;

import java.nio.file.Paths;

public class PathFXML {
    public static String pathBase() {
        return Paths.get("src/main/java/org/sys_imc/view").toAbsolutePath().toString();
    }
}
