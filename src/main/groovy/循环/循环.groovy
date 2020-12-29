package 循环

class 循环 {

    static void main(String[] args) {

    }

    static def repeat1(val) {
        for (i in 0..<5) {
            println val
        }
    }

    def repeat2(val, repeat = 5) {
        for (i in 0..<repeat) {
            println val
        }
    }
}
