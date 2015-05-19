package com.mgrecol.jasper.jasperviewerfx;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Accordion;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TitledPane;
import javafx.scene.image.ImageView;
import javafx.scene.image.WritableImage;
import javafx.stage.FileChooser;
import javafx.stage.Popup;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.stage.WindowEvent;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.util.Callback;

import javax.imageio.ImageIO;







import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.export.JRXlsExporterParameter;
import net.sf.jasperreports.engine.export.ooxml.JRDocxExporter;
import net.sf.jasperreports.engine.export.ooxml.JRXlsxExporter;


/**
 * 
 */

/**
 * @author  Michael Grecol
 *	@project JasperViewerFx
 * @filename JRViewerFx.java
 * @date Mar 23, 2015
 */
public class JRViewerFx  extends Application {
	private JasperPrint jasperPrint;
	private JRViewerFxMode printMode;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		InputStream fxmlStream = null;
		try {
			fxmlStream = getClass().getResourceAsStream("/FRViewerFx.fxml");
			FXMLLoader loader = new FXMLLoader();
			Parent page = (Parent) loader.load(fxmlStream);
      Scene scene = new Scene(page);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Jasper Viewer for JavaFx");
            primaryStage.show();
            Object o = loader.getController();
            if(o instanceof JRViewerFxController){
            	JRViewerFxController jrViewerFxController = (JRViewerFxController)   o;
            	jrViewerFxController.setJasperPrint(jasperPrint);
            	jrViewerFxController.show();
            }

        } catch (Exception ex) {
          ex.printStackTrace();
        }
	}
	
public JRViewerFx(JasperPrint jasperPrint,JRViewerFxMode printMode, Stage primaryStage ){
	this.jasperPrint = jasperPrint;
	this.printMode=printMode;
	try {
		start(primaryStage);
	} catch (Exception e) {
		e.printStackTrace();
	}
}

}
