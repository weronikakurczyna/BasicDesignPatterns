package FactoryExamples.rg;

public class HtmlDialog extends Dialog{
    public Button createButton() {
        return new HtmlButton();
    }
}
