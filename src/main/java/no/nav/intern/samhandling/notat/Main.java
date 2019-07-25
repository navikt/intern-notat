package no.nav.intern.samhandling.notat;

import com.github.jknack.handlebars.Handlebars;
import com.github.jknack.handlebars.Template;
import com.openhtmltopdf.pdfboxout.PdfRendererBuilder;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class Main {
    public static void main(String[] args) throws Exception {
        Template template = new Handlebars().compile("standard-intern-notat1");
        String result = template.apply(new StandardNotatDTO());

        try (OutputStream os = new FileOutputStream("out.pdf")) {
            new PdfRendererBuilder()
                    .useFastMode()
                    .withHtmlContent(result, "")
                    .toStream(os)
                    .run();
        }
    }
}
