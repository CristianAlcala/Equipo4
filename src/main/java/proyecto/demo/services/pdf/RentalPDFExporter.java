package proyecto.demo.services.pdf;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.PdfWriter;

import proyecto.demo.entities.Rental;


public class RentalPDFExporter {
	
	private Rental rentaldata;
	private List<String> clients;
	private List<String> staff;
	


public void export(HttpServletResponse response ) throws DocumentException, IOException {
	
	Document pdf= new Document(PageSize.LETTER);
	PdfWriter.getInstance(pdf, response.getOutputStream());
	pdf.open();
	Font font = FontFactory.getFont(FontFactory.HELVETICA_BOLD);
    font.setSize(18);
    font.setColor(0, 107, 76);
    
     
    
    Table data=new Table(2);
    data.setPadding(5);
    data.addCell("ID:");
    Integer id= rentaldata.getRental_id();
    data.addCell(id.toString());
    data.addCell("Cliente:");
    data.addCell(rentaldata.getClient().getFirstName() + " "+rentaldata.getClient().getLastName() );
    data.addCell("Pelicula:");
    data.addCell(rentaldata.getProduct().getFilm().getTitle());
    data.addCell("Inventario");
    Integer product=rentaldata.getProduct().getInventoryId();
    data.addCell(product.toString());
    data.addCell("Fecha de renta:");
    data.addCell(rentaldata.getRental_date().toString());
    data.addCell("Fecha de devolucion:");
    data.addCell(rentaldata.getReturn_date().toString());
    data.addCell("Precio de Renta:");
    data.addCell(rentaldata.getProduct().getFilm().getRentalRate().toString());
    
    Paragraph T = new Paragraph("RENTA", font);
    T.setAlignment(Paragraph.ALIGN_CENTER);
    pdf.add(T);
    pdf.add(data);
    
    
	pdf.close();
	
	
}


}
