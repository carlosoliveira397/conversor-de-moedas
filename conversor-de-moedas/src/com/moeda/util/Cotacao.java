package com.moeda.util;

public class Cotacao {
	
    private String base_code;
    private String target_code;
    private String conversion_result;

    public Cotacao(String baseCode, String targetCode, String conversionResult) {
        this.base_code = baseCode;
        this.target_code = targetCode;
        this.conversion_result = conversionResult;
    }

	public String getBase_code() {
		return base_code;
	}

	public void setBase_code(String base_code) {
		this.base_code = base_code;
	}

	public String getTarget_code() {
		return target_code;
	}

	public void setTarget_code(String target_code) {
		this.target_code = target_code;
	}

	public String getConversion_result() {
		return conversion_result;
	}

	public void setConversion_result(String conversion_result) {
		this.conversion_result = conversion_result;
	}
    
}