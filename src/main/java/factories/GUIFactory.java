package factories;

import buttons.Button;
import checkboxes.Checkbox;

public interface GUIFactory {
    public Button createButton();
    public Checkbox createCheckbox();
}
