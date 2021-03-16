package br.com.zup.autores

import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.PathVariable
import io.micronaut.http.annotation.Put
import javax.transaction.Transactional


@Controller("/autores/{id}")
class AtualizarAutorController(val autorRepository: AutorRepository) {

    @Put
    @Transactional
    fun atualizar(@PathVariable id: Long, descricao: String): HttpResponse<Any> {
        val possivelAutor = autorRepository.findById(id)
        if (possivelAutor.isEmpty) {
            return HttpResponse.notFound()
        }
        val autor = possivelAutor.get()
        autor.descricao = descricao
        autorRepository.update(autor)
        return HttpResponse.ok(DetalhesDoAutorResponse(autor))
    }
}