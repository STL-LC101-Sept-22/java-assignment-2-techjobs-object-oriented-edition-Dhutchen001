package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void testSettingJobId() {
         Job testJobOne = new Job();
         Job testJobTwo = new Job();
         assertNotEquals(testJobTwo, testJobOne);
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        Job testJobThree = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(testJobThree.getName() != null);
        assertTrue(testJobThree.getEmployer() instanceof Employer);
        assertTrue(testJobThree.getLocation() instanceof Location);
        assertTrue(testJobThree.getPositionType() instanceof PositionType);
        assertTrue(testJobThree.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Product tester", testJobThree.getName());
        assertEquals("ACME", testJobThree.getEmployer().toString());
        assertEquals("Desert", testJobThree.getLocation().toString());
        assertEquals("Quality control", testJobThree.getPositionType().toString());
        assertEquals("Persistence", testJobThree.getCoreCompetency().toString());
    }

    @Test
    public void testJobsForEquality(){
        Job testJobFour = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job testJobFive = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertFalse(testJobFour.getId() == testJobFive.getId());
    }

}


