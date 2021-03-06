package com.tcs.service

import com.tcs.service.utility.Utility
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import khttp.responses.Response
import org.json.JSONObject
import org.springframework.boot.SpringApplication

@SpringBootApplication
class ServiceKotlinTemplateApplication

fun main(args: Array<String>) {

    runApplication<ServiceKotlinTemplateApplication>(*args)

}