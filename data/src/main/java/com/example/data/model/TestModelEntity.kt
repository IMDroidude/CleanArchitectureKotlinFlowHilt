package com.example.data.model

import com.example.core.prefs.mapper.EntityMapper
import com.example.core.prefs.mapper.PBModelEntity
import com.example.domain.modell.TestModel
import com.google.gson.annotations.SerializedName
import javax.inject.Inject

data class TestModelEntity(
    @SerializedName("login") val login: String,
    @SerializedName("contributions") val contributions: Int,
    @SerializedName("avatar_url") val avatarUrl: String?
) : PBModelEntity()

class TestModelEntityMapper @Inject constructor() : EntityMapper<TestModel, TestModelEntity> {

    override fun mapToDomain(entity: TestModelEntity) = TestModel(
        entity.login, entity.contributions, entity.avatarUrl
    )

    override fun mapToEntity(model: TestModel) = TestModelEntity(
        model.login, model.contributions, model.avatarUrl
    )
}
