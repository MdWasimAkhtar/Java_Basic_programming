package com.springCore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("ob")
public class TrySPEL {
	
	@Value("#{22+100}")
	private double xy;
	
	@Value("#{1000%44}")
	private double tp ;
	
	@Value("#{T(java.lang.Math).sqrt(25)}")
	private double x;
	
	@Value("#{T(java.lang.Math).E }") //PI
	private double y;
	
	@Value("#{new java,lang.String('Shilpa')} ")
	private String anonymous;
	
	private double z ;
	
	TrySPEL(){
		
	}

	public double getXy() {
		return xy;
	}

	public void setXy(double xy) {
		this.xy = xy;
	}

	public double getTp() {
		return tp;
	}

	public void setTp(double tp) {
		this.tp = tp;
	}
	
	  

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	@Override
	public String toString() {
		return "TrySPEL [xy=" + xy + ", tp=" + tp + ", x=" + x + ", y=" + y + ", z=" + z + "]";
	}

	
	
	
}
