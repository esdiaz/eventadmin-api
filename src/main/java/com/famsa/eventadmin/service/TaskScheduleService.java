package com.famsa.eventadmin.service;

import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.famsa.eventadmin.model.TaskSchedule;
import com.famsa.eventadmin.repository.TaskScheduleRepository;

@Service
public class TaskScheduleService {

	@Autowired
	private TaskScheduleRepository repository;

	private static final Logger LOGGER = Logger.getLogger(TaskSchedule.class);

	@Transactional
	public TaskSchedule create(TaskSchedule entity) {
		LOGGER.debug("create -->");
		TaskSchedule ent = repository.save(entity);
		LOGGER.debug("create //>");
		return ent;
	}

	@Transactional
	public TaskSchedule update(TaskSchedule entity) {
		LOGGER.debug("update -->");
		TaskSchedule ent = repository.saveAndFlush(entity);
		LOGGER.debug("update //>");
		return ent;
	}
	
	@Transactional
	public void delete(Long id) {
		LOGGER.debug("delete -->");
		repository.delete(id);
		LOGGER.debug("delete //>");
	}

	@Transactional(readOnly = true)
	public TaskSchedule findByIdFetch(Long id) {
		LOGGER.debug("findByIdFetch -->");
		TaskSchedule ent = repository.findByIdFetch(id);
		LOGGER.debug("findByIdFetch //>");
		return ent;
	}

	@Transactional(readOnly = true)
	public List<TaskSchedule> findAllFetch() {
		LOGGER.debug("findAllFetch -->");
		List<TaskSchedule> list = repository.findAllFetch();
		LOGGER.debug("findAllFetch //>");
		return list;
	}
	
	@Transactional(readOnly = true)
	public List<TaskSchedule> findAllByTaskId(Integer id) {
		LOGGER.debug("findAllByTaskId -->");
		List<TaskSchedule> list = repository.findAllByTaskId(id);
		LOGGER.debug("findAllByTaskId //>");
		return list;
	}
	
	@Transactional(readOnly = true)
	public List<TaskSchedule> findAllByStatusExecutionId(Short id) {
		LOGGER.debug("findAllByStatusExecutionId -->");
		List<TaskSchedule> list = repository.findAllByStatusExecutionId(id);
		LOGGER.debug("findAllByStatusExecutionId //>");
		return list;
	}

}
