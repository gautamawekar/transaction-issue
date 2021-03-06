package transaction.issue

import io.micronaut.test.extensions.spock.annotation.MicronautTest
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import spock.lang.Specification

@MicronautTest
class TransactionTestSpec extends Specification {
    Logger log = LoggerFactory.getLogger(TransactionTestSpec.class)

    def setup() {
        log.info("setup ***********************")
    }

    def cleanup() {
        log.info("cleanup ***********************")
    }

    def "simple test 1"() {
        log.info("Starting test 111111")
        given:
        def str = 1
        when:
        str = 2
        then:
        str == 2
        log.info("ending test 111111")
    }


    def "simple test 2"() {
        log.info("Starting test 22222222")
        given:
        def str = 1
        when:
        str = 2
        then:
        str == 2
        log.info("ending test 22222222")
    }


}
