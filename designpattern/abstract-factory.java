public interface Button() {
    void click();
}

public interface Checkbox() {
    void tick();
}

public class WinButton implements Button {
    @Override
    public void click();
}

public class WinCheckBox implements Checkbox() {
    @Override
    public void tick();
}

public class MacButton implements Button {
    @Override
    public void click();
}

public class MacCheckBox implements Checkbox() {
    @Override
    public void tick();
}

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}

public class WinFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WinCheckbox();
    }
}

public class MacFactory implements GUIFactory {
    @Override
    public Button createButton()  {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox()  {
        return new MacCheckbox();
    }
}

public class Application {

    private final Button button;
    private final Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }
}