package lk.ac.vau.fas.ict.Model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Project {
   @Id
   private int project_id;
   private String name;
   private long totalcost;
   
   
   
   @ManyToMany(mappedBy = "projects")
   private List<Employee> employees;
 
}
