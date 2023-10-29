package com.example.demo.infraestrcture;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.CourseAssessmentDetails;

public interface CourseAssessmentDetailsRepository extends JpaRepository<CourseAssessmentDetails,Long> {

}
