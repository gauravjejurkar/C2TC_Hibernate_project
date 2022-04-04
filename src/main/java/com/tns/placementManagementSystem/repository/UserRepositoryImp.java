package com.tns.placementManagementSystem.repository;

import com.tns.placementManagementSystem.entities.User;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.TypedQuery; 

public class UserRepositoryImp implements IUserRepository{

	private EntityManager entityManager;
	
	public UserRepositoryImp() {
		entityManager = JPAUtil.getEntityManager();
	}

	@Override
	public void addUser(User user) {
		entityManager.persist(user);
	}

	@Override
	public void updateUser(User user) {
		entityManager.merge(user);
		
	}

	@Override
	public void deleteUser(long id) {
		User user = entityManager.find(User.class, id);
		entityManager.remove(user);
	}

	@Override
	public void beginTrancsaction() {
		entityManager.getTransaction().begin();
	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
	}

	@Override
	public List<String> login(String userName, String password) {
		String queryString1 = "SELECT u.uName FROM User u where u.uName= :uname AND u.uPassword = :upass";
		String queryString2 = "SELECT u.uPassword FROM User u where u.uName= :uname AND u.uPassword = :upass";
		TypedQuery<String> query1 = entityManager.createQuery(queryString1, String.class);
		TypedQuery<String> query2 = entityManager.createQuery(queryString2, String.class);
		query1.setParameter("uname", userName);
		query1.setParameter("upass", password);
		query2.setParameter("uname", userName);
		query2.setParameter("upass", password);
		String userDetials1 = query1.getSingleResult();
		String userDetials2 = query2.getSingleResult();
		List<String> list = List.of(userDetials1, userDetials2);
		return list;
	}

	@Override
	public User findUserById(Long id) {
		User user = entityManager.find(User.class, id);
		return user;
	}
	


}
