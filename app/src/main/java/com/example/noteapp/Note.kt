package com.example.noteapp


//TODO:  1- Convert Class to Entity
data class Note(

    @PrimaryKey val ID: Int,
    @ColumnInfo val Title: String,
    @ColumnInfo val Description: String ) {
    annotation class PrimaryKey
}

annotation class ColumnInfo

//TODO: 2- Define Doa

@Dao
interface  NoteDao{


    @Insert
    fun insert(vararg  note: Note)
    annotation class Insert

    @Delete
    fun delete(note: Note)
    annotation class Delete

    @Update
    fun update(note: Note)
    annotation class Update

    @Query("SELECT *From Note")
    annotation class Query(val s: String)

}



annotation class Dao


// TODO: 3- create database



//TODO: 4- Create database instance


