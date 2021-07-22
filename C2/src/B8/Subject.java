package B8;

/**
 * Lớp này chứa thông tin về môn học
 *
 * @author tuann
 */
public class Subject {
    // Các thuộc tính
    private String id;      // mã môn học
    private String name;    // tên môn học
    private float credit;   // số tín chỉ
    private float numOfLesson;  // số tiết học
    private int numOfExam;  // số bài kiểm tra

    // Các constructor


    public Subject() {
        id = "";
        name = "";
        credit = 0;
        numOfLesson = 0;
        numOfExam = 0;
    }

    public Subject(String id) {
        this.id = id;
    }

    public Subject(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Subject(String id, String name, float credit) {
        this.id = id;
        this.name = name;
        this.credit = credit;
    }

    public Subject(String id, String name, float credit, float numOfLesson) {
        this.id = id;
        this.name = name;
        this.credit = credit;
        this.numOfLesson = numOfLesson;
    }

    public Subject(String id, String name, float credit, float numOfLesson, int numOfExam) {
        this.id = id;
        this.name = name;
        this.credit = credit;
        this.numOfLesson = numOfLesson;
        this.numOfExam = numOfExam;
    }

    // getter and setter

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

    public float getCredit() {
        return credit;
    }

    public void setCredit(float credit) {
        this.credit = credit;
    }

    public float getNumOfLesson() {
        return numOfLesson;
    }

    public void setNumOfLesson(float numOfLesson) {
        this.numOfLesson = numOfLesson;
    }

    public int getNumOfExam() {
        return numOfExam;
    }

    public void setNumOfExam(int numOfExam) {
        this.numOfExam = numOfExam;
    }

    // Các phương thức


}
