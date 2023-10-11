package dsandrade.info.lightning

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients
class LightningApplication

fun main(args: Array<String>) {
    runApplication<LightningApplication>(*args)
}
