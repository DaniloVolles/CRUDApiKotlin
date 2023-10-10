package volles.danilo.springboot.learningBackEnd.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import volles.danilo.springboot.learningBackEnd.model.Bank
import volles.danilo.springboot.learningBackEnd.service.BankService

@RestController
@RequestMapping("/api/banks")
class BankController(private val service: BankService) {
    @GetMapping
    fun getBanks(): Collection<Bank> = service.getBanks()
}