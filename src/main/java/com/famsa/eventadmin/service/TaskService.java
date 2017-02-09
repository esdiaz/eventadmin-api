package com.famsa.eventadmin.service;

import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.famsa.eventadmin.model.Task;
import com.famsa.eventadmin.repository.TaskRepository;

@Service
public class TaskService {

	@Autowired
	private TaskRepository repository;

	private static final Logger LOGGER = Logger.getLogger(Task.class);

	@Transactional
	public Task create(Task entity) {
		LOGGER.debug("create -->");
		Task ent = repository.save(entity);
		LOGGER.debug("create //>");
		return ent;
	}

	@Transactional
	public Task update(Task entity) {
		LOGGER.debug("update -->");
		Task ent = repository.saveAndFlush(entity);
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
	public Task findByIdFetch(Integer id) {
		LOGGER.debug("findByIdFetch -->");
		Task ent = repository.findByIdFetch(id);
		LOGGER.debug("findByIdFetch //>");
		return ent;
	}

	@Transactional(readOnly = true)
	public List<Task> findAllFetch() {
		LOGGER.debug("findAllFetch -->");
		List<Task> list = repository.findAllFetch();
		LOGGER.debug("findAllFetch //>");
		return list;
	}
	
	@Transactional(readOnly = true)
	public List<Task> findAllByFrequencyTypeId(Short id) {
		LOGGER.debug("findAllByFrequencyTypeId -->");
		List<Task> list = repository.findAllByFrequencyTypeId(id);
		LOGGER.debug("findAllByFrequencyTypeId //>");
		return list;
	}
	
	@Transactional(readOnly = true)
	public List<Task> findAllByRequestTypeId(Short id) {
		LOGGER.debug("findAllByRequestTypeId -->");
		List<Task> list = repository.findAllByRequestTypeId(id);
		LOGGER.debug("findAllByRequestTypeId //>");
		return list;
	}
	
	@Transactional(readOnly = true)
	public List<Task> findAllByServiceTypeId(Short id) {
		LOGGER.debug("findAllByServiceTypeId -->");
		List<Task> list = repository.findAllByServiceTypeId(id);
		LOGGER.debug("findAllByServiceTypeId //>");
		return list;
	}
	
	@Transactional(readOnly = true)
	public List<Task> findAllByStatusTaskId(Short id) {
		LOGGER.debug("findAllByStatusTaskId -->");
		List<Task> list = repository.findAllByStatusTaskId(id);
		LOGGER.debug("findAllByStatusTaskId //>");
		return list;
	}
	
	@Transactional(readOnly = true)
	public List<Task> findAllByTaskTypeId(Short id) {
		LOGGER.debug("findAllByTaskTypeId -->");
		List<Task> list = repository.findAllByTaskTypeId(id);
		LOGGER.debug("findAllByTaskTypeId //>");
		return list;
	}
	
}
