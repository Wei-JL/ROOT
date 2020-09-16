package team.service;

import team.domain.*;

import static team.service.Data.*;

/**
 * 负责将Data中的数据封装到Employee[]数组中，同时提供相关操作Employee[]的方法
 */

public class NameListService {
    private Employee[] employees;

    public NameListService(){
    employees  =new Employee[EMPLOYEES.length];
        for (int i = 0; i < employees.length; i++) {
            //获取员工类型
            int type=Integer.parseInt(EMPLOYEES[i][0]);
            //获取Empolyee的四个基本信息
            int id=Integer.parseInt(EMPLOYEES[i][1]);
            String name=EMPLOYEES[i][3];
            int age=Integer.parseInt(EMPLOYEES[i][3]);
            double salary=Double.parseDouble(EMPLOYEES[i][4]);

            Equipment equipment;
            double bonus;
            int stock;
            switch (type){
                case EMPLOYEE:
                    employees[i]=new Employee(id,name,age,salary);
                    break;
                case PROGRAMMER:
                     equipment=createEquipment(i);
                    employees[i]=new Programmer(id,name,age,salary,equipment);//程序员
                    break;
                case DESIGNER:
                    equipment=createEquipment(i);
                    bonus=Double.parseDouble(EMPLOYEES[i][5]);
                    employees[i]=new Designer(id,name,age,salary,equipment,bonus);//设计师
                    break;
                case ARCHITECT:
                    equipment=createEquipment(i);
                    bonus=Double.parseDouble(EMPLOYEES[i][5]);
                    stock=Integer.parseInt(EMPLOYEES[i][6]);
                    employees[i]=new Architect(id,name,age,salary,equipment,bonus,stock);//设计师
                    break;
            }
        }
    }

    private Equipment createEquipment(int index) {//获取index上的员工的设备
        int key=Integer.parseInt(EQUIPMENTS[index][0]);
        String modelOrName=EQUIPMENTS[index][1];
        switch (key){
            case PC://21
                String display=EQUIPMENTS[index][2];
                return new PC(modelOrName,display);
            case NOTEBOOK://22
                double price=Double.parseDouble(EQUIPMENTS[index][2]);
            case PRINTER://23
                String type=EQUIPMENTS[index][2];
                return new Printer(modelOrName,type);
        }

        return null;
    }

    public Employee[] getAllEmployees() {
        return employees;
    }
    public Employee getEmployee(int id) throws TeamException {
        for (Employee e : employees) {
            if (e.getId() == id)
                return e;
        }
        throw new TeamException("该员工不存在");
    }
}
