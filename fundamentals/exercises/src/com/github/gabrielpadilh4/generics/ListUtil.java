package com.github.gabrielpadilh4.generics;

import java.util.List;

public class ListUtil {

    public static <T> T getLast1(List<T> list) {
        return list.get(list.size() - 1);
    }
}
