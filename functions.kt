/**
 * Exemplo de função publica sem parametros
 * 
 */
fun novaFuncao() {
    println("Oi, tudo bem?")
}

/**
 * Exemplo de função privada com parametro
 * 
 */
fun novaFuncao2(nome: String) {
    println("Oi, $nome")
}

/**
 * Exemplos de chamada de funções
 * 
 */
fun main() {
    novaFuncao()
    novaFuncao2("Daniel")
}