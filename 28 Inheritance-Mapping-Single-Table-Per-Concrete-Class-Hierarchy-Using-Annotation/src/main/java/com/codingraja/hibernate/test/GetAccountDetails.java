package com.codingraja.hibernate.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.codingraja.hibernate.domain.Account;
import com.codingraja.hibernate.domain.CurrentAccount;
import com.codingraja.hibernate.domain.LoanAccount;
import com.codingraja.hibernate.domain.SavingAccount;

public class GetAccountDetails {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory factory = configuration.buildSessionFactory();
	
		Session session = factory.openSession();
		Account accNo = session.get(Account.class, new Long(1));
		SavingAccount savingAccountNo = session.get(SavingAccount.class, new Long(2));
		CurrentAccount currentAccountNo = session.get(CurrentAccount.class, new Long(3));
		LoanAccount loanAccountNo = session.get(LoanAccount.class, new Long(4));
		session.close();
		System.out.println("Account Balance : "+accNo.getBalance());
		System.out.println("savingAccount Balance : "+savingAccountNo.getBalance());
		System.out.println("currentAccount Balance : "+currentAccountNo.getBalance());
		System.out.println("LoanAccount Balance : "+loanAccountNo.getBalance());
	}
}
