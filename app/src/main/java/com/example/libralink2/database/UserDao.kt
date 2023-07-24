package com.example.libralink2.database

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface UserDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
<<<<<<< HEAD
    suspend fun insertUser(User: User)

    @Query("SELECT * FROM User_table WHERE list_name LIKE :list_name")
    suspend fun findUser (list_name : String):User

   

=======
    suspend fun insertUser(user: User)
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertList(list: BookList)
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertBook(book: Book)
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertListBookCrossRef(crossRef: ListBookCrossRef)
    @Update
    suspend fun updateUser(user: User)
>>>>>>> 225ae67171e8376218acd0174941bdf734f6c8a1
    @Delete
    suspend fun deleteUser(user: User)
    @Query("SELECT * from user WHERE userId = :userId")
    fun getUser(userId: Int): Flow<User>
    @Transaction
    @Query("SELECT * from user WHERE userId = :userId")
    suspend fun getUserWithBookLists(userId: Int): List<UserWithBookLists>
    @Transaction
    @Query("SELECT * from book_list WHERE listId = :listId")
    suspend fun getListWithBooks(listId: Int): List<ListWithBooks>
}