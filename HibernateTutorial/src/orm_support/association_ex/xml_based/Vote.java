package orm_support.association_ex.xml_based;

import java.util.Date;

public class Vote {
	private int vtid;
	private String party_name;
	private Date cdate;
	private Voter voter;
	
	public int getVtid() {
		return vtid;
	}
	public void setVtid(int vtid) {
		this.vtid = vtid;
	}
	public String getParty_name() {
		return party_name;
	}
	public void setParty_name(String party_name) {
		this.party_name = party_name;
	}
	public Date getCdate() {
		return cdate;
	}
	public void setCdate(Date cdate) {
		this.cdate = cdate;
	}
	public Voter getVoter() {
		return voter;
	}
	public void setVoter(Voter voter) {
		this.voter = voter;
	}
	
	public Vote() {
		// TODO Auto-generated constructor stub
	}
	public Vote(String party_name, Date cdate) {
		this.vtid = vtid;
		this.party_name = party_name;
		this.cdate = cdate;
	}
	
	
}
