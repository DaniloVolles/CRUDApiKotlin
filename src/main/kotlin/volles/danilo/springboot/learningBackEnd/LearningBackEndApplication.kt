package volles.danilo.springboot.learningBackEnd

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LearningBackEndApplication

fun main(args: Array<String>) {
	runApplication<LearningBackEndApplication>(*args)
	helloWorld()
}

fun helloWorld(): String {
	return "Olá, mundo!"
}