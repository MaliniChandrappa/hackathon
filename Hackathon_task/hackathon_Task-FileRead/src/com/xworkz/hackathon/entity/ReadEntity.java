package com.xworkz.hackathon.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="READEXCEL")
public class ReadEntity {
	public class ReadDTO implements Serializable {
		@Id
		@Column(name="PARTY_ID")
		private int partyId;
		
		@Column(name="PARTY_NAME")
		private String partyName;
		
		@Column(name="WON")
		private int won;
		
		@Column(name="LOST")
		private int lost;
		
		@Column(name="STATE")
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

}
