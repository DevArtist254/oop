public class Student {
    private String studentName;
    private String yearOfBirth;
    private String studentId;
    private String classJoined;

    public Student(String studentName, String yearOfBirth, String studentId, String classJoined) {
        this.studentName = studentName;
        this.yearOfBirth = yearOfBirth;
        this.studentId = studentId;
        this.classJoined = classJoined;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", yearOfBirth='" + yearOfBirth + '\'' +
                ", studentId='" + studentId + '\'' +
                ", classJoined='" + classJoined + '\'' +
                '}';
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(String yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getClassJoined() {
        return classJoined;
    }

    public void setClassJoined(String classJoined) {
        this.classJoined = classJoined;
    }
}
