package volles.danilo.springboot.learningBackEnd.service

import org.springframework.stereotype.Service
import volles.danilo.springboot.learningBackEnd.datasource.BankDataSource
import volles.danilo.springboot.learningBackEnd.model.Bank

@Service
class BankService(private val dataSource: BankDataSource) {
    fun getBanks(): Collection<Bank> = dataSource.retrieveBanks()
    fun getBank(accountNumber: String): Bank = dataSource.retrieveBank(accountNumber)
}