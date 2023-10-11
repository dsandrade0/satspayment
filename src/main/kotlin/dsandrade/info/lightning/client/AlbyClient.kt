package dsandrade.info.lightning.client

import dsandrade.info.lightning.client.cmd.CreateInvoiceCmd
import dsandrade.info.lightning.client.response.CreateInvoiceReturn
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody


@FeignClient(value = "alby", url = "https://api.getalby.com", configuration = [FeignHeaders::class])
interface AlbyClient {

    @GetMapping("/invoices/incoming")
    fun getInvoices(): List<Map<String, Any>>

    @PostMapping("/invoices")
    fun createInvoice(@RequestBody createInvoiceCmd: CreateInvoiceCmd): CreateInvoiceReturn

    @GetMapping("/invoices/{paymentHash}")
    fun getInvoiceByPaymentHash(@PathVariable paymentHash: String): Map<String, Any>
}