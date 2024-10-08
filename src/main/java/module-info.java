module sio.projetautoecole {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens sio.projetautoecole to javafx.fxml;
    exports sio.projetautoecole;
}