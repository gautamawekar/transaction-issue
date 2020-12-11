package transaction.issue

import io.micronaut.test.annotation.MicronautTest
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import spock.lang.Specification

import javax.inject.Inject
import javax.inject.Named
import javax.sql.DataSource

@MicronautTest(environments = "integration", transactional = false)
class TransactionTestSpec extends Specification{
    Logger log = LoggerFactory.getLogger(TransactionTestSpec.class)

    @Inject
    DataSource defaultDatasource
    @Inject @Named("event-publisher")
    DataSource eventingDatasource

    def setup(){
        log.info("setup ***********************")
    }

    def cleanup(){
        log.info("cleanup ***********************")
    }

    def "simple test"(){
        log.info("Starting test 111111")
        given:
        def str = 1
        when:
        str =2
        then:
        str == 2
        log.info("ending test 111111")
    }


    def "simple test 2"(){
        log.info("Starting test 22222222")
        given:
        def str = 1
        when:
        str =2
        then:
        str == 2
        log.info("ending test 22222222")
    }


}
