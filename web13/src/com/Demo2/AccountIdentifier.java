package com.Demo2;

public class AccountIdentifier {
	
	    private String accountIdentifier;
	   private String status;
	   private ParentAccountIdentifier parentAccountIdentifier;
	   public String getAccountIdentifier ()
	   {
	       return accountIdentifier;
	   }
	   public void setAccountIdentifier (String accountIdentifier)
	   {
	       this.accountIdentifier = accountIdentifier;
	   }
	   public String getStatus ()
	   {
	       return status;
	   }
	   public void setStatus (String status)
	   {
	       this.status = status;
	   }
	   public ParentAccountIdentifier getParentAccountIdentifier ()
	   {
	       return parentAccountIdentifier;
	   }
	   public void setParentAccountIdentifier (ParentAccountIdentifier parentAccountIdentifier)
	   {
	       this.parentAccountIdentifier = parentAccountIdentifier;
	   }
	   @Override
	   public String toString()
	   {
	       return accountIdentifier+", status = "+status+", parentAccountIdentifier = "+parentAccountIdentifier+"]";
	   }
	}


