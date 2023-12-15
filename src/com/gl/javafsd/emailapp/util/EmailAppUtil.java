package com.gl.javafsd.emailapp.util;

public class EmailAppUtil {
public static String getDepartmentName(int deptCode) {
        
        String departmentName = "";
        
        switch (deptCode) {
            
            case 1: {
                departmentName = "tech";
                break;
            }
            case 2: {
                departmentName = "admin";
                break;				
            }
            case 3: {
                departmentName = "hr";
                break;				
            }
            case 4: {
                departmentName = "legal";
                break;				
            }
            
            default : {
                
                System.out.println("Invalid department option chosen. Please choose a value "
                        + "between 1 and 4");
                System.exit(-1);
            }
        }		
        
        return departmentName;
    }
}
