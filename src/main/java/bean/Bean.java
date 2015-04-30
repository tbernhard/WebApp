package bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.primefaces.model.chart.PieChartModel;

@ManagedBean
@SessionScoped	
public class Bean {
	private PieChartModel model;

	public Bean() {
		model = new PieChartModel();
		model.set("Brand 1", 540);
		model.set("Brand 2", 325);
		model.set("Brand 3", 702);
		model.set("Brand 4", 421);
		model.setTitle("Simple Pie");
		model.setLegendPosition("w");
	}

	public PieChartModel getModel() {
		return model;
	}
	
}