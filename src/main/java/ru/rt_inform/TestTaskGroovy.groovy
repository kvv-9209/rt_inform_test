package ru.rt_inform

class TestTaskGroovy {
    static main(args) {
        def list = [1, 3, 4, 5, 1, 5, 4]
        println(associativeArray(list))
    }

    static def associativeArray(list) {
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
