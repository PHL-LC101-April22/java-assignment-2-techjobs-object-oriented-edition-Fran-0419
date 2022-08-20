package org.launchcode.techjobs.oo.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();

        try {
            assertNotEquals(job1.getId(),job2.getId());

        }catch (AssertionError err){
            fail("Objects are equal");
        }
    }
    @Test
    public void testJobConstructorSetsAllFields() {
        Job theJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job x = theJob;


            Assert.assertTrue(theJob.equals(x));
            Assert.assertEquals(theJob.getName(), x.getName());

            Assert.assertTrue(theJob.getEmployer().getValue() == "ACME" );
            Assert.assertEquals(theJob.getEmployer().getValue(),x.getEmployer().getValue());

            Assert.assertTrue(theJob.getName() == x.getName());
            Assert.assertEquals(theJob.getEmployer().getValue(), x.getEmployer().toString());

            Assert.assertTrue(theJob.getPositionType().getId() == 1);
            Assert.assertEquals(theJob.getEmployer().getValue(),"ACME");

            Assert.assertTrue(theJob.getName() == "Product tester");
            Assert.assertEquals(theJob.getLocation().getValue(),theJob.getLocation().toString());

            Assert.assertTrue(theJob.getId() == 1);
            Assert.assertEquals(theJob.getCoreCompetency().getId(), 1);

    }

    @Test
    public void testJobsForEquality(){
        Job theJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job theJob2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        Assert.assertFalse(theJob1.equals(theJob2));
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        Job theJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        char a = theJob1.toString().charAt(0);
        char b = theJob1.toString().charAt(theJob1.toString().length()-1);
        assertEquals(a, '\n');
        assertEquals( b , '\n');


    }


    @Test
    public void testToStringContainsCorrectLabelsAndData(){
        Job theJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        ArrayList<String> y = new ArrayList<String>(Arrays.asList("ID:", "Name:", "Employer:" ,"Location:", "Position Type:" ,"Core Competency:"));

        Assert.assertTrue(theJob1.toString().contains("1"));
        Assert.assertTrue(theJob1.toString().contains("Product tester"));
        Assert.assertTrue(theJob1.toString().contains("ACME"));
        Assert.assertTrue(theJob1.toString().contains("Desert"));
        Assert.assertTrue(theJob1.toString().contains("Quality control"));
        Assert.assertTrue(theJob1.toString().contains("Persistence"));



    }
    @Test
    public void testToStringHandlesEmptyField(){
        Job myJob = new Job();
        myJob.toString();
        assertEquals(myJob.getId(),1);
    }

}




