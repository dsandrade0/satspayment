package dsandrade.info.lightning.client.response

import com.fasterxml.jackson.annotation.JsonProperty
import java.time.LocalDateTime

data class CreateInvoiceReturn(
    @JsonProperty("expires_at")
    val expiresAt: LocalDateTime,
    @JsonProperty("payment_hash")
    val paymentHash: String,
    @JsonProperty("payment_request")
    val paymentRequest: String

)
