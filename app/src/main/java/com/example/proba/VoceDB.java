package com.example.proba;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "voce")
public class VoceDB {
    @DatabaseField(generatedId = true)
    private int id;
    @DatabaseField(columnName = "naziv",canBeNull = false)
    private String naziv;
    @DatabaseField(columnName = "opis",canBeNull = false)
    private String opis;

    public VoceDB() {
    }

    public int getId() {
        return id;
    }


    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }
}
