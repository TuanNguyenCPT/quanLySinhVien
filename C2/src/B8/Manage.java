package B8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Lớp thực thi các thao tác quản lý sinh viên
 *
 * @author tuann
 */
public class Manage {
    public static void main(String[] args) {
        List<Course> courseList = new ArrayList<>();
        List<Student> studentList = new ArrayList<>();
        List<Subject> subjectList = new ArrayList<>();
        var input = new Scanner(System.in);
        int choose;
        do {
            System.out.println("======================MENU======================");
            System.out.println("Chọn chức năng bạn muốn: ");
            System.out.println("1. Thêm mới môn học vào danh sách môn học");
            System.out.println("2. Thêm mới sinh viên vào danh sách sinh viên");
            System.out.println("3. Thêm mới lớp học vào danh sách lớp học");
            System.out.println("4. Hiển thị danh sách môn học");
            System.out.println("5. Hiển thị danh sách sinh viên");
            System.out.println("6. Hiển thị danh sách lớp học theo mã lớp");
            System.out.println("7. Tính điểm trung bình cho từng sinh viên trong lớp");
            System.out.println("8. Xét học lực cho từng sinh viên trong danh sách");
            System.out.println("9. Tìm sinh viên theo mã số sinh viên");
            System.out.println("0. Thoát chương trình");
            choose = input.nextInt();
            input.nextLine();   // loại bỏ kí tự enter thừa
            switch (choose) {
                case 0: //
                    System.out.println("Cảm ơn  bạn đã sử dụng chương trình");
                    break;
                case 1:
                    var subject = createNewSubject(input);
                    subjectList.add(subject);
                    System.out.println(" Thêm môn học thành công ");
                    break;
                case 2:
                    var student = createNewStudent(input);
                    studentList.add(student);
                    System.out.println("Đã thêm sinh viên mới thành công");
                    break;
                case 3:
                    if (subjectList.size()>0) {
                        var course = createNewCourse(subjectList, input);
                        if(course!=null){
                            courseList.add(course);
                            System.out.println("Thêm khóa học thành công");
                        }
                        else
                            System.out.println("Thêm khóa học thất bại");
                    }
                    else {
                        System.out.println("Danh sách môn học trống");
                    }
                    break;
                case 4:
                    break;
                case 5:
                    showSubjectList(subjectList);
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
                default:
                    System.out.println("Chọn sai, vui lòng chọn lại");
                    break;
            }
        } while (choose != 0);

    }

    private static void showSubjectList(List<Subject> subjectList) {
        
    }

    /**
     * Hàm tạo một lớp học mới từ danh sách môn học có sẵn, bảng điểm tạo sau
     * @param subjectList danh sách các môn học
     * @param input Scanner
     * @return khóa học mới nếu thành công, null nếu không thành công
     */
    private static Course createNewCourse(List<Subject> subjectList, Scanner input) {
//        id = "";
//        name = "";
//        room = "";
//        time = 0;
//        subject = null;
//        transcriptOfStudents = new ArrayList<>();
        System.out.println("Mã khóa học: ");
        var id = input.nextLine();
        System.out.println("Tên khóa học: ");
        var name = input.nextLine();
        System.out.println("Phòng học: ");
        var room = input.nextLine();
        System.out.println("Thời gian học: ");
        var time = input.nextFloat();
        input.nextLine();
        System.out.println("Mã môn học: ");
        var subjectId = input.nextLine();
        var subject = searchSubjectById(subjectList, subjectId);

        if (subject == null){
            System.out.println("Không tồn tại môn học có ID là: "+subjectId);
            return null;
        }
        else {
            Course course = new Course(id, name,room,time,subject);
            return course;
        }
    }

    /**
     * Hàm tìm kiếm môn học theo ID
     * @param subjectList danh sách các môn học
     * @param subjectId id của môn học muốn tìm
     * @return  môn học muốn tìm hoặc null nếu không tìm thấy
     */
    private static Subject searchSubjectById(List<Subject> subjectList, String subjectId) {
        for (var subject : subjectList) {
            if (subject.getId().compareTo(subjectId) == 0){
                return subject;
            }
        }
        return null;
    }

    /**
     * Hàm tạo thêm một sinh viên mới
     * @param input Scanner
     * @return  Sinh viên mới tạo
     */
    private static Student createNewStudent(Scanner input) {
        System.out.println("Nhập mã số sinh viên");
        var id = input.nextLine();
        System.out.println("Tên đầy đủ sinh viên: ");
        var fullName = input.nextLine();
        System.out.println("Địa chỉ sinh viên: ");
        var address = input.nextLine();
        System.out.println("Email: ");
        var email = input.nextLine();
        System.out.println("phone: ");
        var phone = input.nextLine();
        System.out.println("sex: ");
        var sex = input.nextLine();
        System.out.println("lớp: ");
        var className = input.nextLine();
        System.out.println("Khoa: ");
        var major = input.nextLine();

        Student student = new Student(id, fullName, address, email, phone, sex, className, major);
        return student;
    }

    /**
     * Hàm thêm 1 môn học
     * @param input Scanner
     * @return môn học mới
     */
    private static Subject createNewSubject(Scanner input) {
        System.out.println("Nhập mã môn học");
        var id = input.nextLine();
        System.out.println("Nhập tên môn học");
        var name = input.nextLine();
        System.out.println("Nhập số tín chỉ");
        var credit = input.nextFloat();
        System.out.println("Nhập số tiết học");
        var numOfLesson = input.nextFloat();
        System.out.println("Nhập số bài kiểm tra");
        var numOfExam = input.nextInt();

        Subject subject = new Subject(id, name, credit, numOfLesson, numOfExam);
        return subject;
    }
}
