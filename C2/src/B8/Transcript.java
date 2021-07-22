package B8;

/**
 * Lớp này mô tả thông tin bảng điểm
 *
 * @author tuann
 */
public class Transcript {
    // thuộc tính
    private String id;
    private float grade1;
    private float grade2;
    private float grade3;
    private float avgMark;
    private Classification classification;

    // Constructor

    public Transcript() {
    }

    public Transcript(String id, float grade1, float grade2, float grade3, float avgMark, Classification classification) {
        this.id = id;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
        this.avgMark = avgMark;
        this.classification = classification;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getGrade1() {
        return grade1;
    }

    public void setGrade1(float grade1) {
        this.grade1 = grade1;
    }

    public float getGrade2() {
        return grade2;
    }

    public void setGrade2(float grade2) {
        this.grade2 = grade2;
    }

    public float getGrade3() {
        return grade3;
    }

    public void setGrade3(float grade3) {
        this.grade3 = grade3;
    }

    public float getAvgMark() {
        return avgMark;
    }

    public void setAvgMark(float avgMark) {
        this.avgMark = avgMark;
    }

    public Classification getClassification() {
        return classification;
    }

    public void setClassification(Classification classification) {
        this.classification = classification;
    }
    // phương thức

    /**
     * tính điểm trung bình
     */
    public void calculAvgMark() {
        this.avgMark = (grade1 + grade2 * 2 + grade3 * 3) / 6;
    }

    /**
     * phương thức dùng để xét học lực
     */
    public void ability() {
        if (avgMark>=9.0f)
            classification = Classification.A_plus;
        else if(avgMark>=8f)
            classification = Classification.A;
        else if(avgMark>=6.5f)
            classification = Classification.B;
        else if (avgMark>=5f)
            classification = Classification.C;
        else if (avgMark>=4f)
            classification = Classification.D;
        else
            classification = Classification.F;
    }
}
