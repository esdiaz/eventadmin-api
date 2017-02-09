package com.famsa.eventadmin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.famsa.eventadmin.model.TaskSchedule;

public interface TaskScheduleRepository extends JpaRepository<TaskSchedule, Long> {

	@Query("select model from TaskSchedule model "
			+ "join fetch model.task "
			+ "join fetch model.statusExecution ")
	public List<TaskSchedule> findAllFetch();
	
	@Query("select model from TaskSchedule model "
			+ "join fetch model.task "
			+ "join fetch model.statusExecution "
			+ "where model.id = :id")
	public TaskSchedule findByIdFetch(@Param("id") Long id);
	
	@Query("select model from TaskSchedule model "
			+ "join fetch model.task "
			+ "join fetch model.statusExecution "
			+ "where model.task.id = :id")
	public List<TaskSchedule> findAllByTaskId(@Param("id") Integer id);
	
	@Query("select model from TaskSchedule model "
			+ "join fetch model.task "
			+ "join fetch model.statusExecution "
			+ "where model.statusExecution.id = :id")
	public List<TaskSchedule> findAllByStatusExecutionId(@Param("id") Short id);
}
