package IPA05;

import java.util.*;

public class IPA05S {
    public  static  void main(String [] args){
    Scanner sc = new Scanner(System.in);
    Course [] arr = new Course[4];
        for (int i = 0; i < arr.length; i++) {
            int courseId = sc.nextInt();sc.nextLine();
            String courseName = sc.nextLine();
            String courseAdmin = sc.nextLine();
            int quiz = sc.nextInt();sc.nextLine();
            int handson = sc.nextInt();sc.nextLine();

            arr[i] = new Course(courseId,courseName,courseAdmin,quiz,handson);
        }

        String courseAdmin = sc.nextLine();
        int handson = sc.nextInt();sc.nextLine();
        int averageQuiz = findAvgOfQuizByAdmin(arr,courseAdmin);
        if(averageQuiz > 0 ){
            System.out.println(averageQuiz);
        }else {
            System.out.println("No Course found.");
        }

        Course [] result = sortCourseByHandsOn(arr,handson);
        if(result != null){
            for (int i = 0; i < result.length; i++) {
                System.out.println(result[i].getCourseName());
            }
        }else {
            System.out.println("No Course found with mentioned attribute.");
        }

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
        int average = 0;
        if(count != 0 ){
             average = (sum / count);
        }

        if (average > 0 ){
            return average;
        }
        else return 0;
    }

    public static Course[] sortCourseByHandsOn(Course [] course , int handson){
        Course [] arr2 = new Course[0];

        for (int i = 0; i < course.length; i++) {
            if(course[i].getHandson() < handson){
                arr2 = Arrays.copyOf(arr2,arr2.length + 1 );
                arr2[arr2.length - 1 ] = course[i];
            }
        }
        Course val;
        for (int i = 0; i < arr2.length; i++) {
            for (int j = i + 1; j < arr2.length ; j++) {

                if(arr2[i].getHandson() > arr2[j].getHandson() ){
                    val = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = val;
                }
            }

            
        }

        if (arr2.length > 0 ){
            return arr2;
        }
        else return null;
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