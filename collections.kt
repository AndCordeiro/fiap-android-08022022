/**
 * Exemplos de coleções
 * 
 */
fun main() {
    val nomes = listOf("Daniel", "Domingos", "Akira")
    println(nomes)
    println(nomes[2])
    val sobrenomes = mutableListOf("Silva", "Lima", "Pereira")
    println(sobrenomes)
    sobrenomes.add("Fagundes")
    println(sobrenomes)
}