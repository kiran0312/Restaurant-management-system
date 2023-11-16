package DAO;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import ENTITY.Customer;

public interface HotelRepo {
	ArrayList<Customer> A1=new ArrayList<Customer>();
	LinkedHashMap<Integer,Customer> cm=new LinkedHashMap<Integer,Customer>();
	LinkedHashMap<Integer,Customer> sm=new LinkedHashMap<Integer,Customer>();
	LinkedHashMap<Integer,Customer> dm=new LinkedHashMap<Integer,Customer>();
	void AvailableRooms();
	void CheckRoom(LinkedHashMap<Integer, Customer> l1);

}
