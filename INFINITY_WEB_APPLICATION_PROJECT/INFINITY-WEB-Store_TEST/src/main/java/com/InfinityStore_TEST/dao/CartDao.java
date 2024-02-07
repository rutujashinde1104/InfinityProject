package com.InfinityStore_TEST.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.InfinityStore_TEST.entity.Cart;
import com.InfinityStore_TEST.entity.User;

public interface CartDao extends CrudRepository<Cart, Integer>
{
	public List<Cart> findByUser(User user);

}
