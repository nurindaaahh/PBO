public class MVCLogin {

    ViewLogin viewLogin = new ViewLogin();
    ViewDaftar viewDaftar = new ViewDaftar();
    ModelLogin modelLogin = new ModelLogin();
    ControllerLogin contLogin = new ControllerLogin(viewLogin, viewDaftar, modelLogin);
}