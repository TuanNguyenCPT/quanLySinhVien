package B8;

/**
 * Lóp nào mô tả thông tin sinh viên
 *
 * @author tuann
 */
public class Student {
    // Các thuộc tính
    private String id;      // mã sinh viên
    private FullName fullName;  // tên đầy đủ
    private String address;     // địa chỉ
    private String email;       //địa chỉ email
    private String phone;      // số điện thoại
    private String sex;         // giới tính
    private String className;   // tên lớp đang học
    private String major;       // chuyên ngành

    // Constructor


    public Student() {
        id = "";
        fullName = new FullName();
        address = "";
        email = "";
        phone = "";
        sex = "";
        className = "";
        major = "";
    }

    public Student(String id, String fullName, String address, String email, String phone, String sex,
                   String className, String major) {
        this.id = id;
        setFullName(fullName);
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.sex = sex;
        this.className = className;
        this.major = major;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName.firstName + " "+ fullName.midName+ " "+ fullName.lastName ;
    }

    /**
     * tách fullname gán các giá trị vào first, last, midname
     *
     * @param fullName nhập họ tên đầy đủ
     */
    public void setFullName(String fullName) {
        var words = fullName.split(" ");
        this.fullName.firstName = words[0];
        this.fullName.lastName = words[words.length - 1];
        this.fullName.midName = "";
        for (int i = 1; i < words.length - 1 ; i++) {
            this.fullName.midName += words[i];
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getFirst() {
        return fullName.firstName;
    }

    public String getLast() {
        return fullName.lastName;
    }

    public String getMid() {
        return fullName.midName;
    }

    // Các phương thức

    /**
     * Inner class chứa họ và tên sinh viên
     */
    public class FullName{
        public String firstName;    // Tên
        public String midName;      // Tên đệm
        public String lastName;     // Họ
    }
}
