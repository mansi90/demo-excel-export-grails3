package sample.excel.export

import pl.touk.excel.export.*

class DemoController {

    def index() {}

    def demo1() {
        List<Product> products = Product.list()
        println(products)
        def headers = ['Name', 'Description', 'Price']
        def withProperties = ['name', 'description', 'price']
        def  file = new WebXlsxExporter().with {
            setResponseHeaders(response)
            fillHeader(headers)
            add(products, withProperties)
            save(response.outputStream)
        }
    }
}
