package q1.service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import q1.model.emploee;
import q1.repository.repo;

@Service
public class emploeeservice {
	
	@Autowired
	repo rep ;
	
	public emploee createEmp(emploee emp) {
		return rep.save(emp);
	}
	
	public List<emploee> listEmp() {
		return (List<emploee>) rep.findAll();
	}
    
	public void remv(long id) {
		rep.deleteById(id);
	}       

}
