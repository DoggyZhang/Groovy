package 映射

import java.util.function.Consumer

class 映射 {

    static void main(String[] args) {
        映射.test3()
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


    static void test3(){
        def hash = [name:'Zhangfei']
        assert hash["name"] == "Zhangfei"
        hash["gender"] = "male"
        assert hash.gender == "male"
        assert hash["gender"] == "male"
    }
}
