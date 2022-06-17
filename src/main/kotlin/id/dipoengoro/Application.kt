package id.dipoengoro

import id.dipoengoro.dao.DatabaseFactory
import io.ktor.server.application.*
import id.dipoengoro.plugins.*

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused")
fun Application.module() {
    DatabaseFactory.init()
    configureRouting()
    configureTemplating()
}
