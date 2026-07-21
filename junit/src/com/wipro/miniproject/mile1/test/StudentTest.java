package com.mile1.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StudentTest {

    StudentReport report;
    StudentService service;

    @Before
    public void setUp() {
        report = new StudentReport();
        service = new StudentService();
    }

    @Test
    public void test01GradeA() throws Exception {
        Student s = new Student("Ram", new int[] {80,80,80});
        report.validate(s);
        System.out.println("TC1 : Grade A = " + report.findGrades(s));
        assertEquals("A", report.findGrades(s));
    }

    @Test
    public void test02GradeD() throws Exception {
        Student s = new Student("Ravi", new int[] {60,60,60});
        report.validate(s);
        System.out.println("TC2 : Grade D = " + report.findGrades(s));
        assertEquals("D", report.findGrades(s));
    }

    @Test
    public void test03GradeF() throws Exception {
        Student s = new Student("John", new int[] {90,20,90});
        report.validate(s);
        System.out.println("TC3 : Grade F = " + report.findGrades(s));
        assertEquals("F", report.findGrades(s));
    }

    @Test(expected = NullStudentObjectException.class)
    public void test04NullObject() throws Exception {
        System.out.println("TC4 : Null Student Object");
        report.validate(null);
    }

    @Test(expected = NullNameException.class)
    public void test05NullName() throws Exception {
        System.out.println("TC5 : Null Name");
        report.validate(new Student(null, new int[] {80,80,80}));
    }

    @Test(expected = NullMarksArrayException.class)
    public void test06NullMarks() throws Exception {
        System.out.println("TC6 : Null Marks Array");
        report.validate(new Student("Ram", null));
    }

    @Test
    public void test07NullNamesCount() {
        Student[] s = {
            new Student("Ram", new int[] {80,80,80}),
            new Student(null, new int[] {80,80,80}),
            new Student("Ravi", new int[] {80,80,80}),
            null
        };
        System.out.println("TC7 : Null Names = " + service.findNumberOfNullNames(s));
        assertEquals(1, service.findNumberOfNullNames(s));
    }

    @Test
    public void test08NullObjectsCount() {
        Student[] s = {
            new Student("Ram", new int[] {80,80,80}),
            null,
            new Student("Ravi", new int[] {80,80,80}),
            null
        };
        System.out.println("TC8 : Null Objects = " + service.findNumberOfNullObjects(s));
        assertEquals(2, service.findNumberOfNullObjects(s));
    }

    @Test
    public void test09NullMarksCount() {
        Student[] s = {
            new Student("Ram", null),
            new Student("Ravi", new int[] {80,80,80}),
            new Student("John", null),
            null
        };
        System.out.println("TC9 : Null Marks Arrays = " + service.findNumberOfNullMarksArray(s));
        assertEquals(2, service.findNumberOfNullMarksArray(s));
    }
}