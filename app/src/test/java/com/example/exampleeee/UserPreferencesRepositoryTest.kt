package com.example.exampleeee

import android.content.Context
import kotlinx.coroutines.ExperimentalCoroutinesApi
import org.junit.Test
import org.junit.runner.RunWith

private const val TEST_DATASTORE_NAME: String = "test_datastore"

@ExperimentalCoroutinesApi
class UserPreferencesRepositoryTest  {

    private val testContext: Context = ApplicationProvider.getApplicationContext()
    private val textCoroutineDispatcher: TestCoroutineDispatcher = TestCoroutineDispatcher()
    private val testCoroutineScopr = TestCorotineScope
    private val repository: UserPreferencesRepository = UserPreferencesRepository(testDataStore)


    @Test
    fun repository_testFetchInitialPreferences() {}

    @Test
    fun repository_testWriteSortByDeadline(){}
}