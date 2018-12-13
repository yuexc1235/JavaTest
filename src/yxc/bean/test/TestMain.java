package yxc.bean.test;

import yxc.bean.ClassName;
import yxc.bean.Student;
import yxc.bean.Teacher;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Class.forName;

public class TestMain {
    public static void main(String[] args) throws ClassNotFoundException {

//        List<Student> students = new ArrayList<Student>();
////        for (int i = 0; i < 10; i++) {
////            Student student=new Student();
////            student.setAge(11+i*10);
////            student.setName("zhangsan"+i);
////            student.setNumber("0"+i);
////            students.add(student);
////        }
        List<Teacher> teachers = new ArrayList<Teacher>();
        for (int i = 0; i <20 ; i++) {
            Teacher teacher = new Teacher();
            teacher.setAddress("北京胡同"+i+"号");
            teacher.setName("杨菊红"+i);
           // teacher.setAge(33);
            teachers.add(teacher);
        }
        ClassName className = new ClassName();
        className.setName("1班");
       // className.setStudents(students);
        className.setTeachers(teachers);
        String studentPackage="yxc.bean.Student.Class";
         FirstClass.getData("T1-P1",className);

        Object dataByType = FirstClass.getDataByType("T1-P1", forName("yxc.bean.Teacher"), className);

        if (dataByType instanceof List){
           Object S1=((List) dataByType).get(0);
           if (S1 instanceof Student){
               System.out.println("打印我");
           }else if (S1 instanceof  Teacher){

               for (Teacher teacher2:(List<Teacher>)dataByType){
                   Object dataTeacherByName = FirstClass.getDataTeacherByName("name", teacher2, forName("java.lang.String"));
                   System.out.println(dataTeacherByName.toString());
                   Object dataTeacherByName1 = FirstClass.getDataTeacherByName("age", teacher2, forName("java.lang.Integer"));
                   if (dataTeacherByName1==null){
                       System.out.println("年龄为空");
                   }else {
                       System.out.println(dataTeacherByName1.toString());
                   }

               }
               System.out.println("打印你");
           }
       }else if (dataByType instanceof Student){
           System.out.println("打印他");
       }

        List<Teacher> teachers1=(List<Teacher>)dataByType;
       for (Teacher vteacher:teachers1){
           System.out.println(vteacher.toString());
       }
       Object dataByType2 = FirstClass.getDataByType("T1-P2", forName("yxc.bean.Student"), className);
        if (dataByType2!=null && !((List) dataByType2).isEmpty()){
            if (dataByType2 instanceof List){
                Object S1=((List) dataByType2).get(0);
                if (S1 instanceof Student){
                    System.out.println("打印我0");
                }else if (S1 instanceof  Teacher){
                    System.out.println("打印你0");
                }
            }
        }else {
            System.out.println("空值");
        }


    }
}
