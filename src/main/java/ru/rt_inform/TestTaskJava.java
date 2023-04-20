package ru.rt_inform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestTaskJava {

    public static Map<Integer, Integer> associativeArray(List<Integer> list) throws Exception {
        if (list == null || list.isEmpty()){
            throw new Exception("List is empty");
        }
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
