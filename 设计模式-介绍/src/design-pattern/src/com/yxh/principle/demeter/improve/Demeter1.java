package com.yxh.principle.demeter.improve;

import java.util.ArrayList;
import java.util.List;

/**
 * 迪米特法则
 */

//客户端
public class Demeter1 {
    public static void main(String[] args) {
        System.out.println("使用迪米特法则的改进");
        //创建了一个SchoolManager对象
        SchoolManager schoolManager = new SchoolManager();
        //输出了学院的员工id 和 学校总部的员工信息
        schoolManager.printAllEmpoyee(new CollegeManager());
    }
}

//学校总部员工
class Emplyee{
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

//学院的员工
class CollegeEmployee{
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

//管理学院员工的管理类
class CollegeManager{
    //返回学院的所有员工
    public List<CollegeEmployee> getAllEmployee(){
        List<CollegeEmployee> list = new ArrayList<>();
        for(int i=0;i<10;i++){
            CollegeEmployee emp = new CollegeEmployee();
            emp.setId("学院员工id= "+i);
            list.add(emp);
        }
        return list;
    }

    //输出学院员工的信息
    public void printEmployee(){
        List<CollegeEmployee> list1 = getAllEmployee();
        for(CollegeEmployee e : list1){
            System.out.println(e.getId());
        }
    }
}

//学校管理类
class SchoolManager{

    //返回学院总部的员工
    //Emplyee ：直接朋友
    public List<Emplyee> getAllEmployee(){
        List<Emplyee> list = new ArrayList<>();
        for(int i=0;i<5;i++){

            Emplyee emp = new Emplyee();
            emp.setId("学校总部员工id= "+i);
            list.add(emp);
        }
        return list;
    }
    //该方法完成输出学校总部和学院员工信息（id）
    //CollegeManager ：直接朋友
    void printAllEmpoyee(CollegeManager sub){
        System.out.println("----------分公司员工-----------");
        sub.printEmployee();

        //获取到学校总部员工
        List<Emplyee> list2 = this.getAllEmployee();
        System.out.println("------------学校总部员工------------");
        for(Emplyee e : list2){
            System.out.println(e.getId());
        }
    }
}


