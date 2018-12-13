package yxc.bean.test;

import yxc.bean.ClassName;
import yxc.bean.Teacher;

import java.util.ArrayList;
import java.util.List;

public class FirstClass {
    public static Object getData(String type, ClassName className){
        if (type.equals("T1-P1")){
            return className.getStudents();
        }else if (type.equals("T2-P2")){
            return className.getTeachers();
        }
        return null;
    }
    public static <T> List<T> getDataByType(String type, Class<T> classType, ClassName className){
        if (type.equals("T1-P1")){
            return (List<T>)className.getTeachers();
        }else if (type.equals("T1-P2")){
            return (List<T>)className.getStudents();
        }else if (type.equals("T1-P3")){
             List<ClassName> classNameList=new ArrayList<>();
             classNameList.add(className);
            return (List<T>) classNameList;
        }
        return null;
    }
    public static <T> T getDataByTypeAndName(String type,Class<T> returnType,String name,Object currrentObject){
        if (type.equals("T1-P1")) {
            return (T) getDataTeacherByName(name,currrentObject,returnType);
        }else {
            return null;
        }
    }
    public static <T> T getDataTeacherByName(String name,Object object,Class<T> returnType){
        if(name.equals("name")){
            return (T)((Teacher) object).getName();
        }else if (name.equals("address")){
            return (T)((Teacher) object).getAddress();
        }else if (name.equals("age")){
            return (T)((Teacher) object).getAge();
        }else{
            return null;
        }
    }
}
