JasperViewerFx
------------------

JavaFx is a full featured Jasper report viewer written completely in JavaFx. 
It has the following features:
* View and zoom  all of the pages of a Jasper report document.
* Export report documents to the following formats: PDF, PNG, DOCX, XLSX, HTML
* Print reports using the system dialog.

How to use:
------------
JasperViewerFx supports two modes defined in JRViewerFxMode namely:  REPORT_PRINT and REPORT_VIEW. 
REPORT_PRINT mode simply shows the system print dialog and prints a document while REPORT_VIEW mode 
shows a JavaFx windows with the Jasper document in the center.  JasperViewerFx is made to be included in a 
running JavaFxApplication.  This means that a running JavaFx application would already have have a stage 
created.   In this case one would fill a JasperPrint object and pass it to the JRViewerFx class's constructor
 with the JRViewerFxMode desired. For convenience, the class JRViewerMain is included which creates a stage
 and fills in a report and constructs a JRViewerFx instance in REPORT_VIEW mode.
