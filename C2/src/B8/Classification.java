package B8;

public enum Classification {
    F("Trượt môn"), D("Yếu"), C("Trung bình"), B("Khá"),
    A("Giỏi"), A_plus("Xuất sắc");

    Classification(String value) {
        this.value = value;
    }

    private String value;

    public String getValue() {
        return value;
    }
}
