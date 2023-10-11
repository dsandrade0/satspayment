package dsandrade.info.lightning.controller

import dsandrade.info.lightning.client.AlbyClient
import dsandrade.info.lightning.client.cmd.CreateInvoiceCmd
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class Invoices(private val albyClient: AlbyClient) {

    @GetMapping("/invoices")
    fun getInvoices() = albyClient.getInvoices()

    @GetMapping("/invoices/{paymentHash}")
    fun getInvoice(@PathVariable paymentHash: String) = albyClient.getInvoiceByPaymentHash(paymentHash)

    @PostMapping("/invoices")
    fun createInvoice(@RequestBody cmd: CreateInvoiceCmd) = albyClient.createInvoice(cmd)
}