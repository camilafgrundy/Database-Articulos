package com.ucsm.basededatos.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "articulos")
data class Articulo(
    @PrimaryKey
    val codigo: Int,
    val descripcion: String,
    val precio: Double
)