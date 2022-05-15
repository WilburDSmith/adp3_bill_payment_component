package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.entity.Table;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TableFactoryTest {
    @Test

    void createTable(){
        Table table = TableFactory.createTable("Spaghetti","2");
        assertNotNull(table);
        System.out.println(table);
    }
}