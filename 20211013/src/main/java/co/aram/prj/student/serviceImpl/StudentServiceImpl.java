package co.aram.prj.student.serviceImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import co.aram.prj.comm.DataSource;
import co.aram.prj.student.service.StudentMapper;
import co.aram.prj.student.service.StudentService;
import co.aram.prj.student.service.StudentVO;

public class StudentServiceImpl implements StudentService {
	private SqlSession sqlSession = DataSource.getInstance().openSession(true);
	private StudentMapper map = sqlSession.getMapper(StudentMapper.class);
	
	@Override
	public List<StudentVO> studentSelectList() {
		return map.studentSelectList();
	}

	@Override
	public StudentVO studentSelect(StudentVO vo) {
		return map.studentSelect(vo);
	}

	@Override
	public int studentInsert(StudentVO vo) {
		return map.studentInsert(vo);
	}

	@Override
	public int studentUpdate(StudentVO vo) {
		return map.studentUpdate(vo);
	}

	@Override
	public int studentDelete(StudentVO vo) {
		return map.studentDelete(vo);
	}
	
	@Override
	public StudentVO loginCheck(StudentVO vo) {
		return map.loginCheck(vo);
	}

	

}
