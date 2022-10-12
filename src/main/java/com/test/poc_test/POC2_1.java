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
	private java.lang.Integer level;
	@org.kie.api.definition.type.Label("Request status")
	private boolean status;
	public POC2_1() {
	}

	public java.lang.Double getap_price_percent() {
	   // System.out.println(AP_price_percent);
	   System.out.println("Get price avg:"+ap_price_percent);
		return this.ap_price_percent;
	}

	public void setap_price_percent(java.lang.Double ap_price_percent) {
	   // ap_price_percent = 0.9
	    System.out.println("Set price avg:"+ap_price_percent);
		this.ap_price_percent = ap_price_percent;
	}
	
	public java.lang.Integer getap_price() {
	   // System.out.println(customerId);
	   System.out.println("Get price:"+ap_price_percent);
		return this.ap_price;
	}

	public void setap_price(java.lang.Integer ap_price) {
	   // System.out.println(Ap_price);
	   // ap_price = 4000;
	   System.out.println("Set price:"+ap_price_percent);
		this.ap_price = ap_price;
	}
	
	public java.lang.Integer getmp_max_price() {
	    System.out.println("Get mp_price:"+ap_price_percent);
		return this.mp_max_price;
	}

	public void setmp_max_price(java.lang.Integer mp_max_price) {
	    System.out.println("Set mp_price:"+ap_price_percent);
	   // System.out.println(mp_max_price);
	   // mp_max_price = 500
		this.mp_max_price = mp_max_price ;
	}
	
	public java.lang.Integer getlevel() {
	    System.out.println("Get level:"+ap_price_percent);
		return this.level;
	}

	public void setlevel(java.lang.Integer level) {
	   // level = 4
	    System.out.println("Set level:"+ap_price_percent);
	   // System.out.println(level);
		this.level = 4;
	}

	public boolean isStatus() {
		return this.status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public POC2_1(java.lang.Double ap_price_percent,
	        java.lang.Integer ap_price,
	        java.lang.Integer mp_max_price,
	        java.lang.Integer level,boolean status) {
        this.level = level;
        this.ap_price_percent = ap_price_percent;
        this.ap_price = ap_price;
        this.mp_max_price = mp_max_price;
		this.status = status;
		
	}
    
}
