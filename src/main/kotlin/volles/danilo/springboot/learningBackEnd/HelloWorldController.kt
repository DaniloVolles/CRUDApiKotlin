package volles.danilo.springboot.learningBackEnd

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/hello")
class HelloWorldController {

    @GetMapping // Seria possível adicionar um ("aaaaa"), em que aaaa, seria outra rota anexada ao "api/hello"
    fun helloWorld(): String = "Hello, this is a REST endpoint!"
}