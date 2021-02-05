package org.launchcode.techjobs_oo.Tests;

import org.launchcode.techjobs_oo.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest {
    Job test_job1;
    Job test_job2;

    @Before
    public void createJobObjects(){
        test_job1 = new Job();
        test_job2 = new Job();
    }

    @Test
    public void testSettingJobId(){
        assertTrue(test_job2.getId() - test_job1.getId() == 1);
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        Job test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("Product tester", test_job.getName());
        assertEquals("ACME", test_job.getEmployer().toString());
        assertTrue(test_job.getEmployer() instanceof Employer);
        assertEquals("Desert", test_job.getLocation().toString());
        assertTrue(test_job.getLocation() instanceof Location);
        assertEquals("Quality control", test_job.getPositionType().toString());
        assertTrue(test_job.getPositionType() instanceof  PositionType);
        assertEquals("Persistence", test_job.getCoreCompetency().toString());
        assertTrue(test_job.getCoreCompetency() instanceof CoreCompetency);
    }

    @Test
    public void testJobsForEquality(){
        Job equal_job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job equal_job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(equal_job1.equals(equal_job2));
    }

    @Test
    public void testJobsToString(){
        Job test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job test_job2 = new Job("Product tester", new Employer(""), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job test_job3 = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
        String testOutput1 = "\nID: " + test_job.getId() + "\nName: " + test_job.getName() + "\nEmployer: " + test_job.getEmployer() + "\nLocation: " + test_job.getLocation() + "\nPosition Type: " + test_job.getPositionType() + "\nCore Competency: " + test_job.getCoreCompetency() + "\n";
        String testOutput2 = "\nID: " + test_job2.getId() + "\nName: " + test_job2.getName() + "\nEmployer: Data not available" + "\nLocation: " + test_job2.getLocation() + "\nPosition Type: " + test_job2.getPositionType() + "\nCore Competency: " + test_job2.getCoreCompetency() + "\n";
        //test each field has a label and a value
        assertEquals(testOutput1, test_job.toString());
        //test "Data not available" for empty field
        assertEquals(testOutput2, test_job2.toString());
        //test error message if all fields (besides ID) are empty
        assertEquals("\nID: 5\nOOPS! This job does not seem to exist.", test_job3.toString());
        assertEquals(5, test_job3.getId());
    }

}
