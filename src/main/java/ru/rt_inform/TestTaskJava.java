package ru.rt_inform;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestTaskJava {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(1);
        list.add(5);
        list.add(4);
        System.out.println(associativeArray(list));
    }

    public static Map<Integer, Integer> associativeArray(List<Integer> list) {
        Map<Integer, Integer> result = new HashMap<>();
        for (int element : list) {
            if (result.containsKey(element)) {
                result.put(element, result.get(element) + 1);
            } else {
                result.put(element, 1);
            }
        }
        return result;
    }
}
