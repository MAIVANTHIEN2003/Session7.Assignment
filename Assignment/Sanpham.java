package Session7.Assignment;

import Java_Fx.Person;
import javafx.scene.control.Labeled;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;

public class Sanpham {
    public TextField Name;
    public TextField Gia;
    public TextField Donvi;
    public TextField SoLuong;
    public Text errMsg;
    public Text result;

    public void Submit(){
//        String s = "\n -----------";
//        s +="" + Name.getText();
//        s +="" + Gia.getText();
//        s +="" + Donvi.getText();
//        s +="" + SoLuong.getText();
//        result.setText(s);
//
//        result.setText(result.getText()+s);
//
//        Name.setText("\n");
//        Gia.setText("\n");
//        Donvi.setText("\n");
//        SoLuong.setText("\n");
        try {
            Sp p = new Sp(Name.getText(), Double.parseDouble(Gia.getText()), Donvi.getText(),Integer.parseInt(SoLuong.getText()));
            result.setText(result.getText()+p.toString());
            Name.setText("\n");
            Gia.setText("\n");
            Donvi.setText("\n");
            SoLuong.setText("\n");
            errMsg.setVisible(false);
        }catch (Exception e){
            errMsg.setText(e.getMessage());
            errMsg.setVisible(true);
        }
    }
}
