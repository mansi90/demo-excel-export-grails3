import sample.excel.export.Product

class BootStrap {

    def init = { servletContext ->

        (1..10).each {
            new Product(name: "Product ${it}", description: "Some description text -  ${it}", price: it * 100).save(flush: true)
        }
    }
    def destroy = {
    }
}
