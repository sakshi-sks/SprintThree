package sprint.tAndP.administrator.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sprint.tAndP.administrator.exception.ResourceNotfoundException;
import sprint.tAndP.administrator.model.AdminRecruiter;
import sprint.tAndP.administrator.repository.AdminRecruiterRepository;

@CrossOrigin(origins="http://localhost:3000")
@RestController
@RequestMapping("/api/viewStudents/")
public class AdminRecruiterController {
	
		@Autowired
		private AdminRecruiterRepository arRepository;
		
		//Getting all students api
		
		@GetMapping("/get_student_list")
		public List<AdminRecruiter> getDetails()
		{
			return arRepository.findAll();
		}
		
		// delete recruiter rest api
		
		@DeleteMapping("/get_student_list/{id}")
		public ResponseEntity<Map<String, Boolean>> deleteEmployee(@PathVariable Long id){
			AdminRecruiter recruiter = arRepository.findById(id).orElseThrow(() -> 
				new ResourceNotfoundException("No such recruiter found"));
			
			arRepository.delete(recruiter);
			Map<String, Boolean> response = new HashMap<>();
			response.put("deleted", Boolean.TRUE);
			return ResponseEntity.ok(response);
		}
}
