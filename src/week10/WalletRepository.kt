package week10

class WalletRepository <T> {

    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }

    fun findByName(
        name: String,
        nameProvider: (T) -> String
    ): T? {
        return items.find {
            nameProvider(it).contains(name, ignoreCase = true)
        }
    }

}
