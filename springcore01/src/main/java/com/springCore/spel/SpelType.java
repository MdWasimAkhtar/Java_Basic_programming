package com.springCore.spel;

import org.springframework.beans.factory.annotation.Value;

public class SpelType {
	
	private String name;
	
	private boolean isActive;
	private boolean equal;
	private boolean equalOr;
	private boolean lessthan ;
	private String addstr;
	private double power;
	@Value("#{36 div 2}") // 18, the same as for / operator
	private double divideAlphabetic; 

	@Value("#{37 % 10}") // 7
	private double modulo;

	@Value("#{37 mod 10}") // 7, the same as for % operator
	private double moduloAlphabetic; 

	@Value("#{2 ^ 9}") // 512
	private double powerOf;
	
	@Value("#{250 > 200 && 200 < 4000}") // true
	private boolean and; 

	@Value("#{250 > 200 and 200 < 4000}") // true
	private boolean andAlphabetic;

	@Value("#{400 > 300 || 150 < 100}") // true
	private boolean or;

	@Value("#{400 > 300 or 150 < 100}") // true
	private boolean orAlphabetic;

	@Value("#{!true}") // false
	private boolean not;

	@Value("#{not true}") // false
	private boolean notAlph;

	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public boolean isEqual() {
		return equal;
	}

	public void setEqual(boolean equal) {
		this.equal = equal;
	}

	public boolean isEqualOr() {
		return equalOr;
	}

	public void setEqualOr(boolean equalOr) {
		this.equalOr = equalOr;
	}

	public boolean isLessthan() {
		return lessthan;
	}

	public void setLessthan(boolean lessthan) {
		this.lessthan = lessthan;
	}

	public String getAddstr() {
		return addstr;
	}

	public void setAddstr(String addstr) {
		this.addstr = addstr;
	}

	public double getPower() {
		return power;
	}

	public void setPower(double power) {
		this.power = power;
	}

	public double getDivideAlphabetic() {
		return divideAlphabetic;
	}

	public void setDivideAlphabetic(double divideAlphabetic) {
		this.divideAlphabetic = divideAlphabetic;
	}

	public double getModulo() {
		return modulo;
	}

	public void setModulo(double modulo) {
		this.modulo = modulo;
	}

	public double getModuloAlphabetic() {
		return moduloAlphabetic;
	}

	public void setModuloAlphabetic(double moduloAlphabetic) {
		this.moduloAlphabetic = moduloAlphabetic;
	}

	public double getPowerOf() {
		return powerOf;
	}

	public void setPowerOf(double powerOf) {
		this.powerOf = powerOf;
	}

	public boolean isAnd() {
		return and;
	}

	public void setAnd(boolean and) {
		this.and = and;
	}

	public boolean isAndAlphabetic() {
		return andAlphabetic;
	}

	public void setAndAlphabetic(boolean andAlphabetic) {
		this.andAlphabetic = andAlphabetic;
	}

	public boolean isOr() {
		return or;
	}

	public void setOr(boolean or) {
		this.or = or;
	}

	public boolean isOrAlphabetic() {
		return orAlphabetic;
	}

	public void setOrAlphabetic(boolean orAlphabetic) {
		this.orAlphabetic = orAlphabetic;
	}

	public boolean isNot() {
		return not;
	}

	public void setNot(boolean not) {
		this.not = not;
	}

	public boolean isNotAlph() {
		return notAlph;
	}

	public void setNotAlph(boolean notAlph) {
		this.notAlph = notAlph;
	}
	
	
	
	
	

}
