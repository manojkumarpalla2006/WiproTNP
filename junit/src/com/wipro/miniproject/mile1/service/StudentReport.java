package com.mile1.service;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;

public class StudentReport {

    public String findGrades(Student studentObject) {

        int[] marks = studentObject.getMarks();

       
        for (int mark : marks) {
            if (mark < 35) {
                return "F";
            }
        }

        int sum = 0;

        for (int mark : marks) {
            sum += mark;
        }

        if (sum >= 240)
            return "A";
        else
            return "D";
    }

    public String validate(Student s)
            throws NullNameException, NullMarksArrayException,
            NullStudentObjectException {

        if (s == null)
            throw new NullStudentObjectException();

        if (s.getName() == null)
            throw new NullNameException();

        if (s.getMarks() == null)
            throw new NullMarksArrayException();

        return "VALID";
    }
}