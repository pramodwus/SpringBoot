package com.sathya.ems.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sathya.ems.entity.Employee;
import com.sathya.ems.service.EmployeeServiceImpl;

@Controller

public class EmployeeController {
	@Autowired
	private EmployeeServiceImpl imp;
	
	
	@RequestMapping(value="/employee",method=RequestMethod.GET)
	
	public ModelAndView welocome()
    {
		return new ModelAndView("addEmployee");
		
		
		
     }
      @RequestMapping(value="/insert", method=RequestMethod.POST)
      public ModelAndView insert(@RequestParam("empno") Integer s1,@RequestParam("ename")String s2,@RequestParam("salary") Integer s3,@RequestParam("deptno")Integer s4)
      {
    	  
     Employee e=new Employee();  
     e.setEmno(s1);
     e.setEname(s2);
     e.setSalary(s3);
     e.setDeptno(s4);
       boolean b=imp.insertEmployee(e);
       if(b)
       {
    	   return new ModelAndView("index","msg","record are sucessfully");
       }
       else
       {
    	   return new ModelAndView("failure");
       }
       
    	  
    	  
      }
      
      @RequestMapping(value="/showemployee",method=RequestMethod.GET)
      public ModelAndView show()
      {
    	 
		List<Employee> list=imp.readEmployee();
    	 
    	  return new ModelAndView("show","data",list);
    	  
      }
      @RequestMapping(value="/update",method=RequestMethod.POST)
      
      public ModelAndView update(@RequestParam("empno") Integer s1,@RequestParam("ename")String s2,@RequestParam("salary") Integer s3,@RequestParam("deptno")Integer s4)
      {
    	  
    	  
    	  
    	     Employee e=new Employee();  
    	     e.setEmno(s1);
    	     e.setEname(s2);
    	     e.setSalary(s3);
    	     e.setDeptno(s4);	  
    	  
    	  
    	  imp.updateEmployee(e);
    	   return show();
    	   
    	
      }
    	  
    	  @RequestMapping(value="/delete",method=RequestMethod.GET)
    	  public ModelAndView delete(@RequestParam("id") Integer s2 )
    	  {
    		  imp.removeEmloyee(s2);
    		  
                 return show();
      
                        
    	  }
    	  @RequestMapping(value="/updatedata",method=RequestMethod.GET)
    	  public ModelAndView updateData(@RequestParam("id") Integer s1)
    	 {
    		  
    	     return new ModelAndView("update","k1",s1);	  
    		  
    	  }
      
      
}
