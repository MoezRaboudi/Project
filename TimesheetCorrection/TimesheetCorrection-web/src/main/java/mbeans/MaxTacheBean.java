package mbeans;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import entities.MaxTache;
import entities.Tache;
import implservices.ProjectService;
import implservices.MaxTacheService;

@ManagedBean
public class MaxTacheBean 
{
	private int Id;
	private int max;
	private String projname;
	private String username;
	private List <MaxTache> maxtache ;
	
	@EJB
	MaxTacheService maxtacheservice ;
	
	public MaxTache allmaxtache() 
	{
		
		return maxtacheservice.allmaxtache().get(0);
	}
	
	
	public MaxTacheService getMaxtacheservice() {
		return maxtacheservice;
	}


	public void setMaxtacheservice(MaxTacheService maxtacheservice) {
		this.maxtacheservice = maxtacheservice;
	}


	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public String getProjname() {
		return projname;
	}
	public void setProjname(String projname) {
		this.projname = projname;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public List<MaxTache> getMaxtache() {
		return maxtache;
	}


	public void setMaxtache(List<MaxTache> maxtache) {
		this.maxtache = maxtache;
	}
	
	
	
	

}
