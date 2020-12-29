package 类

class Song {

    def name
    def artist
    def genre

    String toString() {
        // 不需要return
        "${name}, ${artist}, ${genre}"
    }

    def getGenre() {
        // ? 关键字可避免空指针
        artist?.toUpperCase()
    }
}
