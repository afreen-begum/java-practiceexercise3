package com.stackroute.pe3;

public class StudentGrades {
    int numOFStudents;
    int stuGrades[] = new int[numOFStudents];
    int sum=0, avg=0;
    public String studentsGradesCheck(int numOfStudents, int stuGrades[]){

        if( stuGrades.length == 0)
            return null;

        this.numOFStudents = numOfStudents;
        this.stuGrades = stuGrades;

        for (int i=0; i< numOfStudents; i++) {
            sum = sum + stuGrades[i];
            avg = sum/numOfStudents;
        }


        if(avg > 0 && avg < 100)
            return "within range";

        else {

            throw new ArithmeticException("Out of range");
        }


    }

    }
