package com.example.gitport.data.domain

import com.example.gitport.core.UseCase
import com.example.gitport.data.model.Repo
import com.example.gitport.data.repositories.RepoRepository
import kotlinx.coroutines.flow.Flow

class ListUserRepositoriesUseCase(
    private val repository: RepoRepository
) : UseCase<String, List<Repo>>() {

    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }
}