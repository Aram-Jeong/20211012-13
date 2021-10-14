package co.aram.prj.student.service;

import java.util.List;

public interface StudentMapper {
	List<StudentVO> studentSelectList();
	StudentVO studentSelect(StudentVO vo);
	int studentInsert(StudentVO vo);
	int studentUpdate(StudentVO vo);
	int studentDelete(StudentVO vo);
	StudentVO loginCheck(StudentVO vo);
	
}
