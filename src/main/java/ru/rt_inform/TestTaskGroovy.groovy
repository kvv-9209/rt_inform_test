package ru.rt_inform

class TestTaskGroovy {

    static def associativeArray(list) {
        if (list == null || list.isEmpty()){
            throw new Exception("List is empty")
        }
        def result = [:]
        for (int element : list) {
            if (result.containsKey(element)) {
                result.put(element, result.get(element) + 1)
            } else {
                result.put(element, 1)
            }
        }
        return result
    }
}
