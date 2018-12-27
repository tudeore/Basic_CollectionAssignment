package com.capgemini.collectionbasic;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Before;
import org.junit.Test;

public class TestOfObject {
	private Laptop laptopOne;
	private Laptop laptopTwo;
	private Laptop laptopThree;
	
	private Car carOne;
	private Car carTwo;
	private Car carThree;
	private Car carFour;
	private Car carFive;
	
	private School schoolOne;
	private School schoolTwo;
	private School schoolThree;
	
	@Before
	public void test() {
		Laptop laptopOne = new Laptop("Dell", "idepad300", "Windows", "corei3");
		Laptop laptopTwo = new Laptop("lenovo", "idepad400", "linux", "corei4");
		Laptop laptopThree = new Laptop("Asus", "idepad500", "mac", "corei5");
		
		carOne = new Car("Jaguar", "pic800", 1997, 200000);
		carTwo = new Car("Mercedes", "fam700", 2000, 500000);
		carThree = new Car("Farari", "far1100", 2018, 600000);
		carFour = new Car("Jif", "jif1100", 2017, 200000);
		carFive = new Car("MarutiSuzuki", "ms100", 2012, 60000);
		
		schoolOne = new School("jaiHind", "Dhule", "Nashik", 15);
		schoolTwo = new School("jaiHind", "Dhule", "Nashik", 20);
		schoolThree = new School("NorthPoint", "Valvadi", "Pune", 30);
		
		
	}

	@Test
	public void testOfUsingSet() {
	
		Set<Car> carInformation = new HashSet<Car>();
		carInformation.add(carOne);
		carInformation.add(carTwo);
		carInformation.add(carThree);
		carInformation.add(carFour);
		carInformation.add(carFive);
	}
	
	@Test
	public void testOftreeSet()
	{
		TreeSet<Car> carInfo = new TreeSet<Car>();
		carInfo.add(carOne);
		carInfo.add(carTwo);
		carInfo.add(carThree);
		carInfo.add(carFour);
		carInfo.add(carFive);
		System.out.println(carInfo.toString());
		
		String expected = "[Car [company=Farari, model=far1100, year=2018, price=600000.0], Car [company=Jaguar, model=pic800, year=1997, price=200000.0], Car [company=Jif, model=jif1100, year=2017, price=200000.0], Car [company=MarutiSuzuki, model=ms100, year=2012, price=60000.0], Car [company=Mercedes, model=fam700, year=2000, price=500000.0]]";		
		assertEquals(expected,carInfo.toString());
	}

	@Test
	public void testOfTelevision() {
		Television televisionOne = new Television("Sony", "LED", true, 200000);
		Television televisionTwo = new Television("Samsung", "LCD", false,50000);
		Television televisionThree = new Television("Videocon", "Plazma",false, 20000);
	}

	@Test
	public void testOfCellPhone() {
		CellPhone cellPhoneOne = new CellPhone("Apple", "A19", "RAM 3GB","IOS", 50000);
		CellPhone cellPhoneTwo = new CellPhone("Honer", "H9Lite", "RAM 2GB","Android", 11000);
		CellPhone cellPhoneThree = new CellPhone("Samsung", "A3110","RAM 1.5GB", "Android", 15000);
	}

	@Test
	public void testOfSchool() {
		
		Set<School> schoolInfo = new HashSet<School>();
		schoolInfo.add(schoolOne);
		schoolInfo.add(schoolTwo);
		schoolInfo.add(schoolThree);
		System.out.println("list of school     =" + schoolInfo.toString());

	}

	@Test
	public void testOfStudentWithArrayList() { // maintains insertion order
		Student studentOne = new Student("pankaj", 12);
		Student studentTwo = new Student("Bhushan", 15);
		Student studentThree = new Student("jos", 16);
		ArrayList<Student> studentInfo = new ArrayList<Student>();
		studentInfo.add(studentOne);
		studentInfo.add(studentTwo);
		studentInfo.add(studentThree);
		System.out.println("list of students    =" + studentInfo.toString());
	}
	
	@Test
	public void testOfFruits()
	{
		Map map = new HashMap();
		map.put("Tushar","mango");
		map.put("Shubham","pinaple");
		map.put("Rohan","banana");
		String s = (String) map.get("Tushar");
		System.out.println(s);
		Iterator itr = map.entrySet().iterator();
		while ( itr.hasNext()) {
			Map.Entry<String, String> fruit = (Entry<String, String>) itr.next();
			System.out.println(fruit.getKey()+ "\t"+fruit.getValue());
			
		}
	}

}
