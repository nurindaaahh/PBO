public class MVC {

    TampilCreate tcreate = new TampilCreate();
    Model model = new Model();
    TampilRead tread = new TampilRead();
    TampilUpdate tupdate = new TampilUpdate();
    TampilDelete tdelete = new TampilDelete();
    Controller controller = new Controller(model, tcreate, tread, tupdate, tdelete);
}