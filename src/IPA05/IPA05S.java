package IPA05;

import java.util.*;

public class IPA05S {
    public  static  void main(String [] args){

    }
    public static  int findAvgOfQuizByAdmin(Course [] course,String courseAdmin){
       int sum = 0;
       int count = 0;
        for (int i = 0; i < course.length; i++) {
            if(course[i].getCourseAdmin().equals(courseAdmin)){
                sum += course[i].getQuiz();
                count++;
            }
        }
        int average = (sum / count);

        if (average < 0 ){
            return 0;
        }
        else return average;
    }

    public static Course[] sortCourseByHandsOn(Course [] course , int handson){
        ArrayList<Course> arr = new ArrayList<>();

        for (int i = 0; i < course.length; i++) {
            if(course[i].getHandson() < handson){
                arr.add(course[i]);
            }
        }
        Collections.sort(arr, Comparator.comparingInt(Course::hashCode));
        Course[] result = arr.toArray(new Course[0]);
        if (arr.isEmpty()){
            return null;
        }
        else return result;
    }
}

class Course {
    private int courseId;
    private String courseName;
    private String courseAdmin;
    private int quiz;
    private int handson;

    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseAdmin() {
        return courseAdmin;
    }

    public int getQuiz() {
        return quiz;
    }

    public int getHandson() {
        return handson;
    }

    public Course(int courseId,String courseName,String CourseAdmin,int quiz,int handson){
        this.courseId = courseId;
        this.courseName= courseName;
        this.courseAdmin = CourseAdmin;
        this.quiz = quiz;
        this.handson = handson;
    }
}