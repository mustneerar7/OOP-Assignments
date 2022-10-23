import java.util.Comparator;

public class NameComparator implements Comparator<StudentAttendance> {

    @Override
    public int compare(StudentAttendance o1, StudentAttendance o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
