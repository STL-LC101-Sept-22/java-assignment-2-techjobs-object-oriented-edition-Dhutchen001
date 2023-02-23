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

    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        Job testJobFive = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String stringTestJobFive = testJobFive.toString();

        assertEquals('\n', stringTestJobFive.charAt(0));
        assertEquals('\n', stringTestJobFive.charAt(testJobFive.toString().length() - 1));

    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job testJobSix = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals("\nID: "+testJobSix.getId()+"\nName: Product tester"+"\nEmployer: ACME"+
                "\nLocation: Desert"+"\nPosition Type: Quality control" + "\nCore Competency: Persistence\n", testJobSix.toString());
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job testJobSeven= new Job("Product tester", new Employer(), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals("\nID: "+testJobSeven.getId()+"\nName: Product tester"+"\nEmployer: Data not available"+
                "\nLocation: Desert"+"\nPosition Type: Quality control" + "\nCore Competency: Persistence\n", testJobSeven.toString());
    }

    @Test
    public void testToStringReturnsMessageIfAllFieldsBlank() {
        Job testJobEight = new Job();
        assertEquals("OOPS! This job does not seem to exist.", testJobEight.toString());
    }
}


