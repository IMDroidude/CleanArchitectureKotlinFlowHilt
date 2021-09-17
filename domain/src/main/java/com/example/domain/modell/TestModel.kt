package com.example.domain.modell

import com.example.core.prefs.mapper.PBModel

data class TestModel(val login: String, val contributions: Int, val avatarUrl: String?) : PBModel()