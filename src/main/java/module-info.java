module com.skimask4545.filemanagementgui {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;

    opens com.skimask4545.filemanagementgui to javafx.fxml;
    exports com.skimask4545.filemanagementgui;
}