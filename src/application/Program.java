package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDAO sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TEST 1 - Seller FindById ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("=== TEST 2 - Seller FindByDepartment ===");
		Department department = new Department(2, null);
		List<Seller> lista = sellerDao.findByDepartment(department);
		for (Seller seller2 : lista) {
			System.out.println(seller2);
			System.out.println(department);
		}
		
	}

}
