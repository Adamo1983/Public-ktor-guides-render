package it.innovactors.data

import it.innovactors.model.dto.CategoryDto
import it.innovactors.model.dto.CategoryRelationshipDto
import it.innovactors.model.dto.ContentDto
import it.innovactors.model.response.NestedCategoriesResponse
import it.innovactors.model.response.NestedCategoryResponse

typealias CategoryId = Int
typealias ContentId = Int

object Guide {

    const val VERSION: Int = 1

    val categories: List<CategoryDto> = Category.list
    val contents: List<ContentDto> = Content.list
    val nestedCategoryList: List<NestedCategoryResponse> = emptyList()
    val nestedCategories = NestedCategoriesResponse(nestedCategoryList)


    //li uso per ritornare un oggetto con tutte le liste vuote => non ci sono modifiche

    val categoriesToAdd: List<CategoryDto> = emptyList()
    val contentsToAdd: List<ContentDto> = emptyList()
    val categoryIdsToDelete: List<Int> = emptyList()
    val contentIdsToDelete: List<Int> = emptyList()
    val relationshipsToAdd: List<CategoryRelationshipDto> = emptyList()



    val nextVersion: Int
        get() = VERSION + 1

}