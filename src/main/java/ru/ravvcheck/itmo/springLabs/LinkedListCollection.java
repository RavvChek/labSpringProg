package ru.ravvcheck.itmo.springLabs;

import ru.ravvcheck.itmo.springLabs.model.SpaceMarine;
import ru.ravvcheck.itmo.springLabs.reader.DataReader;

import java.util.Date;
import java.util.LinkedList;

public class LinkedListCollection {
    private final DataReader dataReader;
    private final LinkedList<SpaceMarine> data;
    private final String type;
    private final Date date;
    private int count;

    public LinkedListCollection(DataReader dataReader) {
        this.dataReader = dataReader;
        data = dataReader.getData();
        type = SpaceMarine.class.getName();
        date = new Date();
    }

    public LinkedList<SpaceMarine> getCollection() {
        return data;
    }

    public Date getData() {
        return date;
    }

    public int getCount() {
        count = data.size();
        return count;
    }

    public String getType() {
        return type;
    }
}