package it.innovactors

import io.ktor.server.application.*
import it.innovactors.plugins.configureMonitoring
import it.innovactors.plugins.configureRouting
import it.innovactors.plugins.configureSerialization

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

@Suppress("unused") // application.conf references the main function. This annotation prevents the IDE from marking it as unused.
fun Application.module() {
    configureSerialization()
    configureMonitoring()
    configureRouting()
}
