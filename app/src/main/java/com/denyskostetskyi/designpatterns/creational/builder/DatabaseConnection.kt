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

        fun database(database: String): Builder {
            this.database = database
            return this
        }

        fun host(host: String): Builder {
            this.host = host
            return this
        }

        fun port(port: Int): Builder {
            this.port = port
            return this
        }

        fun user(user: String): Builder {
            this.user = user
            return this
        }

        fun password(password: String): Builder {
            this.password = password
            return this
        }

        fun build(): DatabaseConnection = DatabaseConnection(database, host, port, user, password)
    }
}