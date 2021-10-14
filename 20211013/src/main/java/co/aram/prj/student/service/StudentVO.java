package co.aram.prj.student.service;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentVO {
	private String id;
	private String password;
	private String name;
	private String major;
	private String author;

	public String toString() {
		System.out.print(id + " ");
		System.out.print(password + " ");
		System.out.print(name + " ");
		System.out.print(major + " ");
		System.out.print(author + "\n");
		return null;
	}
}
