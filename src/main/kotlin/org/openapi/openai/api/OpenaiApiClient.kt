package org.openapi.openai.api

import org.springframework.cloud.openfeign.FeignClient

@FeignClient(name = "openaiApiClient", url = "https://api.openai.com/v1")
interface OpenaiApiClient: OpenaiApi