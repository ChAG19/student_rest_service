package com.example.demo.model;

import java.time.LocalDate;

import lombok.*;

@Data
@Builder
public class Student {
	private String firstName;
	private String lastName;
	private LocalDate dayOfBirth;
	private String email;
}
