package com.imooc.hi.hi.clone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class CloneVO2 implements Serializable
{
    private static final long serialVersionUID = 1L;

    private String id;

    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("CloneVO [id=");
        builder.append(id);
        builder.append(", name=");
        builder.append(name);
        builder.append("]");
        return builder.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Object deepClone() throws IOException, ClassNotFoundException
    {
        ByteArrayOutputStream bop = new ByteArrayOutputStream();
        ObjectOutputStream oop = new ObjectOutputStream(bop);
        oop.writeObject(this);
        ByteArrayInputStream bip = new ByteArrayInputStream(bop.toByteArray());
        ObjectInputStream oip = new ObjectInputStream(bip);

        return oip.readObject();
    }
}
