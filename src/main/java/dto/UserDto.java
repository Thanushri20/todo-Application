package dto;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;
import java.util.List;

@Entity
@Data
public class UserDto {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 int id;
 String name;
 String email;
 String password;
 long mobile;
 LocalDate dob;
 String gender;
 int age;
 
 @OneToMany
 List<Task> tasks;

}
