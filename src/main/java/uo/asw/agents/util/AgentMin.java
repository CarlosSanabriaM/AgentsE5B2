package uo.asw.agents.util;

//TODO - Averiguar para que sirve esta clase, porque creo que no se utiliza en ninún sitio salvo en los test
//y en dichos tests se hace una comprobacion sin mucho sentido. Creo que está de relleno.
public class AgentMin {
	
	private Long id;
	private String name;
	private String location;
	private String email;
	private String kind;
	public int kindCode;
	
	public AgentMin(Long id, String name, String location, String email, String kind, int kindCode) {
		this.id = id;
		this.name = name;
		this.location = location;
		this.email = email;
		this.kind = kind;
		this.kindCode = kindCode;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public int getKindCode() {
		return kindCode;
	}

	public void setKindCode(int kindCode) {
		this.kindCode = kindCode;
	}

	@Override
	public String toString() {
		return "AgentMin [id=" + id + ", name=" + name + ", location=" + location + ", email=" + email + ", kind="
				+ kind + ", kindCode=" 
				//+ kindCode 
				+ "]";
	}
	
}
