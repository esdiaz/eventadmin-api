package com.famsa.eventadmin.service;

import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.famsa.eventadmin.model.TaskApplication;
import com.famsa.eventadmin.repository.TaskApplicationRepository;

@Service
public class TaskApplicationService {

	@Autowired
	private TaskApplicationRepository repository;

	private static final Logger LOGGER = Logger.getLogger(TaskApplication.class);

	@Transactional
	public TaskApplication create(TaskApplication entity) {
		LOGGER.debug("create -->");
		TaskApplication ent = repository.save(entity);
		LOGGER.debug("create //>");
		return ent;
	}

	@Transactional
	public TaskApplication update(TaskApplication entity) {
		LOGGER.debug("update -->");
		TaskApplication ent = repository.saveAndFlush(entity);
		LOGGER.debug("update //>");
		return ent;
	}
	
	@Transactional
	public void delete(Integer id) {
		LOGGER.debug("delete -->");
		repository.delete(id);
		LOGGER.debug("delete //>");
	}

	@Transactional(readOnly = true)
	public TaskApplication findByIdFetch(Integer id) {
		LOGGER.debug("findByIdFetch -->");
		TaskApplication ent = repository.findByIdFetch(id);
		LOGGER.debug("findByIdFetch //>");
		return ent;
	}

	@Transactional(readOnly = true)
	public List<TaskApplication> findAllFetch() {
		LOGGER.debug("findAllFetch -->");
		List<TaskApplication> list = repository.findAllFetch();
		LOGGER.debug("findAllFetch //>");
		return list;
	}
	
	@Transactional(readOnly = true)
	public List<TaskApplication> findAllByTaskId(Integer id) {
		LOGGER.debug("findAllByTaskId -->");
		List<TaskApplication> list = repository.findAllByTaskId(id);
		LOGGER.debug("findAllByTaskId //>");
		return list;
	}
	
	@Transactional(readOnly = true)
	public List<TaskApplication> findAllByApplicationId(Integer id) {
		LOGGER.debug("findAllByApplicationId -->");
		List<TaskApplication> list = repository.findAllByApplicationId(id);
		LOGGER.debug("findAllByApplicationId //>");
		return list;
	}

}
