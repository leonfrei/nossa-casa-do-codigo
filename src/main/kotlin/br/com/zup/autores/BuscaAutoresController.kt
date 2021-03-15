//package br.com.zup.autores
//
//import io.micronaut.http.HttpResponse
//import io.micronaut.http.annotation.Get
//import javax.transaction.Transactional
//
//class BuscaAutoresController(val autorRepository: AutorRepository) {
//
//    @Get
//    @Transactional
//    fun lista() : HttpResponse<List<DetalhesDoAutorResponse>>{
//
//        val autores = autorRepository.findAll()
//
//        val resposta = autores.map { autor -> DetalhesDoAutorResponse(autor) }
//
//        return HttpResponse.ok(resposta)
//    }
//}