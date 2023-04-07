fun DataTypes(){
    println("----------------------------")
    //Character
    var nilai = '1'
    println("Character:")
    println("Nilai "+ nilai++)
    println("Nilai "+ nilai++)
    println("Nilai "+ nilai++)
    println()
    println("Nilai "+ nilai--)
    println("Nilai "+ nilai--)
    println("Nilai "+ nilai--)
    println("----------------------------")

    //String
    println("String:")
    //Indexing dan Escaped String
    println("Indexing dan Escaped String:")
    val nama = "Muhammad Adrian Zaky"
    val index = nama[3]
    println("Character ke-4 dari \"$nama\" adalah \"$index\"")
    //Raw String
    println("Raw String:")
    val rawString = """
        Halo nama saya Muhammad Adrian Zaky
        ***********************************
        Saya sedang mengikuti program kampus
        merdeka di Infinite Learning
        """.trimIndent()
    println(rawString)
    println("----------------------------")

    //Boolean
    println("Boolean:")

    println("----------------------------")

    println("============================\n")
}

fun KotlinVariable(){
    //Penggunan keyword "var" berarti value dari variable bisa diubah
    var name: String = "Adrian Zaky"
    name = "Muhammad Adrian Zaky"
    println(name)

    //Penggunan keyword "val" berarti value dari variable TIDAK bisa diubah
    /* val name: String = "Adrian Zaky"
    name = "Muhammad Adrian Zaky"
    println(name) */ //--> akan menghasilkan error "Val cannot be reassigned"
    val birthDate = "14-12-2002"
    println(birthDate)

    println("============================\n")
}

fun main() {
    println("Output KotlinVariable:")
    KotlinVariable()
    println("Output DataTypes:")
    DataTypes()
}