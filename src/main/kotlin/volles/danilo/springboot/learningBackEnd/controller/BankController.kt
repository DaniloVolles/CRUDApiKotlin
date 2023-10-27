package volles.danilo.springboot.learningBackEnd.controller

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import volles.danilo.springboot.learningBackEnd.model.Bank
import volles.danilo.springboot.learningBackEnd.service.BankService

@RestController
@RequestMapping("/api/banks")
class BankController(private val service: BankService) {
    @ExceptionHandler(NoSuchElementException::class)
    fun handleNotFound(e: NoSuchElementException): ResponseEntity<String> =
        ResponseEntity(e.message, HttpStatus.NOT_FOUND)


    @GetMapping
    fun getBanks(): Collection<Bank> = service.getBanks()
    @GetMapping("/{accountNumber}")
    fun getBank(@PathVariable accountNumber: String): Bank = service.getBank(accountNumber)
}