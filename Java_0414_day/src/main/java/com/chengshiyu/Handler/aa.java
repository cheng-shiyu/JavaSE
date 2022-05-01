package com.chengshiyu.Handler;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

/**
 * @author 程世玉
 * @data 2022/4/14.
 */
public class aa {
    public static void main(String[] args) {
        File file =
                new File("D:");

        if (file.isDirectory()){
            String[] list = file.list(new FilenameFilter() {
                @Override
                public boolean accept(File dir, String name) {
                    return name.endsWith(".txt");
                }
            });

            Arrays.stream(list).forEach(System.out::println);
        }

    }
}
