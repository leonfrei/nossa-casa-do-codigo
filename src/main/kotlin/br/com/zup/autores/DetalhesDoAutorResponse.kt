package br.com.zup.autores

import io.micronaut.core.annotation.Introspected

@Introspected
class DetalhesDoAutorResponse(autor: Autor) {
    val nome: String = autor.nome
    val email: String = autor.email
    val descricao: String = autor.descricao
}
