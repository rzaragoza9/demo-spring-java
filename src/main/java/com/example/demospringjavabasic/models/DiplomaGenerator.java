package com.example.demospringjavabasic.models;

import com.example.demospringjavabasic.models.dto.CourseDTO;
import com.example.demospringjavabasic.models.dto.DiplomaDTO;
import com.example.demospringjavabasic.models.dto.StudentDTO;

import java.util.List;

public class DiplomaGenerator {

    public static DiplomaDTO generateDiploma(StudentDTO student){
        DiplomaDTO diploma = new DiplomaDTO();
        Double average = gerAverage(student);
        diploma.setStudent(student);
        diploma.setAverage(average);
        if(average < 9){
            diploma.setMessage("Diploma");
        }
        else{
            diploma.setMessage("Diploma ¡Felicidades!");
        }
        return diploma;
    }

    public static Double gerAverage(StudentDTO student){
        List<CourseDTO> courses = student.getCourses();
        Double average = 0.0;
        for(CourseDTO course : courses){
            average += course.getGrade();
        }
        average /= courses.size();
        return average;
    }
}
