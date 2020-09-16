package team.test;

import team.domain.Employee;
import team.service.NameListService;
import team.service.TeamException;

public class NameListServiceTest {

    public void testGetAllEmployees(){
        NameListService listService = new NameListService();

        Employee[] employees = listService.getAllEmployees();

        for(int i = 0;i < employees.length;i++){
            System.out.println(employees[i]);
        }
    }
    public void testGetEmployee(){
        int id = 2;
        NameListService listService = new NameListService();
        try {
            Employee emp = listService.getEmployee(id);
            System.out.println(emp);
        } catch (TeamException e) {
            System.out.println(e.getMessage());
        }
    }
}
