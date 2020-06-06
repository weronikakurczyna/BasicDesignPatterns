package Decorator;

public class EmphasizeTextDecorator extends TextDecorator {

    public EmphasizeTextDecorator(Text decoratedText) {
        super(decoratedText);
    }

    @Override
    public void write() {
        System.out.println("<em>");
        super.write();
        System.out.println("</em>");
    }
}
