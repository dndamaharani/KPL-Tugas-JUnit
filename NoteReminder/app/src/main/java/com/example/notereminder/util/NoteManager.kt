
package com.example.notereminder.util

class NoteManager {
    private val notes = mutableListOf<String>()

    fun addNote(note: String) {
        notes.add(note)
    }

    fun getNotes(): List<String> = notes

    fun clearNotes() {
        notes.clear()
    }
}
