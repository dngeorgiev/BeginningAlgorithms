package com.dngeorgiev.iteration;

import java.io.File;
import java.util.Objects;

public final class RecursiveDirectoryTreePrinter {
    private static final String SPACES = "    ";

    public RecursiveDirectoryTreePrinter(String dir) {
        assert dir != null : "dir can't be null.";

        if (dir.length() <= 1) {
            System.err.println("Usage: RecursiveDirectoryTreePrinter <dir>");
            System.exit(4);
        }

        print(new File(dir), "");
    }

    private static void print(File file, String indent) {
        assert file != null : "file can't be null.";
        assert indent != null : "indent can't be null.";

        System.out.print(indent);
        System.out.println(file.getName());

        if (file.isDirectory()) {
            print(Objects.requireNonNull(file.listFiles()), indent + SPACES);
        }
    }

    private static void print(File[] files, String indent) {
        assert files != null : "files can't be null.";

        for (File file : files) {
            print(file, indent);
        }
    }
}
