package com.codingraja.hibernate.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.codingraja.hibernate.domain.Account;
import com.codingraja.hibernate.domain.CurrentAccount;
import com.codingraja.hibernate.domain.LoanAccount;
import com.codingraja.hibernate.domain.SavingAccount;

public class OpenNewAccount {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory factory = configuration.buildSessionFactory();
		
		//Save Account Only
		Account account = new Account(10000, 1001);
		SavingAccount savingAccount = new SavingAccount(20000, 1002, 12.5);
		CurrentAccount currentAccount = new CurrentAccount(30000, 1003, 10000, 100);
		LoanAccount loanAccount = new LoanAccount(40000, 1004, 12.5, 5500, 35000,50000);
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		long accNo= (Long)session.save(account);
		long savingAccountNo=(Long)session.save(savingAccount);
		long currentAccountNo = (Long)session.save(currentAccount);
		long LoanAccountNo= (Long)session.save(loanAccount);
		transaction.commit();
		session.close();
		System.out.println("Account No : "+accNo);
		System.out.println("savingAccount No : "+savingAccountNo);
		System.out.println("currentAccount No : "+currentAccountNo);
		System.out.println("LoanAccount No : "+LoanAccountNo);
	}

}
