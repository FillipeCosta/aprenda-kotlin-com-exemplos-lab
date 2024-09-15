enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Usuario (val nome: String)

data class ConteudoEducacional(val nome: String, val duracao: Int, val nivel: Nivel)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("O Usúario ${usuario.nome} acaba de se inscrever na nossa formação")
    }
}

fun main() {
    // Criação de usuário (Instanciando)
    val user1 = Usuario("Fillipe")
    val user2 = Usuario("Nathany")
    
    // Criação de Nivel (Instanciando)
    val basic = Nivel.BASICO
    val advanced = Nivel.BASICO
    
    // Criação de ConteudoEducacional (Instanciando)
	val cont1 = ConteudoEducacional("PHP Experience Santander", 40, basic)
	val cont2 = ConteudoEducacional("JAVA Experience Santander", 240, advanced)
   
    // Criação de Formacao (Instanciando) 
    val formacao1 = Formacao("Formação BACK-END", listOf(cont1, cont2))
    
    // Após criar uma isntancia de Formacao agora eu tenho acesso aos métodos da Classe.
    formacao1.matricular(user1)
    formacao1.matricular(user2)
}