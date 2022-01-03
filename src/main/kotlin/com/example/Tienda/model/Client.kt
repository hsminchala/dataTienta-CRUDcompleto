package com.example.Tienda.model
import javax.persistence.*

@Entity
@Table(name = "client")

class Client {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null
    var nombre: String? = null
    var cedula: String? = null
}