package com.test.poc_test;
import java.util.*;
import java.lang.*;
import com.fasterxml.jackson.databind.*;
import org.json.*;
/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.remote.Remotable
public class POC2_1 implements java.io.Serializable {

	static final long serialVersionUID = 1;

	@org.kie.api.definition.type.Label("AP_price_percent")
	private java.lang.Double ap_price_percent;
	@org.kie.api.definition.type.Label("Ap_price")
	private java.lang.Integer ap_price;
	@org.kie.api.definition.type.Label("MP_MAX_PRICE")
	private java.lang.Integer mp_max_price;
	@org.kie.api.definition.type.Label("level")
	String level;
	@org.kie.api.definition.type.Label("Request status")
	private boolean status;
	public POC2_1() {
	}

	public double getap_price_percent() {
	   // System.out.println(AP_price_percent);
	   //ap_price_percent = 0.9;
	   //System.out.println("Get price avg:"+ap_price_percent);
		return this.ap_price_percent;
	}

	public void setap_price_percent(java.lang.Double ap_price_percent) {
	   // ap_price_percent = 0.9
	   // System.out.println("Set price avg:"+ap_price_percent);
		this.ap_price_percent = ap_price_percent;
	}
	
	public int getap_price() {
	   // System.out.println(customerId);
	   //ap_price = 4000;
	   //System.out.println("Get price:"+ap_price);
		return this.ap_price;
	}

	public void setap_price(java.lang.Integer ap_price) {
	   // System.out.println(Ap_price);
	   // ap_price = 4000;
	   //System.out.println("Set price:"+ap_price);
		this.ap_price = ap_price;
	}
	
	public int getmp_max_price() {
	   // ap_price = 4000;
	   // mp_max_price = 500;
	   // System.out.println("Get mp_price:"+mp_max_price);
		return this.mp_max_price;
	}

	public void setmp_max_price(java.lang.Integer mp_max_price) {
	   // System.out.println("Set mp_price:"+mp_max_price);
	   // System.out.println(mp_max_price);
	   // mp_max_price = 500
		this.mp_max_price = mp_max_price ;
	}
	
	public String getlevel() {
	   // level = 4;
	    System.out.println("Get level:"+level);
		return this.level;
	}

	public void setlevel(java.lang.String level) {
	   // level = 4
	   // System.out.println("Set level:"+level);
	   // System.out.println(level);
		this.level = level;
	}
	public boolean getStatus() {
	   // level = 4;
	   // System.out.println("Get Status:"+status);
		return this.status;
	}
	
	public boolean isStatus() {
		return this.status;
	}

	public void setStatus(boolean status) {
	   // System.out.println(status);
		this.status = status;
	}
	
	
	public POC2_1(java.lang.Double ap_price_percent,
	        java.lang.Integer ap_price,
	        java.lang.Integer mp_max_price,
	        java.lang.String level,boolean status) {
        this.level = level;
        this.ap_price_percent = ap_price_percent;
        this.ap_price = ap_price;
        this.mp_max_price = mp_max_price;
		this.status = status;
		
	}
    
}
