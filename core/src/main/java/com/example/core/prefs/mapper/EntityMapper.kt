package com.example.core.prefs.mapper

///# https://github.com/bachhoan88/CleanArchitecture
open class PBModelEntity
open class PBModel

interface EntityMapper<M : PBModel, ME : PBModelEntity> {
    fun mapToDomain(entity: ME): M

    fun mapToEntity(model: M): ME
}