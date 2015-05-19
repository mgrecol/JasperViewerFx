/**
 * 
 */
package com.mgrecol.jasper.jasperviewerfx;

import javafx.concurrent.Task;

/**
 * @author  Michael Grecol
 *	@project JasperViewerFx
 * @filename WarningToast.java
 * @date Mar 23, 2015
 */
public class WarningToast  extends Task<Void> {




	/* (non-Javadoc)
	 * @see javafx.concurrent.Task#call()
	 */

public WarningToast(){
	super();
	updateProgress(1.0d,1.0d);


}	@Override
protected Void call() throws Exception {
	updateProgress(1.0, 1.0);
	Thread.sleep(500);
	for ( double d =1.0d; d>=-0.0d; d=d-.01d){
		updateProgress(d, 1.0d);
		Thread.sleep(20);
	}
	return null;
}
	
}
