package edu.escuelaing.arsw.ASE.app;

import static org.junit.Assert.fail;

import java.io.File;
import java.util.Scanner;

import org.junit.*;

public class CountLocTest {

    @Test
    public void deberiaRealizarConteoPhyFunction() {
        try {
            File file = new File("src\\main\\java\\edu\\escuelaing\\arsw\\ASE\\app\\CountLoc.java");
            Scanner scan = new Scanner(file);
            Assert.assertEquals(102, CountLoc.phyFunction(scan));
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    public void deberiaRealizarConteoLocFunction() {
        try {
            File file = new File("src\\main\\java\\edu\\escuelaing\\arsw\\ASE\\app\\CountLoc.java");
            Scanner scan = new Scanner(file);
            Assert.assertEquals(75, CountLoc.locFunction(scan));
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    public void deberiaRealizarConteoPhyDirectorySearch() {
        try {
            File files = new File("src");
            File[] listFiles = files.listFiles();
            Assert.assertEquals(157, CountLoc.directorySearch("phy", listFiles));
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    public void deberiaRealizarConteoLocDirectorySearch() {
        try {
            File files = new File("src");
            File[] listFiles = files.listFiles();
            Assert.assertEquals(122, CountLoc.directorySearch("loc", listFiles));
        } catch (Exception e) {
            fail();
        }
    }
}
