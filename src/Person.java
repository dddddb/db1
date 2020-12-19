public class Person {
    private  String name;
    private  int age;
    private int shengao;
    private String college;
    private  boolean hunyin;
    private  int phone;

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return
                " name " + name + '\n' +
                " age " + age + '\n' +
                " shengao " + shengao + '\n' +
                " college " + college + '\n' +
                " hunyin " + hunyin +'\n' +
                " phone " + phone;
    }

    public Person() {
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age, int shengao, String college, boolean hunyin, int phone) {
        this.name = name;
        this.age = age;
        this.shengao = shengao;
        this.college = college;
        this.hunyin = hunyin;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getShengao() {
        return shengao;
    }

    public void setShengao(int shengao) {
        this.shengao = shengao;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public boolean isHunyin() {
        return hunyin;
    }

    public void setHunyin(boolean hunyin) {
        this.hunyin = hunyin;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
    public static void showInfo(String name, int age, int shengao, String college, boolean hunyin, int phone){
        System.out.println("name " + name);
        System.out.println("age " +age);
        System.out.println("shengao " + shengao);
        System.out.println("college " +college);
        System.out.println("hunyin " +hunyin);
        System.out.println("phone " + phone);
    }

}
