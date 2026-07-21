package com.wipro.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.wipro.task.DailyTasks;

public class TestCheckPresence {

    @Test
    public void testCheckPresenceTrue() {

        DailyTasks dt = new DailyTasks();

        boolean result = dt.checkPresence("Wipro Technologies", "Tech");

        System.out.println("Contains 'Tech' : " + result);

        assertTrue(result);
    }

    @Test
    public void testCheckPresenceFalse() {

        DailyTasks dt = new DailyTasks();

        boolean result = dt.checkPresence("Wipro Technologies", "Java");

        System.out.println("Contains 'Java' : " + result);

        assertFalse(result);
    }
}