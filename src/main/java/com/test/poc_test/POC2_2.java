package com.test.poc_test;
import java.util.*;
import java.lang.*;
import com.fasterxml.jackson.databind.*;
import org.json.*;
/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.remote.Remotable
public class POC2_2 implements java.io.Serializable {

	static final long serialVersionUID = 1;

	@org.kie.api.definition.type.Label("Product Price")
	private java.lang.Double product_price;
	@org.kie.api.definition.type.Label("AGM price")
	private java.lang.Integer Agm_price;
	@org.kie.api.definition.type.Label("AP首購")
	private java.lang.boolean ap_first;
	@org.kie.api.definition.type.Label("GP首購")
	private java.lang.boolean gp_first;
	@org.kie.api.definition.type.Label("MP首購")
	private java.lang.boolean mp_first;
	@org.kie.api.definition.type.Label("age")
	private java.lang.Integer age;
	@org.kie.api.definition.type.Label("Request status")
	private boolean status;
	public POC2_1() {
	}

	public double getproduct_price() {

		return this.product_price;
	}

	public void setproduct_price(java.lang.Double product_price) {
	    
		this.product_price = product_price;
	}
	
	public int getAgm_price() {
	    
		return this.Agm_price;
	}

	public void setAgm_price(java.lang.Integer Agm_price) {

		this.Agm_price = Agm_price;
	}
	
	public int getap_first() {

		return this.ap_first;
	}

	public void setap_first(java.lang.Integer ap_first) {

		this.ap_first = ap_first;
	}
	
	public String getgp_first() {
	    
		return this.gp_first;
	}

	public void setgp_first(java.lang.String gp_first) {

		this.gp_first = gp_first;
	}
	public int getmp_first() {

		return this.mp_first;
	}

	public void setmp_first(java.lang.Integer mp_first) {

		this.mp_first = mp_first;
	}
	
	public int getage() {

		return this.age;
	}

	public void setage(java.lang.Integer age) {

		this.age = age;
	}
	
	public boolean getStatus() {
	   // level = 4;
	    System.out.println("Get Status:"+status);
		return this.status;
	}
	
	public boolean isStatus() {
		return this.status;
	}

	public void setStatus(boolean status) {
	   // System.out.println(status);
		this.status = status;
	}
	
	
	public POC2_2(java.lang.Double product_price,
	        java.lang.Integer Agm_price,
	        java.lang.boolean ap_first,
	        java.lang.boolean gp_first,
	        java.lang.boolean mp_first,boolean status,java.lang.Integer age) {
        this.product_price = level;
        this.ap_price_percent = ap_price_percent;
        this.ap_price = ap_price;
        this.mp_max_price = mp_max_price;
        this.test_string = test_string;
		this.status = status;
		
	}
    
}
