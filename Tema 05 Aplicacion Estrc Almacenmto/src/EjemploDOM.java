import java.io.File;
import java.util.Scanner;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.*;

public class EjemploDOM {
    public static void main(String[] args) {
         /*Desarrolla un programa en Java que nos permita almacenar  10 discos(Ejemplo 5) musicales en un fichero 
        XML. El nodo raíz deberá llamarse catálogo y la estructura de un disco será la siguiente:
        <CD>
            <TITULO> ........</TITULO>
            <ARTISTA>........</ARTISTA>
            <ORIGEN>.........</ORIGEN>
            <AÑO>............</AÑO>
        </CD>
        Una vez leidos los 10 discos, se pedira al usuario el nombre del fichero XML 
        y este se creará.
        */
        // Creamos las variables para las etiquetas hijas:
        String titulo, artista, origen, fichero, precio, año;
        double precioD;
        int anioI;

        Scanner sc = new Scanner(System.in);
        try {
            // Elementos para crear el fichero-documento
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.newDocument();

            // Creamos el elemento RAIZ del documento creado anteriormente DOC
            Element elRaiz = doc.createElement("CD");
            doc.appendChild(elRaiz);    //Añadimos el elemento Raiz al documento

            // Creamos las 10 entradas/peticiones con un bucle FOR
            for(int i = 0; i < 2; i ++){        //Para el Ejemplo solo lo haremos con 2 Peticiones x cada Disco
                Element eCD = doc.createElement("CD");
                Element eTitulo = doc.createElement("Titulo");
                Element eArtista = doc.createElement("Artista");
                Element eOrigen = doc.createElement("Origen");
                Element ePrecio = doc.createElement("Precio");
                Element eAnio = doc.createElement("Año");

                // Peticion de datos al usuario
                System.out.println("Introduce el TITULO del Disco: ");
                titulo = sc.nextLine();
                ((Node) eTitulo).appendChild(doc.createTextNode(titulo));

                System.out.println("Introduce el ARTISTA del disco: ");
                artista = sc.nextLine();
                eArtista.appendChild(doc.createTextNode(artista));

                System.out.println("Introduce el ORIGEN del disco: ");
                origen = sc.nextLine();
                eOrigen.appendChild(doc.createTextNode(origen));

                System.out.println("Introduce el PRECIO del disco: ");
                precioD = sc.nextDouble();
                //Se transforma el valor real a String:
                precio = String.valueOf(precioD);
                ePrecio.appendChild(doc.createTextNode(precio));
                sc.nextLine();

                System.out.println("Introduce el AÑO del disco: ");
                anioI = sc.nextInt();
                //Se transforma el valor INT  a String:
                año =  String.valueOf(anioI);
                eAnio.appendChild(doc.createTextNode(año));
                sc.nextLine();

                //Se introducen los nodos:
                elRaiz.appendChild(eCD);
                eCD.appendChild(eTitulo);
                eCD.appendChild(eArtista);
                eCD.appendChild(eOrigen);
                eCD.appendChild(ePrecio);
                eCD.appendChild(eAnio);
            }

            //Se pide el nombre del fichero:
            System.out.println("Introduzca el nombre del dichero XML: ");
            fichero = sc.nextLine();

             //Creamos el documento:
             TransformerFactory transformerFactory = TransformerFactory.newInstance();
             Transformer transformer = transformerFactory.newTransformer();
             DOMSource source = new DOMSource(doc);

             //Añadimos la extension al documento:
             StreamResult result = new StreamResult(new File(fichero + ".xml"));
             transformer.transform(source, result);;

        }catch(ParserConfigurationException | TransformerException | DOMException e){
            System.out.println("Error - " + e.toString());
        }
    sc.close(); 
    }  
}
