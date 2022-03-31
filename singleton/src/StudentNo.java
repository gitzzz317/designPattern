
import java.util.ArrayList;

public class StudentNo {
    private static StudentNo studentNo;
    private int No = 1;
    private String StuNo = null;
    private String StuNoNo = null;
    private ArrayList list = new ArrayList();

    public synchronized static StudentNo getInstance() {
        if (studentNo == null) {
            studentNo = new StudentNo();
        }
        return studentNo;
    }

    public synchronized String getStuNo(Student s) {
        //入学学年（2位）+学院代码（2位）+专业代码（2位）+班级代码（2位）+序号（2位）
        s.getYear();
        String year = s.getYear().substring(2);
        //假设计算机学院代码为00 信息学院代码为01 ...
        String College = null;
        s.getCollege();
        switch (s.getCollege()) {
            case "计算机学院":
                College = "00";
                break;
            case "信息学院":
                College = "01";
                break;
        }
        //假设软件工程代码为00 网络工程代码为01 ...
        s.getMajor();
        String Major = null;
        switch (s.getMajor()) {
            case "软件工程":
                Major = "00";
                break;
            case "网络工程":
                Major = "01";
                break;
        }
        //获取班级代码号
        String Grade = String.format("%02d", Integer.parseInt(s.getGrade().substring(0, 1)));
        StuNoNo = year + College + Major + Grade;


        for (int i = 0; i < list.size(); i++) {
            String a = ((String) list.get(i)).substring(0, 8);
            if (a.equals(StuNoNo)) {
                No++;
            }
        }
        String NoStr = String.format("%02d", No);
        StuNo = StuNoNo + NoStr;
        list.add(StuNo);
        s.setNo(NoStr);
        s.setStuNo(StuNo);
        return StuNo;
    }
}
