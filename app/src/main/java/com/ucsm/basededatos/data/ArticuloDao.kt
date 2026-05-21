package com.ucsm.basededatos.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow


@Dao
interface ArticuloDao {
    @Insert(onConflict = OnConflictStrategy.ABORT)
    suspend fun insertar(articulo: Articulo): Long

    @Update
    suspend fun actualizar(articulo: Articulo): Int

    @Delete
    suspend fun eliminar(articulo: Articulo): Int

    @Query("DELETE FROM articulos WHERE codigo = :codigo")
    suspend fun eliminarPorCodigo(codigo: Int): Int

    @Query("SELECT * FROM articulos WHERE codigo = :codigo LIMIT 1")
    suspend fun buscarPorCodigo(codigo: Int): Articulo?

    @Query("SELECT * FROM articulos ORDER BY codigo ASC")
    fun listarTodos(): Flow<List<Articulo>>
}