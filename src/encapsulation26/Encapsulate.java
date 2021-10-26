package encapsulation26;

public class Encapsulate {
    private String name;
    private int rollNo;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String Name) {
        this.name = name;

    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static class TestEncapsulation {
        public static void main(String[] args) {
            Encapsulate obj = new Encapsulate();
            obj.setName("Kishan");
            obj.setAge(25);
            obj.setRollNo(56);

            System.out.println("Prime's name: " + obj.getName());
            System.out.println("Prime's age: " + obj.getAge());
            System.out.println("Prime's rollNo: " + obj.getRollNo());
        }
    }


}
