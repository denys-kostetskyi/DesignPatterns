package com.denyskostetskyi.designpatterns.creational.builder

class DatabaseConnection private constructor(
    val database: String,
    val host: String,
    val port: Int,
    val user: String,
    val password: String,
) {
    val result: String
        get() = "Connected to mysql://$host:$port/$database as user $user with password $password"

    class Builder {
        private var database = "main_db"
        private var host = "127.0.0.1"
        private var port = 3648
        private var user = "admin"
        private var password = "admin"

        fun database(database: String) = apply { this.database = database }

        fun host(host: String) = apply { this.host = host }

        fun port(port: Int) = apply { this.port = port }

        fun user(user: String) = apply { this.user = user }

        fun password(password: String) = apply { this.password = password }

        fun build() = DatabaseConnection(database, host, port, user, password)
    }
}
