import java.util.function.Consumer

class Test4 {

    static void main(String[] args) {
        Test4.test4()
    }

    static void test1() {
        def range = 0..4
        println range.class
        assert range instanceof List
        // assert range instanceof Map
    }

    static void test2() {
        def coll = ["Groovy", "Java", "Ruby"]
        assert coll instanceof Collection
        assert coll instanceof ArrayList
        assert coll instanceof List
    }

//    String
//    1
//    class java.lang.Object
//    null
//    null
//    zhangfei
    static void test3(){
        def coll = []
        coll.add("String")
        coll.add(1)
        coll.add(Object)
        coll[5] = 'zhangfei'

        coll.forEach(new Consumer() {
            @Override
            void accept(Object o) {
                println o
            }
        })
    }

    static void test4(){
        def numbers = [1,2,3,4]
        assert numbers + 5 == [1,2,3,4,5]
        assert numbers - [2,3] == [1,4]
    }
}
