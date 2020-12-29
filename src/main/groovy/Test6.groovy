import java.util.function.Consumer

class Test6 {

    static void main(String[] args) {
        Test6.test2()
    }

    static void test1(){
        def hash = [name:"Andy", "VPN-#":45]
        def set = hash.keySet()
        set.forEach(new Consumer<String>() {
            @Override
            void accept(String key) {
                def value = hash.get(key)
                println key + ',' + value
            }
        })
    }

    static void test2(){
        def hash = [name:"Andy", "VPN-#":45]
        assert hash.getClass() == java.util.LinkedHashMap
    }
}
