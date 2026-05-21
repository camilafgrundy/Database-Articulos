package com.ucsm.basededatos.data

import kotlinx.coroutines.flow.Flow

class ArticuloRepository(private val dao: ArticuloDao) {

    val todosLosArticulos: Flow<List<Articulo>> = dao.listarTodos()

    suspend fun insertar(articulo: Articulo) = dao.insertar(articulo)
    suspend fun actualizar(articulo: Articulo) = dao.actualizar(articulo)
    suspend fun eliminar(articulo: Articulo) = dao.eliminar(articulo)
    suspend fun eliminarPorCodigo(codigo: Int) = dao.eliminarPorCodigo(codigo)
    suspend fun buscarPorCodigo(codigo: Int) = dao.buscarPorCodigo(codigo)
}