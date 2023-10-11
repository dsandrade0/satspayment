package dsandrade.info.lightning.client

import feign.RequestInterceptor
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class FeignHeaders(
    @Value("\${alby.token}") val albyToken: String
) {
    @Bean
    fun requestTokenBearerInterceptor(): RequestInterceptor? {
        return RequestInterceptor {
            it.header("Authorization", albyToken)
        }
    }
}