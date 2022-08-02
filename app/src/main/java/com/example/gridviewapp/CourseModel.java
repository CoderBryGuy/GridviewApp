package com.example.gridviewapp;

public class CourseModel {
    private String mCourseName;
    private int mCourseImg;

    public CourseModel(String courseName, int courseImg) {
        mCourseName = courseName;
        mCourseImg = courseImg;
    }

    public String getCourseName() {
        return mCourseName;
    }

    public void setCourseName(String courseName) {
        mCourseName = courseName;
    }

    public int getCourseImg() {
        return mCourseImg;
    }

    public void setCourseImg(int courseImg) {
        mCourseImg = courseImg;
    }
}
