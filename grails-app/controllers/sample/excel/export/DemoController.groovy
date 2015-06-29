package sample.excel.export
import pl.touk.excel.export.WebXlsxExporter

class DemoController {

    def index() {}

    def demo1() {
        List<Product> products = Product.list()
        println(products)
        /*def withProperties = ['name', 'description', 'prince']
        new WebXlsxExporter().with {
            setResponseHeaders(response)
            fillHeader(headers)
            add(products, withProperties)
            save(response.outputStream)
        }*/
        render "DONE"
    }
}
