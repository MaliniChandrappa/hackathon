package com.xworkz.hackathon.dto;

import java.io.Serializable;

public class ReadDTO implements Serializable {
	private int partyId;
	private String partyName;
	private int won;
	private int lost;
	private String state;
	
	
	public ReadDTO() {
		System.out.println("created \t"+this.getClass().getSimpleName());
	}
	public int getPartyId() {
		return partyId;
	}
	public void setPartyId(int partyId) {
		this.partyId = partyId;
	}
	public String getPartyName() {
		return partyName;
	}
	public void setPartyName(String partyName) {
		this.partyName = partyName;
	}
	public int getWon() {
		return won;
	}
	public void setWon(int won) {
		this.won = won;
	}
	public int getLost() {
		return lost;
	}
	public void setLost(int lost) {
		this.lost = lost;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "ReadDTO [partyId=" + partyId + ", partyName=" + partyName + ", won=" + won + ", lost=" + lost
				+ ", state=" + state + "]";
	}
	

}
