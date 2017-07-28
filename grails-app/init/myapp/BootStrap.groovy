package myapp

import grails.core.GrailsApplication

import javax.sql.DataSource

class BootStrap {

    DataSource dataSource
    GrailsApplication grailsApplication

    def init = { servletContext ->
        println grailsApplication.mainContext.getBeansOfType(DataSource)
        println dataSource.dump()
    }
    def destroy = {
    }
}
