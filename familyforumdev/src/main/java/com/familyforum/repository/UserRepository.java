package com.familyforum.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.familyforum.model.User;

@Component
@Transactional
public class UserRepository implements UserRepositoryIntf {

	@Autowired
	EntityManager entityManager;
	
	public UserRepository() {}

	@Override
	public void saveUser(User user) {
		Session session = entityManager.unwrap(Session.class);
		session.save(user);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> getUserList() {
		Session session = entityManager.unwrap(Session.class);
		List<User> userList = session.createQuery("from User").list();
		return userList;
	}

	@Override
	public User getUserByID(Long id) {
		Session session = entityManager.unwrap(Session.class);
		return session.get(User.class, id);
	}
	
	@Override
	public void deleteUserByID(Long id) {
		Session session = entityManager.unwrap(Session.class);
		User user = session.get(User.class, id);
		session.delete(user);
	}
	
	@Override
	public void updateUser(User user) {
		Session session = entityManager.unwrap(Session.class);
		session.update(user);
		
	}
}
