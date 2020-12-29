package 闭包

class 闭包 {
    static void main(String[] args) {
        println 闭包.excite(132464)
    }

    static void test1() {
        def acoll = ["Groovy", "Java", "Ruby"]

        for (Iterator iter = acoll.iterator(); iter.hasNext();) {
            println iter.next()
        }
    }

    // 闭包.闭包: each 后{}包起来的就是闭包
    // it 是一个关键字
    static void test2() {
        def acoll = ['Groovy', 'Java', 'Ruby']

        acoll.each { println(it) }

        // 使用value替换了it (默认是it)
        acoll.each { value -> println(value) }
    }

    static void test3(){
        def hash = [name:"Andy", "VPN-#":45]
        hash.each {println it.key + ':' + it.value}
        hash.each{ key, value ->
            println "${key} : ${value}"
        }
    }

    // 请记住，凡是集合或一系列的内容，都可以使用下面这样的代码进行迭代。
    static void test4(){
        "ITERATION".each{
            println it.toLowerCase()
        }
    }

    static def excite = { word ->
        return "${word}!!"
    }

    // 延迟执行
    static void test5(){
        assert "Groovy!!" == excite("Groovy")
        assert "Java!!" == excite.call("Java")
    }
}
