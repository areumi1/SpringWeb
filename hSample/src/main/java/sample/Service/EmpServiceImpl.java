package sample.Service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sample.domain.EmpVO;
import sample.repository.EmpDAO;

@Service
public class EmpServiceImpl implements EmpService{
	
	@Autowired
	private EmpDAO empDAO;

	@Override
	public List<EmpVO> empService() {

		return empDAO.empSelect();
	}

	@Override
	public List<HashMap> empDept() {
		return empDAO.empDept();
	}

}
