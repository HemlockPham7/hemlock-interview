public interface Document {
    void open();
}

public class WordDocument implements Document {
    @Override
    void open() {}
}

public class PdfDocument implements Document {
    @Override
    void open() {}
}

public abstract class DocumentFactory {

    public abstract Document createDocument();
}

public class WordDocumentFactory extends DocumentFactory {

    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}

public class PdfDocumentFactory extends DocumentFactory {

    @Override
    public Document createDocument() {
        return new PdfDocument();
    }
}

public class SampleApp {
    public static void main(String[] args) {
        DocumentFactory factory = new WordDocumentFactory();
        Document doc = factory.createDocument();
        doc.open();
    }
}