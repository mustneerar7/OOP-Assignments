// LAZY MAN'S WAY OF CREATING A CLASS
public class StudentAttendance implements Comparable<StudentAttendance>{
    private String rollNo;
    private String name;
    private String date;

    @Override
    public String toString() {
        return "StudentAttendance{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                '}';
    }

    public StudentAttendance(String rollNo, String name, String date) {
        this.rollNo = rollNo;
        this.name = name;
        this.date = date;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    // COMPARE TO IMPLEMENTED METHOD
    @Override
    public int compareTo(StudentAttendance o) {
        return 0;
    }
}
