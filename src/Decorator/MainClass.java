package Decorator;

public class MainClass {
    public static void main(String[] args) {

        Text paragraphedText = new ParagraphTextDecorator(new PlainText());
        paragraphedText.write();
        System.out.println();

        Text strongText = new StrongTextDecorator(new PlainText());
        strongText.write();
        System.out.println();

        Text markedText = new MarkTextDecorator(new PlainText());
        markedText.write();
        System.out.println();

        Text emphasizedText = new EmphasizeTextDecorator(new PlainText());
        emphasizedText.write();
        System.out.println();

        Text paragraphedAndStrongText = new ParagraphTextDecorator(new StrongTextDecorator(new PlainText()));
        paragraphedAndStrongText.write();
        System.out.println();

        Text strongAndParagraphedText = new StrongTextDecorator(new ParagraphTextDecorator(new PlainText()));
        strongAndParagraphedText.write();
        System.out.println();

        Text emphasizedAndMarkedText = new EmphasizeTextDecorator(new MarkTextDecorator(new PlainText()));
        emphasizedAndMarkedText.write();
        System.out.println();

        Text strongEmphasizedAndMarkedText = new StrongTextDecorator(new EmphasizeTextDecorator(new MarkTextDecorator(new PlainText())));
        strongEmphasizedAndMarkedText.write();
        System.out.println();

        Text allTags = new ParagraphTextDecorator(new EmphasizeTextDecorator(new MarkTextDecorator(new StrongTextDecorator(new PlainText()))));
        allTags.write();
        System.out.println();
    }
}
