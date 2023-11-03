package factories;

import buttons.Button;
import buttons.MacButton;
import checkboxes.Checkbox;
import checkboxes.MacCheckbox;

public class MacFactory implements GUIFactory{

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
