package B8;

import java.util.ArrayList;
import java.util.List;

/**
 * Lớp này chứa thông tin về khóa học
 *
 * @author tuann
 */
public class Course {
    // Thuộc tính
    private String id;          // mã môn học
    private String name;        // Tên môn học
    private String room;        // phòng học
    private float time;         // số giờ học
    private Subject subject;    // Môn học
    private List<TranscriptOfStudent> transcriptOfStudents;  // danh sách bảng điểm và sinh viên ứng với môn học

    // Constructor


    public Course() {
        id = "";
        name = "";
        room = "";
        time = 0;
        subject = null;
        transcriptOfStudents = new ArrayList<>();
    }

    public Course(String id, String name, String room, float time, Subject subject) {
        this.id = id;
        this.name = name;
        this.room = room;
        this.time = time;
        this.subject = subject;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public float getTime() {
        return time;
    }

    public void setTime(float time) {
        this.time = time;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    // Phương thức


    public List<TranscriptOfStudent> getTranscriptOfStudents() {
        return transcriptOfStudents;
    }

    /**
     * thêm bảng điểm cho sinh viên trong danh sách bảng điểm
     * @param transcript bảng điểm của sinh viên tương ứng
     * @param student sinh viên đã có trong lớp học
     */
   public void setTranscriptOfStudents(Transcript transcript, Student student) {
       for (int i = 0; i < transcriptOfStudents.size(); i++) {
           if (transcriptOfStudents.get(i).student.getId().compareTo(student.getId()) == 0){
                transcriptOfStudents.get(i).transcript = transcript;
                break;
           }
       }
   }

    /**
     * Phương thức thêm sinh viên( không kèm theo bảng điểm) vào khóa học
     * @param student sinh viên được add vào course
     */
   public void addStudentToCourse(Student student) {
        transcriptOfStudents.add(new TranscriptOfStudent(student, null));
   }



    /**
     * Inner class mô tả bảng điểm môn học
     */
    public class TranscriptOfStudent{
        private Student student;
        private Transcript transcript;

        public TranscriptOfStudent() {
        }

        public TranscriptOfStudent(Student student, Transcript transcript) {
            this.student = student;
            this.transcript = transcript;
        }

        public Student getStudent() {
            return student;
        }

        public Transcript getTranscript() {
            return transcript;
        }
    }

}
