package ru.mrwinwon.core_lib.di

import javax.inject.Qualifier
import javax.inject.Scope

@Scope
@Retention(value = AnnotationRetention.RUNTIME)
annotation class PerFeature

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class Flow