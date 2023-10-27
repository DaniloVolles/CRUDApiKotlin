package volles.danilo.springboot.learningBackEnd.datasource

import volles.danilo.springboot.learningBackEnd.model.Bank

interface BankDataSource {

    fun retrieveBanks(): Collection<Bank>
    fun retrieveBank(accountNumber: String): Bank
    fun createBank(bank: Bank): Bank
}