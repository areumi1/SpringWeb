package sample.repository;

import java.util.HashMap;
import java.util.List;

import sample.domain.EmpVO;

public interface EmpDAO {

	List<EmpVO> empSelect();
	
	List<HashMap> empDept();

}