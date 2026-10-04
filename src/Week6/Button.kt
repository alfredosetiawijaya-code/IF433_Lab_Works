package Week6

class Button(override val name: String) : Clickable {

    override fun click() {
        println("Tombol $name berhasil diklik!")
    }
}