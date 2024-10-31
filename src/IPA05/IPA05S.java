package IPA05;

public class IPA05S {
    public  static  void main(String [] args){

    }
    public static  int findAvgOfQuizByAdmin(Course [] course,String courseAdmin){
        return 0;
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