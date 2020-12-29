class Test5 {

    static void main(String[] args) {
        println([1, 2, 3, 4, 3].count(1))
        println([1, 2, 3, 4, 3].count(2))
        println([1, 2, 3, 4, 3].count(3))
        println([1, 2, 3, 4, 3].count(4))
        println([1, 2, 3, 4, 3].count(5))
    }

    static void test1() {
        def numbers = [1, 2, 3, 4]
        assert numbers.join(",") == "1,2,3,4"
        assert [1, 2, 3, 4, 3].count(3) == 2
        // 注意*标记
        assert ["JAVA", "GROOVY"] ==
                ["Java", "Groovy"]*.toUpperCase()
    }

}
