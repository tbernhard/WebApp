package bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.apache.log4j.Logger;

import java.io.Serializable;
 
@ManagedBean
@SessionScoped
public class PageController implements Serializable {
 
	private static final Logger LOG = Logger.getLogger(PageController.class);
	private static final long serialVersionUID = 1L;
 
	public String processPage1(){
	    LOG.info("processPage1=404Error");
		return "404Error";
	}
 
	public String processPage2(){
		LOG.info("processPage2=trystuff");
		return "trystuff";
	}
}