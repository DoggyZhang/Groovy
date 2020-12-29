package 类

class SongExample {

    static void main(String[] args) {
        def song = new Song(name:'Le Freak', artist: 'Chic', genre: 'Disco')

        def song2 = new Song(name:"Kung Fu Fighting", genre:"Disco")

        def song3 = new Song()
        song3.name = "Funkytown"
        song3.artist = "Lipps Inc."
        song3.setGenre("Disco")

        assert song3.getArtist() == "Lipps Inc."

        println song
        println song2
        println song2.genre
        println song2.getGenre()
        println song3
    }

}
