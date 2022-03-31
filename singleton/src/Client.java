public class Client {

    public static void main(String[] args) {

        StudentNo SNo = StudentNo.getInstance();

        Student s1 = new Student();
        s1.setYear("2019");
        s1.setCollege("计算机学院");
        s1.setMajor("软件工程");
        s1.setGrade("7班");
        SNo.getStuNo(s1);

        Student s2 = new Student();
        s2.setYear("2019");
        s2.setCollege("信息学院");
        s2.setMajor("软件工程");
        s2.setGrade("8班");
        SNo.getStuNo(s2);

        Student s3 = new Student();
        s3.setYear("2019");
        s3.setCollege("计算机学院");
        s3.setMajor("软件工程");
        s3.setGrade("7班");
        SNo.getStuNo(s3);

        System.out.println("学生s1的学号:" + s1.getStuNo());
        System.out.println("学生s2的学号:" + s2.getStuNo());
        System.out.println("学生s3的学号:" + s3.getStuNo());
    }

}
