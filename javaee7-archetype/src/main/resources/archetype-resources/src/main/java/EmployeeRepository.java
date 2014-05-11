#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Singleton;

@Singleton
public class EmployeeRepository {

   private final List<Employee> list;

   public EmployeeRepository() {
      list = new ArrayList<>();
   }

   public void addEmployee(Employee e) {
      list.add(e);
   }

   public void deleteEmployee(String name) {
      Employee p = findEmployeeByName(name);
      if (p != null)
         list.remove(p);
   }

   private Employee findEmployeeByName(String name) {
      for (Employee e : list) {
         if (name.equals(e.getName()))
            return e;
      }
      return null;
   }

   public List<Employee> getEmployees() {
      return list;
   }
}
