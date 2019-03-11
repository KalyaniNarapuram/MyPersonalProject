package mylove.programming;

public class MyMainClass {

    public static void main(String[] args) {

        Practise pObj = new Practise();
        Practise pObj1 = new Practise();

        pObj.setfName("MyName");
        pObj1.setfName("MyHubbee");

        System.out.println(pObj.getfName() + pObj1.getfName());

        pObj.setlName("Katta");
        pObj1.setlName("Narap");

        System.out.println(pObj.getlName() + pObj1.getlName());

        pObj.setAge(35);
        pObj1.setAge(40);

        System.out.println(pObj.getAge() + pObj1.getAge());

        }
}

