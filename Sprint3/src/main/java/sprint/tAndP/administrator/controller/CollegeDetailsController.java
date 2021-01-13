package sprint.tAndP.administrator.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sprint.tAndP.administrator.exception.ResourceNotfoundException;
import sprint.tAndP.administrator.model.CollegeDetails;
import sprint.tAndP.administrator.repository.CollegeDetailsRepository;

@CrossOrigin(origins="http://localhost:3000")
@RestController
@RequestMapping("/api/collegeDetails/")
public class CollegeDetailsController {
	
	@Autowired
	private CollegeDetailsRepository cdRepository;
	
	//Getting college details api
	@GetMapping("/get_college_details")
	public List<CollegeDetails> getDetails()
	{
		return cdRepository.findAll();
	}
	
	// Updating college details rest api
	
	@PutMapping("/update_college_details/{id}")
	public ResponseEntity<CollegeDetails> updateDetails(@PathVariable Long id, @RequestBody CollegeDetails cDetails)
	{
		CollegeDetails details=cdRepository.findById(id).
				orElseThrow(()->new ResourceNotfoundException("Unable to fetch the data."));
		
		details.setCcontactNo(cDetails.getCcontactNo());
		details.setCemailId(cDetails.getCemailId());
		
		CollegeDetails updatedDetails=cdRepository.save(details);
		return ResponseEntity.ok(updatedDetails);
	}

}
