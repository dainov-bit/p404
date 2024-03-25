package model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class RepozitoryTest {
    @Test
    public void myTest() {
        Repozitory r = new Repozitory();
        r.add("Artem",1500.0,Status.DIRECTOR,0);
        r.listWorker("sort","id");
        System.out.println(r.getLast().getId()+"/"+r.getLast().getName());
    }
}