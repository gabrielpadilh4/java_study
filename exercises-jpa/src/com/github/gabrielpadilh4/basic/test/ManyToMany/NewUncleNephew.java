package com.github.gabrielpadilh4.basic.test.ManyToMany;

import com.github.gabrielpadilh4.infra.DAO;
import com.github.gabrielpadilh4.model.ManyToMany.Nephew;
import com.github.gabrielpadilh4.model.ManyToMany.Uncle;

public class NewUncleNephew {

    public static void main(String[] args) {

        Uncle uncle1 = new Uncle("Bob");
        Uncle uncle2 = new Uncle("Gabriel");

        Nephew nephew1 = new Nephew("Angela");
        Nephew nephew2 = new Nephew("Rodrigo");

        uncle1.getNephews().add(nephew1);
        nephew1.getUncles().add(uncle1);

        uncle1.getNephews().add(nephew2);
        nephew2.getUncles().add(uncle1);

        uncle2.getNephews().add(nephew1);
        nephew1.getUncles().add(uncle2);

        uncle2.getNephews().add(nephew2);
        nephew2.getUncles().add(uncle2);

        DAO<Object> dao = new DAO<>();

        dao.openTransaction().persist(uncle1).persist(uncle2).persist(nephew1).persist(nephew2).closeTransaction().close();


    }
}
