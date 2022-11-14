import OrganizationComponent.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;


public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {

//        Cjf20200440730OrganizationComponent StudyAffair = new Cjf20200440730Affair("教务部");
        //学院
        Cjf20200440730OrganizationComponent ComputerCollege = new Cjf20200440730College("计算机学院");
        Cjf20200440730OrganizationComponent MechanicalCollege = new Cjf20200440730College("机械工程学院");
        //学院下的系
        Cjf20200440730OrganizationComponent SoftWareDepartment = new Cjf20200440730Deapartmant("软件工程系");
        Cjf20200440730OrganizationComponent AIDepartment = new Cjf20200440730Deapartmant("人工智能系");
        Cjf20200440730OrganizationComponent MechanicalDepartment = new Cjf20200440730Deapartmant("机械系");
        Cjf20200440730OrganizationComponent ActiveDepartment = new Cjf20200440730Deapartmant("能动系");
        //系的学生
        Cjf20200440730OrganizationComponent s1 = new Cjf20200440730Student("张三");
        Cjf20200440730OrganizationComponent s2 = new Cjf20200440730Student("李四");
        Cjf20200440730OrganizationComponent s3 = new Cjf20200440730Student("王二");
        Cjf20200440730OrganizationComponent s4 = new Cjf20200440730Student("刘俊");
        Cjf20200440730OrganizationComponent s5 = new Cjf20200440730Student("李晓");
        Cjf20200440730OrganizationComponent s6 = new Cjf20200440730Student("赵慧");
        Cjf20200440730OrganizationComponent s7 = new Cjf20200440730Student("王芳");
        Cjf20200440730OrganizationComponent s8 = new Cjf20200440730Student("夏骏");
        Cjf20200440730OrganizationComponent s9 = new Cjf20200440730Student("王枫");

//        StudyAffair.add(ComputerCollege);
//        StudyAffair.add(MechanicalCollege);

        ComputerCollege.add(SoftWareDepartment);
        ComputerCollege.add(AIDepartment);

        MechanicalCollege.add(MechanicalDepartment);
        MechanicalCollege.add(ActiveDepartment);


        SoftWareDepartment.add(s1);
        SoftWareDepartment.add(s2);
        SoftWareDepartment.add(s3);

        AIDepartment.add(s4);
        AIDepartment.add(s5);

        MechanicalDepartment.add(s6);
        MechanicalDepartment.add(s7);

        ActiveDepartment.add(s8);
        ActiveDepartment.add(s9);

//        StudyAffair.print();


        Properties pro = new Properties();
        pro.load(new FileInputStream("C:\\Users\\TEARS\\IdeaProjects\\demo\\ComposeMode\\src\\OrganizationComponent\\node.properties"));
        //反射获取配置文件
        String classname = pro.getProperty("classname");
        String s = "OrganizationComponent.";
        String cn = s + classname;
        Class clz = Class.forName(cn);
        Constructor constructor = clz.getConstructor(String.class);
        Object Obj = constructor.newInstance("教务处");


        Method sendMessageMethod = clz.getDeclaredMethod("SendMessage", String.class);
        Method add = clz.getDeclaredMethod("add", Cjf20200440730OrganizationComponent.class);
        Method print = clz.getDeclaredMethod("print");
        add.invoke(Obj, ComputerCollege);
        add.invoke(Obj, MechanicalCollege);
        print.invoke(Obj);

        sendMessageMethod.invoke(Obj, "期末考试安排已上传，可登陆教务在线查看");
        //教务处发布消息，所有学生可以收到
//        StudyAffair.SendMessage("明天放假！");
        //机械系发布消息，机械系的学生接受消息
        MechanicalDepartment.SendMessage("后天金工实习内容：磨锤子");
        s1.Message();
        s2.Message();
        s5.Message();
        s6.Message();
        s7.Message();


    }
}