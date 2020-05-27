package com.gvp.mall;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gvp.mall.controller.EmpController;
import com.gvp.mall.dto.EmpDTO;

@SpringBootApplication
public class EmpTestApp implements CommandLineRunner {

	@Autowired
	EmpController ec;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Entered Emp Test main Class->EmpTestApp");
		System.out.println("GVP Mall-Port No:8001");
		double a = System.currentTimeMillis();

		SpringApplication.run(EmpTestApp.class, args);

		double b = System.currentTimeMillis();

		double c = a - b;
		System.out.println("Time is:" + c);

	}

	@Override
	public void run(String... args) throws Exception {
	    System.out.println("Entered Emp Test run()->EmpTestApp");
	    
	    /* Saving Operations */
	    
		// saveEmp(); //Single Record with Zero-Param constructor
		// saveEmpParamConstructor() //Single Record with Multi-Param constructor
		saveAllEmp();//Bulk Records with Multi-Param constructor
    }

	public void saveEmp() {
		System.out.println("Entered SaveEmp()->EmpTestApp");
		EmpDTO emp = new EmpDTO();
		emp.setEmpNo("0004");
		emp.setEmpFirstName("VND Prasad");
		emp.setEmpLastName("Grandhi");
		emp.setGender('M');
		emp.setDOB("28-08-1993");
		emp.setEmpQualification("Degree");
		emp.setEmpDept("Sales");
		emp.setEmpRole("Manager");
		emp.setEmpJobLevel("5A");
		emp.setEmpExp(5.5);
		emp.setEmpJD("05-05-2016");
		emp.setEmpType("Contract");
		emp.setEmpSal(10.2);
		emp.setEpfAccount(false);
		emp.setEmpLocation("Hyderabad");
		emp.setEmpStatus("Active");

	    ec.add(emp);
	}

	public void saveEmpParamConstructor() {

		EmpDTO empObj = new EmpDTO("GVP0088", "Sravya", "B", 'F', "12-12-1995", "Bsc", "Screens", "Supervisor", "3B",3.2, "12-01-2019", "Permenant", 5.5, true, "Hyderabad", "Active");
		EmpDTO e = ec.add(empObj);
		System.out.println("Single record" + e);

	}

	public void saveAllEmp() {
		System.out.println("Enter SaveAllEmp() -> EmpTestApp");

		List<EmpDTO> empListObjs = Arrays.asList(
												new EmpDTO("GVP0001", "Bhumi", "B", 'F', "12-12-1995", "Bsc", "Screens", "Supervisor", "3B", 3.2,
														"12-01-2019", "Permenant", 5.5, true, "Hyderabad", "Active"),
												new EmpDTO("GVP0002", "Indu", "K", 'F', "02-12-1993", "Bcom", "Screens", "Supervisor", "3A", 3.6,
														"14-11-2018", "Permenant", 6.5, false, "Hyderabad", "Active"),
												new EmpDTO("GVP0003", "Madu", "K", 'M', "02-12-1992", "Bsc", "Screens", "Senior Supervisor", "4A", 4.2,
														"14-11-2017", "Permenant", 8.5, true, "Hyderabad", "Active"),
								
												new EmpDTO("GVP0004", "Vijay", "B", 'M', "12-12-1996", "Msc", "Sales", "Sales Advisor", "3B", 3.2,
														"12-01-2019", "Permenant", 5.5, true, "Hyderabad", "Active"),
												new EmpDTO("GVP0005", "Ramana", "K", 'M', "02-12-1993", "Bcom", "Sales", "Senior Sales Advisor", "4A", 5.6,
														"14-11-2018", "Permenant", 6.5, false, "Hyderabad", "Active"),
												new EmpDTO("GVP0006", "Ragava", "K", 'M', "02-12-1992", "MBA", "Sales", "Sales Advisor", "4A",
														4.2, "14-11-2017", "Permenant", 8.5, true, "Hyderabad", "Active"),
								
												new EmpDTO("GVP0007", "Sravya", "B", 'F', "12-12-1995", "Bsc", "Operations", "Specialist", "3B", 3.2,
														"12-01-2019", "Permenant", 5.5, true, "Hyderabad", "Active"),
												new EmpDTO("GVP0008", "Pavani", "B", 'F', "12-12-1995", "Bsc", "Operations", "Specialist", "3B", 3.2,
														"12-01-2019", "Permenant", 5.5, true, "Hyderabad", "Active"),
												new EmpDTO("GVP0009", "Prasad", "K", 'M', "02-12-1993", "Bcom", "Operations", "Specialist", "3A", 3.6,
														"14-11-2018", "Permenant", 6.5, false, "Hyderabad", "Active"),
												new EmpDTO("GVP0010", "Ali", "K", 'M', "02-12-1992", "Bsc", "Operations", "Specialist", "4A", 4.2,
														"14-11-2017", "Permenant", 8.5, true, "Hyderabad", "Active")
				                  );

		Iterable<EmpDTO> empList = ec.addAll(empListObjs);
		
		for (EmpDTO emp : empList) {
			System.out.println(emp);
		}

	}

}
