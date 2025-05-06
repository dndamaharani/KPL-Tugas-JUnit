
package com.example.notereminder

import com.example.notereminder.util.NoteManager
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class NoteManagerTest {

    private lateinit var noteManager: NoteManager

    @Before
    fun setup() {
        noteManager = NoteManager()
    }

    @Test
    fun testAddNote() {
        /* Test case: Menambahkan 1 catatan dan memastikan jumlah catatan bertambah menjadi 1 */
        noteManager.addNote("Belajar Unit Test")
        assertEquals(1, noteManager.getNotes().size)
    }

    @Test
    fun testClearNotes() {
        /* Test case: Setelah menambahkan beberapa catatan, saat di-clear maka jumlahnya menjadi 0 */
        noteManager.addNote("Catatan 1")
        noteManager.addNote("Catatan 2")
        noteManager.clearNotes()
        assertTrue(noteManager.getNotes().isEmpty())
    }
}
