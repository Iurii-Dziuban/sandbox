import spock.lang.Specification

class ExceptionsVerificationSpec extends Specification {

    def "NullPointerException expected"() {
        when:
        new ArrayList<String>()[0].length()

        then:
        thrown(NullPointerException)
    }

    def "verifying exception"() {
        when:
        throw new Exception("My exception!")

        then:
        Exception e = thrown()
        e.message == "My exception!"
    }

    def "no exception thrown expected"() {
        setup:
        def map = new HashMap()

        when:
        map.put(null, "element")

        then:
        notThrown(NullPointerException)
    }
}
