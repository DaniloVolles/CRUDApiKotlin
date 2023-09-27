package volles.danilo.springboot.learningBackEnd.datasource.mock

import org.springframework.stereotype.Repository
import volles.danilo.springboot.learningBackEnd.datasource.BankDataSource
import volles.danilo.springboot.learningBackEnd.model.Bank

@Repository
class MockBankDataSource : BankDataSource {

    val banks = listOf(
        Bank("1234", 3.14, 17),
        Bank("1010", 17.0, 0),
        Bank("156156", 0.0, 100)
    )

    override fun retrieveBanks(): Collection<Bank> = banks

}