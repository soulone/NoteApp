package com.soulone.pc03_android.Repositories;

import com.soulone.pc03_android.Models.Note;
import com.orm.SugarRecord;

import java.util.List;

public class NoteRepository {

    public static void create(String fecha, String titulo, String descripcion) {

        Note note = new Note();
        note.setDate(fecha);
        note.setTitle(titulo);
        note.setDescription(descripcion);

        SugarRecord.save(note);
    }

    public static List<Note> listar(){

        return SugarRecord.listAll(Note.class);
    }
}
