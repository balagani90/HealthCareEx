package com.rk.service;

import java.util.List;

import com.rk.entity.Appointment;

public interface IAppointmentService {
	
	Long saveAppointment(Appointment appointment);
	
	void updateAppointment(Appointment appointment);
	
	void deleteAppointment(Long id);
	
	Appointment getOneAppointment(Long id);
	
	List<Appointment> getAllAppointments();
	
	List<Object[]> getAppoinmentsByDoctor(Long docId);
	
}
