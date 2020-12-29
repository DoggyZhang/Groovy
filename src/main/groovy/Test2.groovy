class Test2 {

    static void main(String[] args) {
        def message = "Hello World"
        println message.class

        message = 1
        println message.class

        message = Object
        println message.class
    }
}
