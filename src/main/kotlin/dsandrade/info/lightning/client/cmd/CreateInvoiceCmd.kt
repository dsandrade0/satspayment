package dsandrade.info.lightning.client.cmd

data class CreateInvoiceCmd(
    val amount: Long,
    val description: String?,
    val currency: String? = "btc",
    val comment: String?
)
